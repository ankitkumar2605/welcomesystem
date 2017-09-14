package com.ttn.welcomesystem.lifeexpectancy.api;

import com.ttn.welcomesystem.lifeexpectancy.model.LifeExpectancy;
import com.ttn.welcomesystem.lifeexpectancy.model.RemainingLifeExpectancy;

import retrofit2.http.GET;
import rx.Observable;

public interface ILifeExpectancyApi {
    @GET("life-expectancy/remaining/male/United%20Kingdom/2001-05-11/49y2m/")
    Observable<RemainingLifeExpectancy> getRemainingLifeExpectancy();

    @GET("life-expectancy/total/male/United%20Kingdom/1952-03-11/")
    Observable<LifeExpectancy> getTotalLifeExpectancy();

}
