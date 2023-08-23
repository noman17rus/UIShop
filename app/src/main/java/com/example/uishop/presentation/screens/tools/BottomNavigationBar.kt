package com.example.uishop.presentation.screens.tools

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.uishop.navigation.NavigationItems
import com.example.uishop.ui.theme.UIShopTheme

@Composable
fun BottomNavBar(navHostController: NavHostController) {

    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route

    NavigationBar(
        modifier = Modifier.background(Color(0xFF181726)).clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)),
    ) {
        NavigationItems.items.forEach { section ->
            NavigationBarItem(modifier = Modifier,
                selected = currentDestination == section.screen.route,
                onClick = {
                    navHostController.navigate(section.screen.route)
                },
                icon = { Icon(imageVector = section.icon, contentDescription = null) }
            )
        }
    }
}

//
//    @Preview
//    @Composable
//    fun BottomNavBarPreview() {
//        UIShopTheme {
//            BottomNavBar()
//        }
//    }