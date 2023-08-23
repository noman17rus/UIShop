package com.example.uishop.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uishop.AppState
import com.example.uishop.presentation.screens.profile_screen.ProfileScreen
import com.example.uishop.presentation.screens.trade_screen.TradeScreen

sealed class AllScreens(
    val route: String
) {

    object TradeScreen : AllScreens("trade_screen")  //home
    object ProfileScreen : AllScreens("profile_screen")
    object FavouriteScreen : AllScreens("favourite_screen")
    object CartScreen : AllScreens("cart_screen")
    object ChatScreen : AllScreens("chat_screen")
    object SignScreen : AllScreens("sign_screen")
    object LoginScreen : AllScreens("login_screen")
    object DetailScreen : AllScreens("detail_screen")
}

@Composable
fun AppNavGraph(
    appState: AppState,
    paddingValues: PaddingValues,
    tradeScreenContent: @Composable () -> Unit,
    profileScreenContent: @Composable () -> Unit,
    signInScreenContent: @Composable () -> Unit,
    loginScreenContent: @Composable () -> Unit,
    detailScreenContent: @Composable () -> Unit,
) {
    NavHost(
        navController = appState.navController,
        startDestination = AllScreens.TradeScreen.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(AllScreens.ProfileScreen.route) { profileScreenContent() }
        composable(AllScreens.TradeScreen.route) { tradeScreenContent() }
        composable(AllScreens.SignScreen.route) { signInScreenContent() }
        composable(AllScreens.LoginScreen.route) { loginScreenContent() }
        composable(AllScreens.DetailScreen.route) { detailScreenContent() }
    }
}