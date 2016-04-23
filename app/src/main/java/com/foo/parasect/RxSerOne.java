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
public class RxSerOne {

    /**
     * 用户登录， 返回登录信息 json 格式 [ 含登录结果， APP 的最新版本信息等 ]
     * 
     * @param nickname 用户名
     * 
     * @param password 用户密码 MD5
     */
    public static Observable<String> login(String nickname, String password) {
        RxThrift ts = new RxThrift();
        return ts.toObservable(ts.sub4SerOne(client -> {
            return client.login(nickname, password);
        }));
    }

    /**
     * 用户退出
     * 
     * @param userSession 会话信息
     */
    public static Observable<String> logout(String userSession) {
        RxThrift ts = new RxThrift();
        return ts.toObservable(ts.sub4SerOne(client -> {
            return client.logout(RxThrift.ber4SerOne.session);
        }));
    }


}