package com.example.uishop

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.uishop.presentation.screens.login_screen.LoginScreen
import com.example.uishop.presentation.screens.trade_screen.TradeScreen
import com.example.uishop.ui.theme.UIShopTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIShopTheme {
                TradeScreen()
            }
        }
    }
}

