package com.example.adminapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onIMG(view: android.view.View) {
        val intent= Intent(this,GalleryActivity::class.java)
       startActivity(intent)

    }
    fun onClickHome(view: android.view.View) {
        val intent= Intent(this,announcement::class.java)
        startActivity(intent)

    }
    fun openmap(view: android.view.View) {
        val intent= Intent(this,MapsActivity::class.java)
        startActivity(intent)

    }
    fun callFac(view: android.view.View) {
        val intent= Intent(this,FacultieActivity::class.java)
        startActivity(intent)

    }

    fun getRank(view: android.view.View) {
        val intent= Intent(this,RankActivity::class.java)
        startActivity(intent)
    }

    fun callCon(view: android.view.View) {
        val intent= Intent(this,ContactActivity::class.java)
        startActivity(intent)
    }

}