package com.example.uishop.presentation.screens.detail_screen

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.uishop.domain.model.DetailProduct
import com.example.uishop.presentation.patterns.secondaryTextStyle
import com.example.uishop.presentation.screens.detail_screen.patterns.CarouselImages


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailScreen(viewModel: DetailScreenViewModel = hiltViewModel()) {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        LaunchedEffect(key1 = true) {
            viewModel.getDetailproduct()
        }
        val product = viewModel.detailInfo.observeAsState().value
        product?.let { CarouselImages(it.imageUrls) }
        product?.let { DetailInfoProduct(it) }
        AddCartSheet()
    }
}


@Composable
fun DetailInfoProduct(detailProduct: DetailProduct) {
    Column(
        modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = detailProduct.name, style = secondaryTextStyle(fontSize = 17))
            Text(text = "$ ${detailProduct.price}", style = secondaryTextStyle(fontSize = 13))
        }
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = detailProduct.description,
            style = secondaryTextStyle(fontSize = 9, color = Color(0xFF808080))
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(imageVector = Icons.Rounded.Star, contentDescription = null)
            Text(text = detailProduct.rating.toString(), style = secondaryTextStyle(fontSize = 9))
            Text(
                text = "(${detailProduct.numberOfReviews} reviews)",
                style = secondaryTextStyle(fontSize = 9, color = Color(0xFF808080))
            )
        }
        Spacer(modifier = Modifier.padding(5.dp))
        Column {
            Text(text = "Color:")
            Row {
                detailProduct.colors.forEach() {
                    Card(
                        modifier = Modifier
                            .size(34.dp)
                            .background(Color.Black)
                    ) {

                    }
                    Spacer(modifier = Modifier.padding(14.dp))
                }
            }
        }
    }
}

@Composable
fun AddCartSheet() {
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
            .background(Color(0xFF181726))
            .fillMaxWidth()
            .height(80.dp)
            .padding(start = 20.dp, end = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(modifier = Modifier.height(50.dp), verticalAlignment = Alignment.Bottom) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Quantity", style = secondaryTextStyle(color = Color.Gray))
                Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.Bottom) {
                    Button(
                        modifier = Modifier
                            .width(38.2.dp)
                            .height(22.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF4E55D7)),
                        contentPadding = PaddingValues(0.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(text = "-")
                    }
                    Spacer(modifier = Modifier.padding(3.dp))
                    Text(text = "1", style = secondaryTextStyle(fontSize = 13))
                    Spacer(modifier = Modifier.padding(3.dp))
                    Button(
                        modifier = Modifier
                            .width(38.2.dp)
                            .height(22.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF4E55D7)),
                        contentPadding = PaddingValues(0.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(text = "+")
                    }

                }
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .width(170.dp)
                    .height(44.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF4E55D7)),
                shape = RoundedCornerShape(15.dp),
                contentPadding = PaddingValues(0.dp),
                onClick = { /*TODO*/ }
            ) {
                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "count")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Add To Cart")
                }
            }
        }
    }
}


@Preview
@Composable
fun PrewDetail() {
    DetailScreen()
}