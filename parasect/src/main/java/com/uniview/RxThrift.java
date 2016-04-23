/**
 * Name： com.uniview
 * Copyright： (c) 2015, Uniview Tech, RD IMOS. All rights reserved.
 */
package com.uniview;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

/**
 * Description :
 *
 * @author T02452 on 4/21/2016.
 * @see
 */
public class RxThrift {

    private static final String FREEMARKER_VERSION = "2.3.20";
    private static final String TEMPLATE_DIR_PATH = "parasect";
    private static final String TEMPLATE_NAME = "RxThrift.ftl";
    private static final String ENCODING = "UTF-8";
    // the name of output file
    private static final String FILE_NAME = "RxThrift.java";

    public static void generateRxThrift(List<String> serviceList, File tailDir,
                                        String tailPkgName, String thriftPkg) throws Exception {
        // init
        Configuration cfg = new Configuration(new Version(FREEMARKER_VERSION));
        cfg.setDirectoryForTemplateLoading(new File(TEMPLATE_DIR_PATH));
        cfg.setDefaultEncoding(ENCODING);
        cfg.setLocale(Locale.CHINA);
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        // set data
        Map<String, Object> map = new HashMap<>();
        map.put("pkg", tailPkgName);
        map.put("thriftPkg", thriftPkg);
        map.put("author", "Parasect.jar");
        map.put("date", (new Date()).toString());
        map.put("className", FILE_NAME.replace(".java",""));
        map.put("services", serviceList);

        //write output into a file:
        Template template = cfg.getTemplate(TEMPLATE_NAME);
        Writer fileWriter = new FileWriter(new File(tailDir, FILE_NAME));
        template.process(map, fileWriter);
        fileWriter.close();
    }


}
