package com.example.uishop.presentation.screens.trade_screen

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uishop.data.ProductService
import com.example.uishop.model.FlashSale
import com.example.uishop.model.Latest
import com.example.uishop.presentation.screens.tools.BottomNavBar
import com.example.uishop.presentation.screens.tools.TopBarProfile
import com.example.uishop.presentation.screens.trade_screen.items.CategoryListItem
import com.example.uishop.presentation.screens.trade_screen.items.FlashSaleItem
import com.example.uishop.presentation.screens.trade_screen.items.LatestItems
import com.example.uishop.presentation.screens.trade_screen.items.SearchTextField
import com.example.uishop.presentation.screens.trade_screen.items.SmallCardItem
import com.example.uishop.ui.theme.UIShopTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TradeScreen() {
    Spacer(modifier = Modifier.padding(5.dp))
    Scaffold(modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomNavBar() },
        topBar = { TopBarProfile() }
    ) {
        var searchState by remember {
            mutableStateOf("")
        }
        val retrofit = Retrofit.Builder()
            .baseUrl("https://run.mocky.io/v3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        val productService = retrofit.create(ProductService::class.java)

        var latestProducts by remember { mutableStateOf(listOf<Latest>()) }
        var flashSalesProducts by remember { mutableStateOf(listOf<FlashSale>()) }

        LaunchedEffect(key1 = true) {
            val response = withContext(Dispatchers.IO) {
                productService.getLatestProducts()
            }
            latestProducts = response.latest

        }
        LaunchedEffect(key1 = true) {
            val response = withContext(Dispatchers.IO) {
                productService.getFlashSaleProducts()
            }
            flashSalesProducts = response.listFlashSale
            Log.d("products", "${response}")
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                SearchTextField(
                    value = searchState,
                    onValueChange = { searchState = it },
                    placeholderText = "what are you looking for",
                )
            }
            item { CategoryListItem() }
            item {
                Column {
                    LatestItems()
                    LazyRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        items(latestProducts) {
                            SmallCardItem(latest = it)
                        }
                    }
                }
            }
            item { 
                LazyRow() {
                    items(flashSalesProducts) {
                        FlashSaleItem(flashSale = it)
                    }
                }
            }
            item {
                LazyRow() {
                    items(flashSalesProducts) {
                        FlashSaleItem(flashSale = it)
                    }
                }
            }


        }

    }
}


@Preview
@Composable
fun PreviewTradeScreen() {
    UIShopTheme {
        TradeScreen()
    }
}