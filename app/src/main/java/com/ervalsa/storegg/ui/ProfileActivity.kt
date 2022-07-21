package com.ervalsa.storegg.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.ervalsa.storegg.R

class ProfileActivity : AppCompatActivity() {

    private lateinit var imgProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        imgProfile = findViewById(R.id.img_profile)

        Glide.with(this)
            .load(R.drawable.my_photo)
            .circleCrop()
            .into(imgProfile)
    }
}