package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var button2: Button
    private lateinit var cups: EditText
    private lateinit var textView2: TextView
    var drink:String? = ""
    var cost:Int? = 0
    var cup :Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        intent?.extras?.let { //判斷Intent不為空，並檢查是否夾帶資料
            drink = it.getString("drink")
            cost = it.getInt("cost") //以key找到對應的資料並取出
        }

        cups = findViewById<EditText>(R.id.editNumber)
        button2 = findViewById<Button>(R.id.button2)
        textView2 = findViewById<TextView>(R.id.textView2)
        textView2.text = "您剛才點的是 "+ drink+",\n 請輸入數量"
        button2.setOnClickListener(mListener2)
    }
    var mListener2 = View.OnClickListener {
        cup = if(cups.text.toString().trim().isEmpty() || null == cups.text.toString()) 0 else  cups.text.toString().toInt()
        val intent = Intent()
        intent.setClass(this, MainActivity3::class.java)
        intent.putExtra("total", cost?.times(cup))
        startActivity(intent)
    }

}