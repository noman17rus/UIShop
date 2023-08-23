package com.example.uishop

import android.annotation.SuppressLint
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.navigation.compose.rememberNavController
import com.example.uishop.navigation.AllScreens
import com.example.uishop.navigation.AppNavGraph
import com.example.uishop.presentation.screens.detail_screen.DetailScreen
import com.example.uishop.presentation.screens.login_screen.LoginScreen
import com.example.uishop.presentation.screens.profile_screen.ProfileScreen
import com.example.uishop.presentation.screens.sign_screen.SignScreen
import com.example.uishop.presentation.screens.tools.BottomNavBar
import com.example.uishop.presentation.screens.trade_screen.TradeScreen
import com.example.uishop.presentation.screens.trade_screen.TradeScreenViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(appState: AppState) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(modifier = Modifier,
            bottomBar = { BottomNavBar(navHostController = appState.navController) }
        ) {
            AppNavGraph(
                appState,
                paddingValues = it,
                tradeScreenContent = { TradeScreen(appState = appState) },
                profileScreenContent = { ProfileScreen() },
                loginScreenContent = { LoginScreen() },
                signInScreenContent = { SignScreen() },
                detailScreenContent = { DetailScreen() }
            )
        }
    }
}