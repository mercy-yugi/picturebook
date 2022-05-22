package com.yugi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KitchenActivivty : AppCompatActivity() {
    lateinit var btnBack4: Button
    lateinit var btnNext4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kitchen_activivty)

        btnBack4 = findViewById(R.id.btnBack4)
        btnBack4.setOnClickListener {
            val intent = Intent(this, DinningActivity::class.java)
            startActivity(intent)
        }
        btnNext4 = findViewById(R.id.btnNext3)
        btnNext4.setOnClickListener {
            val intent = Intent(this, OutdoorActivity::class.java)
            startActivity(intent)
        }
    }
}