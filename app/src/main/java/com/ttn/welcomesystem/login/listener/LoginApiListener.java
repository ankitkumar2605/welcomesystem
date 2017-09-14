package com.ttn.welcomesystem.login.listener;

import com.ttn.welcomesystem.common.AppConstant;
import com.ttn.welcomesystem.login.LoginViewModel;
import com.ttn.welcomesystem.login.api.ILoginApi;
import com.ttn.welcomesystem.login.model.LoginResponse;

import olabs.kit.rxnetworx.RetroError;
import olabs.kit.rxnetworx.RxCallbackManager;
import rx.android.schedulers.AndroidSchedulers;


public class LoginApiListener extends RxCallbackManager {

    LoginViewModel loginViewModel;



    public LoginApiListener(LoginViewModel loginViewModel) {

        super(AndroidSchedulers.mainThread(),loginViewModel.getBaseUrl(), loginViewModel.getHeaderConfiguration());
        this.loginViewModel = loginViewModel;
    }

    public void doLogin(String userName,String password){
       ILoginApi mLoginAPI = (ILoginApi) getServiceClient(AppConstant.IS_HEADER_UPDATE, ILoginApi.class);
        initiateApiCall(mLoginAPI.doLogin("password",userName,password));

    }


    @Override
    public void onError(RetroError retroError) {
        loginViewModel.onLoginError();

    }

    @Override
    public void onSuccess(Object o) {
        if(o instanceof LoginResponse)
            loginViewModel.onLoginSuccess();

    }
}
