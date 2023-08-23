package com.example.uishop.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector


sealed class NavigationItems(
    val icon: ImageVector,
    val label: String,
    val screen: AllScreens
) {
    companion object {
        val items = listOf(Home, Favourite, Cart, Chat, Profile)
    }

    object Home : NavigationItems(icon = Icons.Outlined.Home, label = "Home", screen = AllScreens.TradeScreen)
    object Favourite : NavigationItems(icon = Icons.Outlined.FavoriteBorder, label = "Favourite", screen = AllScreens.FavouriteScreen)
    object Cart : NavigationItems(icon = Icons.Outlined.ShoppingCart, label ="Cart", screen = AllScreens.CartScreen)
    object Chat : NavigationItems(icon = Icons.Outlined.Chat, label ="Chat", screen = AllScreens.ChatScreen)
    object Profile : NavigationItems(icon = Icons.Outlined.PersonOutline, label ="Profile", screen = AllScreens.ProfileScreen)
}


