package com.example.uishop.presentation.screens.trade_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.uishop.data.ApiInterface
import com.example.uishop.model.FlashSale
import com.example.uishop.model.Latest
import com.example.uishop.model.ListFlashSale
import com.example.uishop.model.ListLatest
import com.example.uishop.model.Retrifit
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class TradeScreenViewModel(
    private val apiInterface: ApiInterface = Retrifit(baseUrl = "https://run.mocky.io/v3/").apiInterface
) : ViewModel() {
    var searchState by mutableStateOf("")
  fun editSearch(): (String) -> Unit = { searchState = it }
    private val _listLatestProducts = MutableLiveData<ListLatest>()
    val listLatestProduct: LiveData<ListLatest> = _listLatestProducts
    private val _listFlashSaleProducts = MutableLiveData<ListFlashSale>()
    val listFlashSaleProducts: LiveData<ListFlashSale> = _listFlashSaleProducts
    suspend fun getLatestProducts() {
        viewModelScope.launch(Dispatchers.Main) {
            _listLatestProducts.value = apiInterface.getLatestProducts()
        }
    }
    suspend fun getFlashSaleProducts() {
        viewModelScope.launch(Dispatchers.Main) {
            _listFlashSaleProducts.value = apiInterface.getFlashSaleProducts()
        }
    }
}