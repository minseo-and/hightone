package com.example.hightone.minseo

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import com.example.hightone.R

class FriendshipRecordsActivity : AppCompatActivity() {


    private var choice_1 = 0
    private var choice_2 = 0
    private var choice_3 = 0
    private var choice_4 = 0
    private var choice_5 = 0
    private var max = 3
    private var btn_skip : Button?= null
    private var tv_choice_1: Button? = null
    private var tv_choice_2: TextView? = null
    private var tv_choice_3: TextView? = null
    private var tv_choice_4: TextView? = null
    private var tv_choice_5: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friendship_records)

        tv_choice_1 = findViewById(R.id.btn_choice_1)
        tv_choice_2 = findViewById(R.id.btn_choice_2)
        tv_choice_3 = findViewById(R.id.btn_choice_3)
        tv_choice_4 = findViewById(R.id.btn_choice_4)
        tv_choice_5 = findViewById(R.id.btn_choice_5)

        btn_skip = findViewById(R.id.btn_skip)
        btn_skip!!.setOnClickListener {
            val intent = Intent(this, HopeActivity::class.java)
            startActivity(intent)
        }

       if (max<=3){
           tv_choice_1?.setOnClickListener {
               choice_1++
               if (choice_1 % 2 == 0) {
                   tv_choice_1?.setTextColor(Color.parseColor("#A1A1A1"))
                   tv_choice_1?.setBackgroundResource(R.drawable.choice_btn1)
                   max++
               } else {
                   tv_choice_1?.setTextColor(Color.parseColor("#000000"))
                   tv_choice_1?.setBackgroundResource(R.drawable.choice_btn2)
                   max--
               }
           }

           tv_choice_2?.setOnClickListener {
               choice_2++
               if (choice_2 % 2 == 0) {
                   tv_choice_2?.setTextColor(Color.parseColor("#A1A1A1"))
                   tv_choice_2?.setBackgroundResource(R.drawable.choice_btn1)
                   max++
               } else {
                   tv_choice_2?.setTextColor(Color.parseColor("#000000"))
                   tv_choice_2?.setBackgroundResource(R.drawable.choice_btn2)
                   max--
               }
           }

           tv_choice_3?.setOnClickListener {
               choice_3++
               if (choice_3 % 2 == 0) {
                   tv_choice_3?.setTextColor(Color.parseColor("#A1A1A1"))
                   tv_choice_3?.setBackgroundResource(R.drawable.choice_btn1)
                   max++
               } else {
                   tv_choice_3?.setTextColor(Color.parseColor("#000000"))
                   tv_choice_3?.setBackgroundResource(R.drawable.choice_btn2)
                   max--
               }
           }

           tv_choice_4?.setOnClickListener {
               choice_4++
               if (choice_4 % 2 == 0) {
                   tv_choice_4?.setTextColor(Color.parseColor("#A1A1A1"))
                   tv_choice_4?.setBackgroundResource(R.drawable.choice_btn1)
                   max++
               } else {
                   tv_choice_4?.setTextColor(Color.parseColor("#000000"))
                   tv_choice_4?.setBackgroundResource(R.drawable.choice_btn2)
                   max--
               }
           }

           tv_choice_5?.setOnClickListener {
               choice_5++
               if (choice_5 % 2 == 0) {
                   tv_choice_5?.setTextColor(Color.parseColor("#A1A1A1"))
                   tv_choice_5?.setBackgroundResource(R.drawable.choice_btn1)
                   max++
               } else {
                   tv_choice_5?.setTextColor(Color.parseColor("#000000"))
                   tv_choice_5?.setBackgroundResource(R.drawable.choice_btn2)
                   max--
               }
           }
       }
    }
}