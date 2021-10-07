package com.example.adminapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.net.URLConnection

class announcement : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_announcement)
        val a1 = findViewById<TextView>(R.id.an1)
        a1.setMovementMethod(LinkMovementMethod.getInstance())
        val a2 = findViewById<TextView>(R.id.an1)
        a2.setMovementMethod(LinkMovementMethod.getInstance())
        val a3 = findViewById<TextView>(R.id.an1)
        a3.setMovementMethod(LinkMovementMethod.getInstance())
        val a4 = findViewById<TextView>(R.id.an1)
        a4.setMovementMethod(LinkMovementMethod.getInstance())
        val a5 = findViewById<TextView>(R.id.an1)
        a5.setMovementMethod(LinkMovementMethod.getInstance())
        val a6 = findViewById<TextView>(R.id.an1)
        a6.setMovementMethod(LinkMovementMethod.getInstance())
        val a7 = findViewById<TextView>(R.id.an1)
        a7.setMovementMethod(LinkMovementMethod.getInstance())
        val a8 = findViewById<TextView>(R.id.an8)
        a8.setMovementMethod(LinkMovementMethod.getInstance())

    }




}