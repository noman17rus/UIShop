package com.example.uishop.model


import com.google.gson.annotations.SerializedName

data class ListFlashSale(
    @SerializedName("flash_sale")
    val listFlashSale: List<FlashSale>
)