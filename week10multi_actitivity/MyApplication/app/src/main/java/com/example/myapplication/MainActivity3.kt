package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private lateinit var textView3: TextView
    private lateinit var button3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        textView3 = findViewById<TextView>(R.id.textView3)
        button3 = findViewById<Button>(R.id.button3)
        intent?.extras?.let { //判斷Intent不為空，並檢查是否夾帶資料
            val data = it.getInt("total") //以key找到對應的資料並取出
            textView3.text = "總金額為$data 元"
        }
        button3.setOnClickListener(mListener3)
    }
    var mListener3 = View.OnClickListener {

        val intent = Intent()
        intent.setClass(this, MainActivity::class.java)
        startActivity(intent)
    }
}