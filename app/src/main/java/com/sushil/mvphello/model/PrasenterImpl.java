package com.sushil.mvphello.model;

import android.text.TextUtils;

import com.sushil.mvphello.prasenter.LoginPrasenter;
import com.sushil.mvphello.view.LoginView;

/**
 * Created by sushil on 1/3/18.
 */

public class PrasenterImpl implements LoginPrasenter {


    LoginView mLoginView;

    public PrasenterImpl(LoginView loginView) {
        this.mLoginView = loginView;


    }

    @Override
    public void performLogin(String userName, String password) {


        if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(password)) {
            mLoginView.loginValidations();
        } else {
            if (userName.equals("Sushil") && password.equals("Sushil")) {
                mLoginView.loginSuccess();
            } else {
                mLoginView.loginError();
            }
        }
    }
}
