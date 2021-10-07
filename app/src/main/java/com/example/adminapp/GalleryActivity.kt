package com.example.adminapp

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        val si = findViewById<ImageView>(R.id.set_image)
        // get reference to ImageView
        val f1 = findViewById<ImageView>(R.id.f1)
        f1.setOnClickListener {
        si.setImageResource(R.drawable.f1)
        }
        val f2 = findViewById<ImageView>(R.id.f2)
        f2.setOnClickListener {
            si.setImageResource(R.drawable.f2)
        }
        val f3= findViewById<ImageView>(R.id.f3)
        f3.setOnClickListener {
            si.setImageResource(R.drawable.f3)
        }
        val f4 = findViewById<ImageView>(R.id.f4)
        f4.setOnClickListener {
            si.setImageResource(R.drawable.f4)
        }
        val f5 = findViewById<ImageView>(R.id.f5)
        f5.setOnClickListener {
            si.setImageResource(R.drawable.f5)
        }
        val f6 = findViewById<ImageView>(R.id.f6)
        f6.setOnClickListener {
            si.setImageResource(R.drawable.f6)
        }
        val f7 = findViewById<ImageView>(R.id.f7)
        f7.setOnClickListener {
            si.setImageResource(R.drawable.f7)
        }
        val f8= findViewById<ImageView>(R.id.f8)
        f8.setOnClickListener {
            si.setImageResource(R.drawable.f8)
        }
        val ga1= findViewById<ImageView>(R.id.ga1)
        ga1.setOnClickListener {
            si.setImageResource(R.drawable.ga1)
        }
        val ga2 = findViewById<ImageView>(R.id.ga2)
        ga2.setOnClickListener {
            si.setImageResource(R.drawable.ga2)
        }
        val g3 = findViewById<ImageView>(R.id.ga3)
        g3.setOnClickListener {
            si.setImageResource(R.drawable.ga3)
        }
        val g4 = findViewById<ImageView>(R.id.ga4)
        g4.setOnClickListener {
            si.setImageResource(R.drawable.ga4)
        }
        val g5 = findViewById<ImageView>(R.id.ga5)
       g5.setOnClickListener {
           si.setImageResource(R.drawable.ga5)
        }
        val g6 = findViewById<ImageView>(R.id.ga6)
       g6.setOnClickListener {
           si.setImageResource(R.drawable.ga6)
        }
        val g7= findViewById<ImageView>(R.id.ga7)
        g7.setOnClickListener {
            si.setImageResource(R.drawable.ga7)
        }
        val g8 = findViewById<ImageView>(R.id.ga8)
        g8.setOnClickListener {
            si.setImageResource(R.drawable.ga8)
        }
        val g9 = findViewById<ImageView>(R.id.ga9)
        g9.setOnClickListener {
            si.setImageResource(R.drawable.ga9)
        }
    }
}