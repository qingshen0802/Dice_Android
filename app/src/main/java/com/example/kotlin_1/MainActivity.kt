package com.example.kotlin_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dic = Dic(8)

        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textview)
        val textView2: TextView = findViewById(R.id.textview2);
        val lucky = 7
//        val fla:
        button.setOnClickListener {
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
            val result = dic.rollDic()
            textView.text = "$result"
            textView2.text = "You're Unlucky"
            when (result) {
                lucky -> textView2.text = "You're Lucky"
            }
        }
    }
}