package com.example.fantasticten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ganti_Sandi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ganti_sandi)

        findViewById<Button>(R.id.gantiSanMas).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}