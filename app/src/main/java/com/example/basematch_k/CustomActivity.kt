package com.example.basematch_k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

open class CustomActivity : AppCompatActivity() {

    fun backToTop() {
        val intentTop = Intent(this, TopActivity::class.java)
        startActivity(intentTop)
    }
}