package com.example.hightone.minseo

import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.PopupWindow
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.example.hightone.R

class FakeActivity : AppCompatActivity() {
    private var tv_pop: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fake)

        tv_pop = findViewById(R.id.tv_back)
        tv_pop!!.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}