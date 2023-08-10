package com.example.uishop

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.uishop.data.ProductService
import com.example.uishop.presentation.screens.login_screen.LoginScreen
import com.example.uishop.presentation.screens.sign_screen.SignScreen
import com.example.uishop.ui.theme.UIShopTheme
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIShopTheme {
                LoginScreen()
            }
        }
    }
}

