package com.ttn.welcomesystem.login.api;

import com.ttn.welcomesystem.lifeexpectancy.model.LifeExpectancy;
import com.ttn.welcomesystem.login.model.LoginResponse;
import com.ttn.welcomesystem.lifeexpectancy.model.RemainingLifeExpectancy;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface ILoginApi {
    @FormUrlEncoded
    @POST("v1/oauth/token")
    Observable<LoginResponse> doLogin(@Field("grant_type") String grantType, @Field("username") String userID, @Field("password") String password);

    @GET("life-expectancy/remaining/male/United%20Kingdom/2001-05-11/49y2m/")
    Observable<RemainingLifeExpectancy> getRemainingLifeExpectancy();

    @GET("life-expectancy/total/male/United%20Kingdom/1952-03-11/")
    Observable<LifeExpectancy> getTotalLifeExpectancy();

}
