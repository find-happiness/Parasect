package ${pkg};

import ${imPkg}.*;
import java.util.List;
import java.util.Map;

import rx.Observable;

/**
 * Description : DON'T EDIT IF UNNECESSARY !
 *
 * @author ${author}  ${date}.
 */
public class ${className} {

    <#list thriftMethodList as tm>
    ${tm.comment}
    public static Observable<${tm.retType}> ${tm.method}(${tm.params}) {
        RxThrift ts = new RxThrift();
        return ts.toObservable(ts.sub4${service}(client -> {
        <#if tm.retType == "Void">
            client.${tm.method}(${tm.args});
            return null;
        <#else>
            return client.${tm.method}(${tm.args});
        </#if>
        }));
    }

    </#list>

}