package com.example.adminapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun getmain(view: android.view.View) {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)

    }
}