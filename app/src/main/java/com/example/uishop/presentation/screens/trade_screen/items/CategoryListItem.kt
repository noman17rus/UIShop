package com.example.uishop.presentation.screens.trade_screen.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uishop.R
import com.example.uishop.data.Category
import com.example.uishop.ui.theme.UIShopTheme

@Composable
fun CategoryListItem() {
    Spacer(modifier = Modifier.padding(5.dp))
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Category.categoryList.forEach {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFF5F6F6))
                        .clickable { },
                    contentAlignment = Alignment.Center
                ) {
                    Image(imageVector = it.icon, contentDescription = null)
                }
                Text(
                    text = it.name,
                    style = TextStyle(
                        fontSize = 8.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFA6A7AB),
                        textAlign = TextAlign.Center,
                    )
                )
            }

        }
    }
}

@Preview
@Composable
fun PreviewCategoryListItem() {
    UIShopTheme {
        CategoryListItem()
    }
}