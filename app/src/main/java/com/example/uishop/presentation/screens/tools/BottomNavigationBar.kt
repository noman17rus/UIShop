package com.example.uishop.presentation.screens.tools

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uishop.ui.theme.UIShopTheme

@Composable
fun BottomNavBar() {
    var selectedItem by remember {
        mutableStateOf(0)
    }



    NavigationBar(
        modifier = Modifier.height(60.dp).clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
    ) {
        BottomBarItemsSection.section.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                          selectedItem = index
                          },
                icon = { Icon(imageVector = item.icon, contentDescription = null) }
            )
        }
    }
}


@Preview
@Composable
fun BottomNavBarPreview() {
    UIShopTheme {
        BottomNavBar()
    }
}