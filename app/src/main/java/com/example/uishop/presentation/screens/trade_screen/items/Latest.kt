package com.example.uishop.presentation.screens.trade_screen.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uishop.R
import com.example.uishop.presentation.patterns.primaryTextStyle
import com.example.uishop.presentation.patterns.secondaryTextStyle
import com.example.uishop.ui.theme.UIShopTheme

@Composable
fun LatestItems() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Latest", style = primaryTextStyle(color = Color.Black))
            Text(text = "View All", style = secondaryTextStyle(fontWeight = FontWeight(300)))
        }
    }
}

@Preview
@Composable
fun PreviewLatest() {
    UIShopTheme {
        LatestItems()
    }
}