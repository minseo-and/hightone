package com.example.hightone.minseo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hightone.R

class RecordsActivity : AppCompatActivity() {
    private var tv_good : TextView ?= null
    private var tv_hope : TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_records)

        tv_good = findViewById(R.id.tv_answer_write)
        tv_hope = findViewById(R.id.tv_answer_hope)


    }
}