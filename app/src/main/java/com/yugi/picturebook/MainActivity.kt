package com.yugi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnWelcome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnWelcome = findViewById(R.id.btnWelcome)
        btnWelcome.setOnClickListener {
            val intent = Intent(this, BedsActivity::class.java)
            startActivity(intent)
        }
    }
}