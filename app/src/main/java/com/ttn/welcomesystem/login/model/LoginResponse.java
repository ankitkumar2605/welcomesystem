package com.ttn.welcomesystem.login.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ttn.welcomesystem.base.BaseResponse;

public class LoginResponse extends BaseResponse {
    @SerializedName("access_token")
    @Expose
    public String access_token;

    @SerializedName("token_type")
    @Expose
    public String token_type;

    @SerializedName("refresh_token")
    @Expose
    public String refresh_token;

    @SerializedName("expires_in")
    @Expose
    public String expires_in;

    @SerializedName("scope")
    @Expose
    public String scope;



}
