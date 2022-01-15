package com.example.hightone.minseo

import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class SignUpActivity : AppCompatActivity() {

    var retrofit = Retrofit.Builder()
        .baseUrl("25.56.104.86:8080")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var serviceApi : ServiceApi = retrofit.create(ServiceApi::class.java)

    
}