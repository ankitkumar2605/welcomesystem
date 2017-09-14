package com.ttn.welcomesystem.lifeexpectancy;

import android.databinding.ObservableField;

import com.ttn.welcomesystem.base.BaseViewModel;
import com.ttn.welcomesystem.lifeexpectancy.listener.LifeExpectancyApiListener;
import com.ttn.welcomesystem.lifeexpectancy.model.CombineLifeExpectancy;

public class LifeExpectancyViewModel extends BaseViewModel {
    ILifeExpectancyView mILifeExpectancyView;
    public ObservableField<String> totalLifeExpectancy;
    public ObservableField<String> remainingLifeExpectancy;
    LifeExpectancyApiListener mLifeExpectancyApiListener;

    public LifeExpectancyViewModel(ILifeExpectancyView mILifeExpectancyView) {
        super(mILifeExpectancyView);
        totalLifeExpectancy = new ObservableField<>();
        remainingLifeExpectancy = new ObservableField<>();
        mLifeExpectancyApiListener = new LifeExpectancyApiListener(this);
    }

    public void getLifeExpectancy(){
        mLifeExpectancyApiListener.getLifeExpectancy();

    }

    public void onSuccessLifeExpectancy(CombineLifeExpectancy combineLifeExpectancy){
        totalLifeExpectancy.set(combineLifeExpectancy.lifeExpectancy.totalLifeExpectancy.toString());
        remainingLifeExpectancy.set(combineLifeExpectancy.remainingLifeExpectancy.remainingLifeExpectancy.toString());

    }

}
