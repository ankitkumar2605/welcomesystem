package com.ttn.welcomesystem.login.model;

import com.ttn.welcomesystem.base.BaseResponse;

public class LoginCombinedResponse extends BaseResponse {

    public String response;
    public  LoginCombinedResponse(LoginResponse l1, LoginResponse l2){
        response = l1.access_token +"&&"+ l2.access_token;

    }

}
