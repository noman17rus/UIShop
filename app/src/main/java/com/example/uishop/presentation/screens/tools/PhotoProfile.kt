package com.example.uishop.presentation.screens.tools

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uishop.R

@Composable
fun PhotoProfile() {
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier
                .clip(CircleShape)
                .size(61.dp),
            painter = painterResource(R.drawable.indus),
            contentDescription = "Content description for visually impaired"
        )
        Text(
            modifier = Modifier.clickable {

            },
            text = "change photo",
            style = TextStyle(
                fontSize = 8.sp,
                fontFamily = FontFamily(Font(R.font.montserrat)),
                fontWeight = FontWeight(500),
                color = Color(0xFF808080),
                textAlign = TextAlign.Center,
            )
        )
    }
}