package com.example.hightone.minseo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hightone.R
import android.content.SharedPreferences

import android.app.Activity




class RecordsActivity : AppCompatActivity() {
    private var tv_good: TextView? = null
    private var tv_hope: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_records)

        tv_good = findViewById(R.id.tv_answer_write)
        tv_hope = findViewById(R.id.tv_answer_hope)
        var exText1: String? = intent.getStringExtra("문자")
        var exText2: String? = intent.getStringExtra("문자2")
        tv_good!!.setText(exText2)
        tv_hope!!.setText(exText1)

        val pref = getSharedPreferences("pref", MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString("text", exText1)
        editor.putString("textw", exText2)
        editor.commit()


    }

}

