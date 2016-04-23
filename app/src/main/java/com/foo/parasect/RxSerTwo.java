package com.foo.parasect;

import com.foo.thrift.*;
import java.util.List;
import java.util.Map;

import rx.Observable;

/**
 * Description : DON'T EDIT IF UNNECESSARY !
 *
 * @author Parasect.jar  Sat Apr 23 12:00:59 CST 2016.
 */
public class RxSerTwo {

    /**
     * 请求查询
     * 
     * @param query 查询条件
     */
    public static Observable<List<SearchResult>> search(Query query) {
        RxThrift ts = new RxThrift();
        return ts.toObservable(ts.sub4SerTwo(client -> {
            return client.search(query);
        }));
    }


}