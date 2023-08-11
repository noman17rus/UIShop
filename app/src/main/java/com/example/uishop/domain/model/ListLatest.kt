package com.example.uishop.domain.model


import com.google.gson.annotations.SerializedName

data class ListLatest(
    @SerializedName("latest")
    val latest: List<Latest>
)