package com.example.uishop.presentation.screens.tools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.uishop.R

class MyTextStyle(
    val fontSize: Int = 14,
    val color: Color = Color(0xFF040402)
)  {
    val mainTextStyle = TextStyle.Default.copy(
            fontSize = fontSize.sp,
            fontFamily = FontFamily(Font(R.font.montserrat)),
            fontWeight = FontWeight.Bold,
            color = color,
            textAlign = TextAlign.Center,
    )
}