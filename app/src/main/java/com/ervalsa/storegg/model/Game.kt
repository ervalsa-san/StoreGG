package com.ervalsa.storegg.model

data class Game(
    var name: String = "",
    var description: String = "",
    var releaseDate: String = "",
    var company: String = "",
    var imageUrl: String = "",
    var genre: String = "",
    var rating: Int = 0,
    var platform: String = ""
)
