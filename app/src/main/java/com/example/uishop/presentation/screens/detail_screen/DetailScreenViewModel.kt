package com.example.uishop.presentation.screens.detail_screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.uishop.domain.model.DetailProduct
import com.example.uishop.domain.usecasses.product.GetDetailInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject

@HiltViewModel
class DetailScreenViewModel @Inject constructor (
    private val getDetailInfoUseCase: GetDetailInfoUseCase
) : ViewModel() {
    private val _detailInfo = MutableLiveData<DetailProduct>()
    val detailInfo: LiveData<DetailProduct> = _detailInfo
    suspend fun getDetailproduct() {
        coroutineScope {
            _detailInfo.value = getDetailInfoUseCase.getDetailInfoProduct()
        }
    }
}