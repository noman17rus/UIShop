package com.example.uishop.presentation.screens.tools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.uishop.R

class MyTextStyle()  {
    val mainTextStyle = TextStyle.Default.copy(
            fontSize = 14.sp,
            fontFamily = FontFamily(Font(R.font.montserrat)),
            fontWeight = FontWeight.Bold,
            color = Color(0xFF040402),
            textAlign = TextAlign.Center,
    )
}