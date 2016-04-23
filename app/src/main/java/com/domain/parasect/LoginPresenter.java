/**
 * Name： com.uniview.thrifttail
 * Copyright： (c) 2015, Uniview Tech, RD IMOS. All rights reserved.
 */
package com.domain.parasect;

import android.os.Looper;
import android.util.Log;

import com.domain.parasect.iface.LoginP;
import com.domain.parasect.iface.LoginV;
import com.foo.parasect.RxSerOne;
import com.foo.parasect.RxThrift;

import rx.android.schedulers.AndroidSchedulers;

/**
 * Description : login presenter
 *
 * @author T02452 on 4/21/2016.
 */
public class LoginPresenter implements LoginP {

    private final static String TAG = LoginPresenter.class.getSimpleName();
    private LoginV loginV;

    public LoginPresenter(LoginV loginV) {
        this.loginV = loginV;
    }

    @Override
    public void login(String host, int port, String username, String password) {
        //RxThrift.ber4SerOne = new RxThrift.Builder(host, port);
        // TODO: 4/22/2016 show loading
        RxSerOne.login(username, password)
                .map(str -> {
                    // work thread
                    Log.d(TAG, "MAIN THREAD ? " + String.valueOf(Looper.myLooper() == Looper.getMainLooper()));
                    // TODO: 4/21/2016 save user info to config file
                    // TODO: 4/21/2016 save result json info to config file
                    return str;
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(str -> {
                    Log.d(TAG, str);
                    loginV.loginSuccess(str);
                }, throwable -> {
                    throwable.printStackTrace();
                    loginV.loginFailed(throwable.toString());
                });
    }
}
