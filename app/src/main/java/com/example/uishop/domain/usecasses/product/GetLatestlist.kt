package com.example.uishop.domain.usecasses.product

import com.example.uishop.domain.ApiInterface
import com.example.uishop.domain.model.Latest
import com.example.uishop.domain.model.ListLatest

class GetLatestListUseCase(
    val apiInterface: ApiInterface
) {
    suspend fun getLatestList() : ListLatest {
        return apiInterface.getLatestProducts()
    }
}