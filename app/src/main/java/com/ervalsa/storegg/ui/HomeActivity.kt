package com.ervalsa.storegg.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ervalsa.storegg.R
import com.ervalsa.storegg.model.Game
import com.ervalsa.storegg.ui.adapter.HomeAdapter
import com.ervalsa.storegg.utils.GamesData

class HomeActivity : AppCompatActivity() {

    private lateinit var imgProfile: ImageView
    private lateinit var rvGame: RecyclerView
    private lateinit var btnProfile: ImageButton
    private var list: ArrayList<Game> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        imgProfile = findViewById(R.id.img_profile)
        btnProfile = findViewById(R.id.btn_profile)
        rvGame = findViewById(R.id.rv_game)
        rvGame.setHasFixedSize(true)

        Glide.with(this)
            .load(R.drawable.my_photo)
            .circleCrop()
            .into(imgProfile)

        list.addAll(GamesData.listData)
        showRecyclerGameList()

        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showRecyclerGameList() {
        rvGame.layoutManager = LinearLayoutManager(this)
        val listGameAdapter = HomeAdapter(list)
        rvGame.adapter = listGameAdapter
    }
}