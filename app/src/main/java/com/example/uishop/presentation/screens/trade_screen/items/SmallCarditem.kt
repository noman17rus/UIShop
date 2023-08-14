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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.uishop.domain.model.Latest
import com.example.uishop.presentation.patterns.CardFab
import com.example.uishop.presentation.patterns.secondaryTextStyle
import com.example.uishop.ui.theme.UIShopTheme

@Composable
fun SmallCardItem(latest: Latest) {
    val painter = rememberAsyncImagePainter(latest.imageUrl)
    Card(
        modifier = Modifier
            .width(114.dp)
            .height(149.dp)
            .padding(7.dp)
            .clickable { }
    )
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painter,
                contentDescription = "Content description for visually impaired",
                contentScale = ContentScale.Crop
            )
            CardFab(size = 28.dp) {

            }
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .height(80.dp)
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
                        text = latest.category,
                        style = secondaryTextStyle(fontWeight = FontWeight(600))
                    )
                }
                Text(
                    text = latest.name,
                    style = secondaryTextStyle(
                        fontSize = 13,
                        color = Color.White,
                        fontWeight = FontWeight(600)
                    )
                )
                Text(
                    text = "$ ${latest.price}",
                    style = secondaryTextStyle(color = Color.Gray, fontWeight = FontWeight.Bold)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewSmallCard() {
    UIShopTheme {

    }
}