package com.example.hightone.minseo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.hightone.R

class Nickname : AppCompatActivity() {
    private var btn_check : Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nickname)

        btn_check = findViewById(R.id.btn_check)

        var exText1 : String? = intent.getStringExtra("문자")
        var exText2 : String? = intent.getStringExtra("문자2")

        btn_check!!.setOnClickListener {
            val intent = Intent(this, DoneActivity::class.java)
            intent.putExtra("문자", exText1!!.toString())
            intent.putExtra("문자2", exText2!!.toString())
            startActivity(intent)
        }
    }
}