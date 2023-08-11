package com.example.uishop.presentation.screens.trade_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.uishop.domain.ApiInterface
import com.example.uishop.domain.model.ListFlashSale
import com.example.uishop.domain.model.ListLatest
import com.example.uishop.domain.usecasses.product.GetFlashSaleListUseCase
import com.example.uishop.domain.usecasses.product.GetLatestListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TradeScreenViewModel @Inject constructor(
    private val apiInterface: ApiInterface,
    private val getLatestListUseCase: GetLatestListUseCase,
    private val getFlashSaleListUseCase: GetFlashSaleListUseCase
) : ViewModel() {
    var searchState by mutableStateOf("")
  fun editSearch(): (String) -> Unit = { searchState = it }
    private val _listLatestProducts = MutableLiveData<ListLatest>()
    val listLatestProduct: LiveData<ListLatest> = _listLatestProducts
    private val _listFlashSaleProducts = MutableLiveData<ListFlashSale>()
    val listFlashSaleProducts: LiveData<ListFlashSale> = _listFlashSaleProducts
    suspend fun getLatestProducts() {
        viewModelScope.launch(Dispatchers.Main) {
            _listLatestProducts.value = getLatestListUseCase.getLatestList()
        }
    }
    suspend fun getFlashSaleProducts() {
        viewModelScope.launch(Dispatchers.Main) {
            _listFlashSaleProducts.value = getFlashSaleListUseCase.getFlashSaleList()
        }
    }
}