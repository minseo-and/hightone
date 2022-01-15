package com.example.hightone.minseo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.hightone.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var email_check= findViewById<Button>(R.id.email_check)
        var Email = findViewById<EditText>(R.id.Edit_SignUp_Email)

        var retrofit = Retrofit.Builder()
            .baseUrl("http://25.56.104.86:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var server = retrofit.create(ServiceApi::class.java)

        email_check.setOnClickListener{
            server.postRequest("Email").enqueue(object : Callback<ResponseEmail>{
                override fun onResponse(
                    call: Call<ResponseEmail>,
                    response: Response<ResponseEmail>
                ) {

                }

                override fun onFailure(call: Call<ResponseEmail>, t: Throwable) {
                }
            })
        }

    }
}

