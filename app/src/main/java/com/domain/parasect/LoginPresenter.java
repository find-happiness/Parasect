package com.domain.parasect;

import android.util.Log;
import com.domain.parasect.iface.LoginP;
import com.domain.parasect.iface.LoginV;
import com.foo.parasect.RxThrift;
import com.foo.parasect.RxUserService;
import com.foo.thrift.LoginResponse;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Description : login presenter
 *
 * @author Ban on 4/21/2016.
 */
public class LoginPresenter implements LoginP {

  private final static String TAG = LoginPresenter.class.getSimpleName();
  private LoginV loginV;

  public LoginPresenter(LoginV loginV) {
    this.loginV = loginV;
  }

  @Override public void login(String host, int port, String username, String password) {
    //RxThrift.ber4SerOne = new RxThrift.Builder(host, port);
    //// TODO: 4/22/2016 show loading
    //RxSerOne.login(username, password)
    //        .map(str -> {
    //            // work thread
    //            Log.d(TAG, "MAIN THREAD ? " + String.valueOf(Looper.myLooper() == Looper.getMainLooper()));
    //            // TODO: 4/21/2016 save user info to config file
    //            // TODO: 4/21/2016 save result json info to config file
    //            return str;
    //        })
    //        .observeOn(AndroidSchedulers.mainThread())
    //        .subscribe(str -> {
    //            Log.d(TAG, str);
    //            loginV.loginSuccess(str);
    //        }, throwable -> {
    //            throwable.printStackTrace();
    //            loginV.loginFailed(throwable.toString());
    //        });

    RxThrift.ber4UserService = new RxThrift.Builder(host, port);

    RxUserService.login(username, password)
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Subscriber<LoginResponse>() {
          @Override public void onCompleted() {

          }

          @Override public void onError(Throwable throwable) {
            throwable.printStackTrace();
            loginV.loginFailed(throwable.toString());
          }

          @Override public void onNext(LoginResponse loginResponse) {
            if (loginResponse.getCode().equals("0000")) {

              Log.d(TAG, loginResponse.getMsg());
              loginV.loginSuccess(loginResponse.getMsg());
            } else if (loginResponse.getCode().equals("1000")) {
              loginV.loginFailed(loginResponse.getMsg());
            }
          }
        });
  }
}
