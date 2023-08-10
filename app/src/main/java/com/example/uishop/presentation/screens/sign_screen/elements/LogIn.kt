package com.example.uishop.presentation.screens.sign_screen.elements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

@Preview
@Composable
fun LogIn() {
    Column(modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.width(289.dp)) {
            Text(
                text = "Already have an account?",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF808080),
                )
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Text(
                modifier = Modifier.clickable {
                                              TODO()
                },
                text = "Log in",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF254FE6),
                    textAlign = TextAlign.Center,
                )
            )
        }
    }

}