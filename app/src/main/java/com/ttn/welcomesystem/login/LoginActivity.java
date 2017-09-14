package com.ttn.welcomesystem.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.ttn.welcomesystem.R;
import com.ttn.welcomesystem.base.BaseActivity;
import com.ttn.welcomesystem.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity<LoginViewModel, ActivityLoginBinding> implements ILoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel(DataBindingUtil.setContentView(this,R.layout.activity_login), new LoginViewModel(this));
        getViewDataBinding().setViewModel(getViewModel());
    }


    @Override
    public void showMessage(String msg) {

    }
}
