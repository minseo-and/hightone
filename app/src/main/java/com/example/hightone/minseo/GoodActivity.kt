package com.example.hightone.minseo

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.hightone.R

class GoodActivity : AppCompatActivity() {
    private var et_write: EditText? = null
    private var tv_length: TextView? = null
    private var btn_done: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_good)

        et_write = findViewById(R.id.et_hope_2)
        tv_length = findViewById(R.id.tv_length)
        btn_done = findViewById(R.id.btn_done)

        val input_2: String = et_write!!.text.toString()

        btn_done!!.setOnClickListener {
            val intent = Intent(this, HopeActivity::class.java)
            startActivity(intent)

        }

        btn_done!!.setOnClickListener {
            val intent2 = Intent(this, RecordsActivity::class.java)
            intent2.putExtra("문자1", input_2)


        }

        et_write!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val input: Int = et_write!!.length()

                if (input >= 301) {
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
}