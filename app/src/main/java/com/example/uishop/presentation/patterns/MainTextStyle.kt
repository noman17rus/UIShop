package com.example.uishop.presentation.patterns

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.uishop.R

class MainTextStyle(
    val fontSize: Int = 14,
    val color: Color = Color(0xFFEAEAEA)
) {
    val mainTextStyle: TextStyle = TextStyle.Default.copy(
        textAlign = TextAlign.Center,
        fontSize = fontSize.sp,
        fontFamily = FontFamily(Font(R.font.montserrat)),
        fontWeight = FontWeight.Bold,
        color = color
    )

}


fun primaryTextStyle(
    fontSize: Int = 14,
    color: Color= Color(0xFF070604),
    fontWeight: FontWeight = FontWeight.Bold
): TextStyle =
    TextStyle.Default.copy(
        textAlign = TextAlign.Center,
        fontSize = fontSize.sp,
        fontFamily = FontFamily(Font(R.font.montserrat)),
        fontWeight = fontWeight,
        color = color
    )

fun secondaryTextStyle(
    fontSize: Int = 9,
    color: Color = Color(0xFF070604),
    fontWeight: FontWeight = FontWeight.Bold
): TextStyle =
    TextStyle.Default.copy(
        textAlign = TextAlign.Center,
        fontSize = fontSize.sp,
        fontFamily = FontFamily(Font(R.font.poppins)),
        fontWeight = fontWeight,
        color = color
    )