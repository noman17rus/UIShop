package com.example.uishop.presentation.screens.sign_screen.elements

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.uishop.presentation.patterns.MyTextStyle

@Composable
fun LogoSignScreen() {
    Box {
        Text(
            modifier = Modifier
                .width(150.dp)
                .height(48.dp),
            text = "Sign in",
            style = MyTextStyle(fontSize = 29).mainTextStyle
        )
    }
}