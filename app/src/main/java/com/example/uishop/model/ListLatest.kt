package com.example.uishop.model


import com.google.gson.annotations.SerializedName

data class ListLatest(
    @SerializedName("latest")
    val latest: List<Latest>
)