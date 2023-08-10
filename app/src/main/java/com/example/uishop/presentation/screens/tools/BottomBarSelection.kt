package com.example.uishop.presentation.screens.tools

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomBarItemsSection(
    val icon: ImageVector,
    val label: String
) {
    companion object {
        val section = listOf(Home, Favourite, Cart, Chat, Profile)
    }

    object Home : BottomBarItemsSection(icon = Icons.Filled.Home, label = "Home")
    object Favourite : BottomBarItemsSection(Icons.Filled.Favorite, "Favourite")
    object Cart : BottomBarItemsSection(Icons.Filled.ShoppingCart, "Cart")
    object Chat : BottomBarItemsSection(Icons.Filled.Chat, "Chat")
    object Profile : BottomBarItemsSection(Icons.Filled.Person, "Profile")
}


