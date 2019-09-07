package com.example.aliapp;


import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface ServicesApi {

    @GET("GetbyID/6")
    Call<ProfileResponse> getAllMessages();
}
