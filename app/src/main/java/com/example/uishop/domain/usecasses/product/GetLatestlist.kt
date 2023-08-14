package com.example.uishop.domain.usecasses.product

import com.example.uishop.data.ApiInterface
import com.example.uishop.domain.model.ListLatest

class GetLatestListUseCase(
    val apiInterface: ApiInterface
) {
    suspend fun getLatestList() : ListLatest {
        return apiInterface.getLatestProducts()
    }
}