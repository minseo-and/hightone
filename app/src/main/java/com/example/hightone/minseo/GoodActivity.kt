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
    private var tv_good : TextView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_good)

        et_write = findViewById(R.id.et_hope_2)
        tv_length = findViewById(R.id.tv_length)
        btn_done = findViewById(R.id.btn_done)
        tv_good = findViewById(R.id.tv_ex)
        var exText1 : String? = intent.getStringExtra("문자")
        tv_good!!.setText(exText1)

        btn_done!!.setOnClickListener {
            val intent = Intent(this, Nickname::class.java)
            intent.putExtra("문자", tv_good!!.text.toString())
            intent.putExtra("문자2", et_write!!.text.toString())
            startActivity(intent)
            finish()

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
