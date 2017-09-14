package com.ttn.welcomesystem.login;

import android.databinding.ObservableField;

import com.ttn.welcomesystem.base.BaseViewModel;
import com.ttn.welcomesystem.login.listener.LoginApiListener;

public class LoginViewModel extends BaseViewModel {
    ILoginView mILoginView;
    public ObservableField<String> userId;
    public ObservableField<String> password;
    LoginApiListener mLoginApiListener;

    public LoginViewModel(ILoginView mILoginView) {
        super(mILoginView);
        this.mILoginView = mILoginView;
        userId = new ObservableField<>();
        password = new ObservableField<>();
        mLoginApiListener = new LoginApiListener(this);
    }

    public void onLoginClick() {
        mLoginApiListener.doLogin(userId.get(),password.get());
    }

    public void onLoginSuccess() {
        userId.set("yes");
    }

    public void onLoginError() {
        userId.set("no");
    }


}
