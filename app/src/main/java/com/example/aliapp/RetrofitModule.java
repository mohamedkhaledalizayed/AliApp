package com.example.aliapp;

import android.app.Application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitModule {
    private Cache cache;
    private Gson gson;
    private OkHttpClient okHttpClient;
    private Retrofit retrofit ;
    private Application context;
    private static RetrofitModule ourInstance;
    private ServicesApi service;

    public static void intialize(Application context) {
        ourInstance = new RetrofitModule(context);
    }

    public static RetrofitModule getInstance() {
        return ourInstance;
    }

    private RetrofitModule(Application appContext) {
        this.context = appContext;
        provideCache();
        provideGson();
        provideOkhttpClient();
        provideRetrofit();
        provideService();
    }

    void provideCache() {
        long cachSize = 10 * 1024 * 1024;
        try {
            File myDir = new File(context.getCacheDir(), "response");
            myDir.mkdir();
            cache = new Cache(myDir, cachSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        gson = gsonBuilder.setLenient().create();
    }
    void provideOkhttpClient(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG){
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        }
        okHttpClient = new OkHttpClient.Builder()
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();
    }
    void  provideRetrofit(){
        retrofit = new  Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(Constants.BASE_URL)
                .client(okHttpClient)
                .build();
    }
    void provideService(){
        service = retrofit.create(ServicesApi.class);
    }
    public ServicesApi getService(){
        return service;
    }

}
