package com.foo.parasect;

import com.foo.thrift.*;
import java.util.List;
import java.util.Map;

import rx.Observable;

/**
 * Description : DON'T EDIT IF UNNECESSARY !
 *
 * @author Parasect.jar  Tue Oct 11 17:15:56 CST 2016.
 */
public class RxUserService {

    
    public static Observable<LoginResponse> login(String username, String password) {
        RxThrift ts = new RxThrift();
        return ts.toObservable(ts.sub4UserService(client -> {
            return client.login(username, password);
        }));
    }


}