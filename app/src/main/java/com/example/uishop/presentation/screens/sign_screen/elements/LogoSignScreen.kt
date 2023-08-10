package com.example.uishop.presentation.screens.sign_screen.elements

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uishop.R

@Composable
fun LogoSignScreen() {
    Box {
        Text(
            modifier = Modifier
                .width(150.dp)
                .height(48.dp),
            text = "Sign in",
            style = LocalTextStyle.current.copy(
                textAlign = TextAlign.Center,
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.montserrat)),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF000000)
            )
        )
    }
}