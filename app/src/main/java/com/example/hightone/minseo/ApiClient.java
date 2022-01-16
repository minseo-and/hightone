package com.example.hightone.minseo;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static ApiClient instance=null;


    private static String baseUrl = "http://54.180.98.98:8000";

    public static Retrofit getRetrofit(){

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://25.56.104.86:8080/")
                .build();

        return retrofit;
    }


}