package com.example.uishop.presentation.screens.trade_screen

import android.annotation.SuppressLint
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
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uishop.domain.model.ListFlashSale
import com.example.uishop.domain.model.ListLatest
import com.example.uishop.presentation.screens.tools.BottomNavBar
import com.example.uishop.presentation.screens.tools.TopBarProfile
import com.example.uishop.presentation.screens.trade_screen.items.CategoryListItem
import com.example.uishop.presentation.screens.trade_screen.items.FlashSaleItem
import com.example.uishop.presentation.screens.trade_screen.items.LatestItems
import com.example.uishop.presentation.screens.trade_screen.items.SearchTextField
import com.example.uishop.presentation.screens.trade_screen.items.SmallCardItem
import com.example.uishop.ui.theme.UIShopTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TradeScreen(viewModel: TradeScreenViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    LaunchedEffect(key1 = true) {
        viewModel.getLatestProducts()
        viewModel.getFlashSaleProducts()
    }
    Spacer(modifier = Modifier.padding(5.dp))
    Scaffold(modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomNavBar() },
        topBar = { TopBarProfile() }
    ) {
        val latestProducts = viewModel.listLatestProduct.observeAsState().value
        val flashSalesProducts = viewModel.listFlashSaleProducts.observeAsState().value
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                SearchTextField(
                    value = viewModel.searchState,
                    onValueChange = viewModel.editSearch(),
                    placeholderText = "what are you looking for",
                )
            }
            item { CategoryListItem() }
            item {
                LatestProducts(latest = latestProducts)
            }
            item {
                FlashSaleProducts(flashSale = flashSalesProducts)
            }
        }
    }
}

@Composable
fun LatestProducts(latest: ListLatest?) {
    Column {
        LatestItems()
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            latest?.let { it ->
                items(it.latest) { SmallCardItem(latest = it) }
            }
        }
    }
}

@Composable
fun FlashSaleProducts(flashSale: ListFlashSale?) {
    LazyRow {
        flashSale?.let { it ->
            items(it.listFlashSale) { FlashSaleItem(flashSale = it) }
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