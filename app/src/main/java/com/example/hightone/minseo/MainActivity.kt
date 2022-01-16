package com.example.hightone.minseo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.hightone.R

class MainActivity : AppCompatActivity() {
    private var btn_go_page : TextView ?= null
    private var btn_share_page : ConstraintLayout ?= null
    private var btn_write_page : ConstraintLayout ?= null
    private var tv_good1 : TextView?=null
    private var tv_hope1 : TextView?=null
    private var pencil : ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var exText1 : String? = intent.getStringExtra("문자")
        var exText2 : String? = intent.getStringExtra("문자2")
//        tv_good1!!.setText(exText2)
//        tv_hope1!!.setText(exText1)

        tv_good1 = findViewById(R.id.tv_ex1)
        tv_hope1 = findViewById(R.id.tv_ex2)
        btn_go_page = findViewById(R.id.write_friend)
        btn_share_page = findViewById(R.id.friendship_page)
        btn_write_page = findViewById(R.id.friendrecords_page)
        pencil = findViewById(R.id.im_pencil)

        btn_write_page!!.setOnClickListener {
            val intent = Intent(this, RecordStartActivity::class.java)
            startActivity(intent)
        }

        btn_share_page!!.setOnClickListener {
            val intent = Intent(this, SharePageActivity::class.java)
            startActivity(intent)
        }

        btn_go_page!!.setOnClickListener {
            val intent = Intent(this, RecordsActivity::class.java)
            intent.putExtra("문자", exText1!!.toString())
            intent.putExtra("문자2", exText2!!.toString())
            startActivity(intent)
        }

        pencil!!.setOnClickListener {
            val intent = Intent(this, FakeActivity::class.java)
            startActivity(intent)
        }
    }
}