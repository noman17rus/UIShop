package com.example.uishop.presentation.screens.login_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
import com.example.uishop.presentation.patterns.UiShopButton
import com.example.uishop.presentation.screens.tools.CustomTextField
import com.example.uishop.presentation.screens.tools.PasswordTextField

@Preview
@Composable
fun LoginScreen() {

    var password by rememberSaveable { mutableStateOf("") }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Welcome back",
            style = TextStyle(
                textAlign = TextAlign.Center,
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.montserrat)),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF000000)
            )
        )
        Column {
            CustomTextField(value = "", onValueChange = { }, placeholderText = "first name")
            Spacer(modifier = Modifier.padding(10.dp))
            PasswordTextField(
                value = password, onValueChange = { password = it },
                placeholderText = "password",
                passwordVisible = passwordVisible,
                trailingIcon = {
                    val image = if (passwordVisible)
                        Icons.Outlined.Visibility
                    else Icons.Outlined.VisibilityOff
                    // Please provide localized description for accessibility services
                    val description = if (passwordVisible) "Hide password" else "Show password"
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(imageVector = image, description)
                    }
                }
            )

        }
        UiShopButton(text = "Login in") {
        }
    }
}