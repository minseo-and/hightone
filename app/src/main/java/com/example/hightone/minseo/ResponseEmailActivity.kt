package com.example.hightone.minseo

import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.hightone.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ResponseEmailActivity : AppCompatActivity(){


    var retrofit = Retrofit.Builder()
        .baseUrl("http://25.56.104.86:8080")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var server : ServiceApi = retrofit.create(ServiceApi::class.java)



}
