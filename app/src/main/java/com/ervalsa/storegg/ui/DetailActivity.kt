package com.ervalsa.storegg.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ervalsa.storegg.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_RELEASE = "extra_release"
        const val EXTRA_COMPANY = "extra_company"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_PLATFORM = "extra_platform"
    }

    private lateinit var imgPhoto: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvDescription: TextView
    private lateinit var tvRelease: TextView
    private lateinit var tvCompany: TextView
    private lateinit var tvGenre: TextView
    private lateinit var tvPlatform: TextView
    private lateinit var rbRating: RatingBar
    private lateinit var btnBeli: Button
    private lateinit var btnBack: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        imgPhoto = findViewById(R.id.img_photo)
        tvName = findViewById(R.id.tv_name)
        tvDescription = findViewById(R.id.tv_description)
        tvRelease = findViewById(R.id.tv_release_date)
        tvCompany = findViewById(R.id.tv_company)
        tvGenre = findViewById(R.id.tv_genre)
        tvPlatform = findViewById(R.id.tv_platform)
        rbRating = findViewById(R.id.rb_rating)
        btnBeli = findViewById(R.id.btn_beli)
        btnBack = findViewById(R.id.btn_back)

        loadData()

        btnBeli.setOnClickListener {
            Toast.makeText(
                this,
                "Berhasil membeli ${tvName.text}",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    private fun loadData() {
        val setImgPhoto = intent.getStringExtra(EXTRA_IMAGE)
        val setName = intent.getStringExtra(EXTRA_NAME)
        val setDescription = intent.getStringExtra(EXTRA_DESCRIPTION)
        val setRelease = intent.getStringExtra(EXTRA_RELEASE)
        val setCompany = intent.getStringExtra(EXTRA_COMPANY)
        val setGenre = intent.getStringExtra(EXTRA_GENRE)
        val setPlatform = intent.getStringExtra(EXTRA_PLATFORM)
        val setRating = intent.getIntExtra(EXTRA_RATING, 0)

        Glide.with(this)
            .load(setImgPhoto)
            .apply(RequestOptions())
            .into(imgPhoto)

        tvName.text = setName
        tvDescription.text = setDescription
        tvRelease.text = setRelease
        tvCompany.text = setCompany
        tvGenre.text = setGenre
        tvPlatform.text = setPlatform
        rbRating.rating = setRating.toFloat()
    }
}