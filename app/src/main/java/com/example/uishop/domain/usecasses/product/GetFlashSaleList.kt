package com.example.uishop.domain.usecasses.product

import com.example.uishop.data.ApiInterface
import com.example.uishop.domain.model.ListFlashSale

class GetFlashSaleListUseCase (
    val apiInterface: ApiInterface
) {
    suspend fun getFlashSaleList() : ListFlashSale {
        return apiInterface.getFlashSaleProducts()
    }
}