package com.example.uishop.domain.usecasses.product

import com.example.uishop.data.ApiInterface
import com.example.uishop.domain.model.DetailProduct
import com.example.uishop.domain.model.ListLatest

class GetDetailInfoUseCase(
    val apiInterface: ApiInterface
) {
    suspend fun getDetailInfoProduct() : DetailProduct {
        return apiInterface.getDetailInfoProduct()
    }
}