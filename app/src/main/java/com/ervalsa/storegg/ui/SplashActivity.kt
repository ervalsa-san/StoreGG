package com.ervalsa.storegg.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ervalsa.storegg.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    companion object {
        val timer = 2000L
    }

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, timer)
    }
}