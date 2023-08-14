package com.example.uishop.presentation.screens.trade_screen.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.uishop.R
import com.example.uishop.domain.model.FlashSale
import com.example.uishop.presentation.patterns.CardFab
import com.example.uishop.presentation.patterns.primaryTextStyle
import com.example.uishop.presentation.patterns.secondaryTextStyle
import com.example.uishop.ui.theme.UIShopTheme

@Composable
fun FlashSaleItem(flashSale: FlashSale) {
    FlashSaleCard(flashSale)
}

@Composable
fun FlashSaleCard(flashSale: FlashSale) {
    val painter = rememberAsyncImagePainter(flashSale.imageUrl)
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(250.dp)
            .padding(10.dp)
            .clickable { }
    ) {
        Box {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painter,
                contentDescription = "Content description for visually impaired",
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier.align(Alignment.BottomEnd),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box {
                    CardFab(size = 40.dp, icon = Icons.Outlined.Favorite, iconSize = 12.dp) {

                    }
                }
                Box() {
                    CardFab(size = 52.dp, iconSize = 44.dp) {

                    }
                }
            }

            Column(modifier = Modifier.align(Alignment.TopEnd)) {
                Box(
                    modifier = Modifier
                        .padding(6.dp)
                        .width(41.dp)
                        .height(16.dp)
                        .background(Color.Red, shape = RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "${flashSale.discount} %",
                        style = primaryTextStyle(
                            fontSize = 10,
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF)
                        )
                    )
                }
            }

            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .height(100.dp)
                        .padding(4.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .width(35.dp)
                            .height(12.dp)
                            .background(
                                color = Color(0xD9C4C4C4),
                                shape = RoundedCornerShape(size = 5.dp)
                            )
                    ) {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = flashSale.category,
                            style = primaryTextStyle(fontSize = 9)
                        )
                    }
                    Text(
                        text = flashSale.name,
                        style = secondaryTextStyle(fontSize = 13)
                    )
                    Text(
                        text = "$ ${flashSale.price}",
                        style = secondaryTextStyle(fontSize = 10, fontWeight = FontWeight(600))
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun FlashSalePreview() {
    UIShopTheme {

    }
}