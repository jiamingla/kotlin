package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButton: RadioButton
    private lateinit var radioButton2: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById<Button>(R.id.button1)
        radioButton = findViewById<RadioButton>(R.id.radiobutton)
        radioButton2 = findViewById<RadioButton>(R.id.radiobutton2)
        radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        button1.setOnClickListener(mListener1)
    }

    var mListener1 = View.OnClickListener {
        val radioG: RadioButton =
            findViewById(radioGroup.checkedRadioButtonId)
        val radioid = radioGroup.checkedRadioButtonId
        val cost = if(radioGroup.checkedRadioButtonId == radioButton.id) 50 else 30
        val intent = Intent()
        intent.setClass(this, MainActivity2::class.java)
        //宣告意圖，透過Intent從MainActivity切換到Main2Activity
        intent.putExtra("drink", radioG.text.toString())
        intent.putExtra("cost", cost)
        //intent.putExtra("money",radioid)
        //藉由Intent夾帶資料到新頁面
        startActivity(intent)
    }

}
