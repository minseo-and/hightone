package com.example.hightone.minseo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.hightone.R

class DoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)
        var exText1 : String? = intent.getStringExtra("문자")
        var exText2 : String? = intent.getStringExtra("문자2")

        val handler = Handler()
        handler.postDelayed({
            val intent2 = Intent(this, RecordsActivity::class.java)
            intent2.putExtra("문자", exText1!!.toString())
            intent2.putExtra("문자2", exText2!!.toString())
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("문자", exText1!!.toString())
            intent.putExtra("문자2", exText2!!.toString())
            startActivity(intent)
            finish()
        }, 1000)
    }
}