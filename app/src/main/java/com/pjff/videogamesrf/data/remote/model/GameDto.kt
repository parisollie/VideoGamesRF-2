package com.pjff.videogamesrf.data.remote.model

import com.google.gson.annotations.SerializedName


data class GameDto(
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("thumbnail")
    var thumbnail: String? = null,
    @SerializedName("title")
    var title: String? = null
)