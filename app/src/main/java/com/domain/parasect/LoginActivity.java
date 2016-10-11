package com.domain.parasect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.domain.parasect.iface.LoginP;
import com.domain.parasect.iface.LoginV;
import com.domain.parasect.util.MD5;


public class LoginActivity extends AppCompatActivity implements LoginV {

    LoginP loginP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginP = new LoginPresenter(this);
    }

    /**
     * handle login button click
     * @param view login button
     */
    public void login(View view) {
        String host = ((EditText) findViewById(R.id.et_host)).getText().toString();
        int port = Integer.valueOf(((EditText) findViewById(R.id.et_port)).getText().toString());
        String username = ((EditText) findViewById(R.id.et_username)).getText().toString();
        //String password = MD5.md5(((EditText) findViewById(R.id.et_password)).getText().toString());
        String password = ((EditText) findViewById(R.id.et_password)).getText().toString();
        loginP.login(host, port, username, password);
    }


    @Override
    public void loginSuccess(String info) {
        Toast.makeText(this,info,Toast.LENGTH_SHORT).show();
        // TODO: 4/21/2016 switch activity
    }

    @Override
    public void loginFailed(String errorInfo) {
        Toast.makeText(this,errorInfo, Toast.LENGTH_SHORT).show();
    }
}
