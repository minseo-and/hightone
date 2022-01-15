package com.example.hightone.minseo

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import com.example.hightone.R
import android.text.Editable

import android.text.TextWatcher
import android.widget.Button


class HopeActivity : AppCompatActivity() {
    private var et_write: EditText? = null
    private var tv_length: TextView? = null
    private var btn_skip_2 : Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hope)

        et_write = findViewById(R.id.et_hope)
        tv_length = findViewById(R.id.tv_length)
        btn_skip_2 = findViewById(R.id.btn_skip_2)

        val input_2: String = et_write!!.text.toString()

        btn_skip_2!!.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        btn_skip_2!!.setOnClickListener {
            val intent2 = Intent(this, RecordsActivity::class.java)
            intent2.putExtra("문자2", input_2)

        }

        et_write!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val input: Int = et_write!!.length()

                if (input >= 301){
                    tv_length!!.setText(input.toString() + " /300")
                    tv_length!!.setTextColor(Color.parseColor("#DD6363"))

                } else {
                    tv_length!!.setText(input.toString() + " /300")
                    tv_length!!.setTextColor(Color.parseColor("#000000"))
                }

            }
            override fun afterTextChanged(s: Editable) {

            }
        })
    }
}