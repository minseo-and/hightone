package com.example.hightone.minseo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hightone.R

class RecordStartActivity : AppCompatActivity() {
    private var btn_code : Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record_start)

        btn_code = findViewById(R.id.btn_code_check)
        btn_code!!.setOnClickListener {
            val intent = Intent(this, FriendshipRecordsActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}