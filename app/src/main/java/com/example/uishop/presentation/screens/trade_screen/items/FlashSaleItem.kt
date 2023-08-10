package com.example.uishop.presentation.screens.trade_screen.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.uishop.model.FlashSale
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
                        text = "${flashSale.discount} %", style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = FontFamily(Font(R.font.montserrat)),
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
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
                            style = TextStyle(
                                fontSize = 9.sp,
                                fontFamily = FontFamily(Font(R.font.poppins)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFF070604),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                    Text(
                        text = flashSale.name,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(600),
                            color = Color(0xFF020202),
                        )
                    )
                    Text(
                        text = "$ ${flashSale.price}", style = TextStyle(
                            fontSize = 10.sp,
                            fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(600),
                            color = Color(0xFF9B9393),
                        )
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