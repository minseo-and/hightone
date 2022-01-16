package com.example.hightone.minseo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hightone.R

class SignInMainActivity : AppCompatActivity() {
    private var btn_signin : Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_main)
        btn_signin = findViewById(R.id.signIn_Btn)
        btn_signin!!.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}