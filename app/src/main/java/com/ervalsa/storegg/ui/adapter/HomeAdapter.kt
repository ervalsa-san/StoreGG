package com.ervalsa.storegg.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ervalsa.storegg.R
import com.ervalsa.storegg.model.Game
import com.ervalsa.storegg.ui.DetailActivity

class HomeAdapter(private val listGame: ArrayList<Game>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_game, parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context)
            .load(game.imageUrl)
            .apply(RequestOptions().override(100, 150))
            .placeholder(R.drawable.broken_image_icon)
            .into(holder.imgPhoto)

        holder.tvName.text = "${game.name} (${game.releaseDate})"
        holder.tvGenre.text = game.genre
        holder.tvCompany.text = game.company
        holder.tvPlatform.text = game.platform
        holder.rbRating.rating = game.rating.toFloat()

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_NAME, game.name)
            intent.putExtra(DetailActivity.EXTRA_DESCRIPTION, game.description)
            intent.putExtra(DetailActivity.EXTRA_RELEASE, game.releaseDate)
            intent.putExtra(DetailActivity.EXTRA_COMPANY, game.company)
            intent.putExtra(DetailActivity.EXTRA_IMAGE, game.imageUrl)
            intent.putExtra(DetailActivity.EXTRA_GENRE, game.genre)
            intent.putExtra(DetailActivity.EXTRA_RATING, game.rating)
            intent.putExtra(DetailActivity.EXTRA_PLATFORM, game.platform)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = listGame.size

    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_genre)
        var tvCompany: TextView = itemView.findViewById(R.id.tv_company)
        var tvPlatform: TextView = itemView.findViewById(R.id.tv_platform)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)
        var rbRating: RatingBar = itemView.findViewById(R.id.rb_rating)
    }
}