package com.example.uishop.di

import com.example.uishop.data.ApiInterface
import com.example.uishop.domain.model.DetailProduct
import com.example.uishop.domain.usecasses.product.GetDetailInfoUseCase
import com.example.uishop.domain.usecasses.product.GetFlashSaleListUseCase
import com.example.uishop.domain.usecasses.product.GetLatestListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun getLatestListUseCase(apiInterface: ApiInterface) : GetLatestListUseCase {
        return GetLatestListUseCase(apiInterface = apiInterface)
    }

    @Provides
    fun getFlashSaleListUseCase(apiInterface: ApiInterface) : GetFlashSaleListUseCase {
        return GetFlashSaleListUseCase(apiInterface = apiInterface)
    }

    @Provides
    fun getDetailIfoProduct(apiInterface: ApiInterface) : GetDetailInfoUseCase {
        return GetDetailInfoUseCase(apiInterface = apiInterface)
    }
}