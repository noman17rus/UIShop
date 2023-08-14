package com.example.uishop

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.uishop.presentation.screens.login_screen.LoginScreen
import com.example.uishop.presentation.screens.login_screen.LoginScreenViewModel
import com.example.uishop.presentation.screens.profile_screen.ProfileScreen
import com.example.uishop.presentation.screens.sign_screen.SignScreen
import com.example.uishop.presentation.screens.trade_screen.TradeScreen
import com.example.uishop.ui.theme.UIShopTheme
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIShopTheme {
               ProfileScreen()
            }
        }
    }
}

