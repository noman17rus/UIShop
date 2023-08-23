package com.example.uishop.data

import com.example.uishop.domain.model.DetailProduct
import com.example.uishop.domain.model.ListFlashSale
import com.example.uishop.domain.model.ListLatest
import retrofit2.http.GET

interface ApiInterface {
    @GET("cc0071a1-f06e-48fa-9e90-b1c2a61eaca7")
    suspend fun getLatestProducts() : ListLatest

    @GET("e40ad487-b361-4baa-abb0-e94330b9d4f6")
    suspend fun getFlashSaleProducts() : ListFlashSale

    @GET("fe805274-48b9-4fc4-b5c6-0e844a2feb45")
    suspend fun getDetailInfoProduct() : DetailProduct
}