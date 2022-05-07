package com.example.faithsendmoneyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sendMoney : AppCompatActivity() {
    lateinit var btnCancel: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_money)
        btnCancel=findViewById(R.id.btnCancel)
        btnCancel.setOnClickListener {
            val intent= Intent(this,btnCancel::class.java)
            startActivity(intent)
        }
    }
}