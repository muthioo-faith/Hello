package com.example.faithsendmoneyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var etsendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etsendMoney=findViewById(R.id.etsendMoney)
        etsendMoney.setOnClickListener {
            val intent= Intent(this,sendMoney::class.java)
            startActivity(intent)
        }
    }
}