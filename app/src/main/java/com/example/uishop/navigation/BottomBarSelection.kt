package com.example.uishop.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomBarItemsSection(
    val icon: ImageVector,
    val label: String,
) {
    companion object {
        val section = listOf(Home, Favourite, Cart, Chat, Profile)
    }

    object Home : BottomBarItemsSection(icon = Icons.Filled.Home, label = "Home", )
    object Favourite : BottomBarItemsSection(icon = Icons.Filled.Favorite, label = "Favourite", )
    object Cart : BottomBarItemsSection(icon = Icons.Filled.ShoppingCart, label ="Cart", )
    object Chat : BottomBarItemsSection(icon = Icons.Filled.Chat, label ="Chat",)
    object Profile : BottomBarItemsSection(icon = Icons.Filled.Person, label ="Profile", )
}


