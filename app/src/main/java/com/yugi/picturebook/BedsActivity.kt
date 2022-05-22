package com.yugi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BedsActivity : AppCompatActivity() {
    lateinit var btnBack1:Button
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beds)

        btnBack1 = findViewById(R.id.btnBack1)
        btnBack1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnNext1= findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            val intent = Intent(this, SofaAvtivity::class.java)
            startActivity(intent)
        }
    }
}