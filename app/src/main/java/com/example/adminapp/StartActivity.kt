package com.example.adminapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }
    fun letsgo(view: android.view.View) {
        val intent= Intent(this,HomeActivity::class.java)
        startActivity(intent)

    }
}