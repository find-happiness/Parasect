package com.uniview;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

@SuppressWarnings("unchecked")
public class RxClient {

    public static List<ThriftMethod> thriftMethods = new ArrayList<>();
    public static String service = "";
    public static String thriftPkg = "";
    public static String parasectPkg = "";
    public static File parasectDir;

    public static void generate(File javaFile, String thriftPkg,
                                String parasectPkg, File parasectDir) throws Exception {

        thriftMethods.clear();
        service = javaFile.getName().replace(".java","");
        RxClient.thriftPkg = thriftPkg;
        RxClient.parasectPkg = parasectPkg;
        RxClient.parasectDir = parasectDir;

        CompilationUnit cu = JavaParser.parse(javaFile);
        new ClassOrInterfaceVisitor().visit(cu, null);
        output(thriftMethods, javaFile.getName());

    }

    private static class ClassOrInterfaceVisitor extends VoidVisitorAdapter {
        @Override
        public void visit(ClassOrInterfaceDeclaration n, Object arg) {
            if (n.getName().equals("Iface")) {
                new MethodVisitor().visit(n, null);
            }
            super.visit(n, arg);
        }
    }

    private static class MethodVisitor extends VoidVisitorAdapter {
        @Override
        public void visit(MethodDeclaration n, Object arg) {

            ThriftMethod thriftMethod = new ThriftMethod();

            // set comment
            String com = null == n.getComment() ? "" : n.getComment().toString();

            // omit last '\n'
            com = com.endsWith("\n") ? com.substring(0, com.length() - 1) : com;
            thriftMethod.setComment(com);

            // set method
            thriftMethod.setMethod(n.getName());

            // set params
            thriftMethod.setParams(n.getParameters().toString().replace("[", "").replace("]", ""));

            // set args
            List<Parameter> pList = n.getParameters();
            String args = "";
            if (null != pList && !pList.isEmpty()) {
                String firstArg = pList.get(0).getId().getName();
                if(firstArg.equals("userSession")){
                    pList.get(0).getId().setName(String.format("RxThrift.ber4%s.session",service));
                }
                for (Parameter p : pList) {
                    args = (args.equals("") ? "": args + ", ") + p.getId().getName();
                }
            }
            thriftMethod.setArgs(args);

            //set retType
            String retType = n.getType().toString();
            if (retType.equals("void")) {
                retType = "Void";
            }
            if (retType.equals("int")){
                retType = "Integer";
            }
            thriftMethod.setRetType(retType);

            thriftMethods.add(thriftMethod);

            super.visit(n, arg);
        }
    }

    public static void output(List<ThriftMethod> thriftMethods, String name) throws Exception {

        // init
        Configuration cfg = new Configuration(new Version("2.3.20"));
        cfg.setDirectoryForTemplateLoading(new File("parasect"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setLocale(Locale.CHINA);
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        // set data
        Map<String, Object> map = new HashMap<>();
        map.put("pkg", parasectPkg);
        map.put("imPkg", thriftPkg);
        map.put("author", "Parasect.jar");
        map.put("date", (new Date()).toString());
        map.put("className", ("Rx" + name).replace(".java", ""));
        map.put("service",name.replace(".java", ""));
        map.put("thriftMethodList", thriftMethods);

        //write output into a file:
        Template template = cfg.getTemplate("RxClient.ftl");
        Writer fileWriter = new FileWriter(new File(parasectDir, ("Rx" + name)));
        template.process(map, fileWriter);
        fileWriter.close();
    }
}