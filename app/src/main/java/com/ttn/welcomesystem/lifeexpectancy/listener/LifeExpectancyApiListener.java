package com.ttn.welcomesystem.lifeexpectancy.listener;

import com.ttn.welcomesystem.common.AppConstant;
import com.ttn.welcomesystem.lifeexpectancy.LifeExpectancyViewModel;
import com.ttn.welcomesystem.lifeexpectancy.api.ILifeExpectancyApi;
import com.ttn.welcomesystem.lifeexpectancy.model.CombineLifeExpectancy;
import com.ttn.welcomesystem.lifeexpectancy.model.LifeExpectancy;
import com.ttn.welcomesystem.lifeexpectancy.model.RemainingLifeExpectancy;

import olabs.kit.rxnetworx.RetroError;
import olabs.kit.rxnetworx.RxCallbackManager;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;

public class LifeExpectancyApiListener extends RxCallbackManager {

    LifeExpectancyViewModel lifeExpectancyViewModel;

    public LifeExpectancyApiListener(LifeExpectancyViewModel lifeExpectancyViewModel) {
        super(AndroidSchedulers.mainThread(), lifeExpectancyViewModel.getBaseUrl(), lifeExpectancyViewModel.getHeaderConfiguration());
        this.lifeExpectancyViewModel = lifeExpectancyViewModel;
    }


    public void getLifeExpectancy() {
        ILifeExpectancyApi mILifeExpectancyApi = (ILifeExpectancyApi) getServiceClient(AppConstant.IS_HEADER_UPDATE, ILifeExpectancyApi.class);
        Observable<LifeExpectancy> ob1 = getAPIObservable(mILifeExpectancyApi.getTotalLifeExpectancy());
        Observable<RemainingLifeExpectancy> ob2 = getAPIObservable(mILifeExpectancyApi.getRemainingLifeExpectancy());
        Observable.zip(ob1, ob2, CombineLifeExpectancy::new)
                .subscribe(lifeExpectancyViewModel::onSuccessLifeExpectancy);
    }

    @Override
    public void onError(RetroError retroError) {

    }

    @Override
    public void onSuccess(Object o) {

    }
}
