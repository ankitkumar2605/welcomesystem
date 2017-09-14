package com.ttn.welcomesystem.lifeexpectancy;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.ttn.welcomesystem.R;
import com.ttn.welcomesystem.base.BaseActivity;
import com.ttn.welcomesystem.databinding.ActivityLifeExpectancyBinding;


public class LifeExpectancyActivity extends BaseActivity<LifeExpectancyViewModel, ActivityLifeExpectancyBinding> implements ILifeExpectancyView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel(DataBindingUtil.setContentView(this, R.layout.activity_life_expectancy), new LifeExpectancyViewModel(this));
        getViewDataBinding().setViewModel(getViewModel());
        getViewModel().getLifeExpectancy();
    }


    @Override
    public void showMessage(String msg) {

    }

}
