package com.example.uishop.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bed
import androidx.compose.material.icons.filled.ChildCare
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material.icons.filled.VideogameAsset
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Category(
    val name: String,
    val icon: ImageVector
) {
    companion object Categories {
        val categoryList = listOf(
            CategoryPhone,
            CategoryHeadPhones,
            CategoryGames,
            CategoryCars,
            CategoryFurniture,
            CategoryKids
        )
    }

    object CategoryPhone : Category(name = "Phone", icon = Icons.Default.PhoneAndroid)
    object CategoryHeadPhones : Category(name = "HeadPhones", icon = Icons.Default.Headphones)
    object CategoryGames : Category(name = "Games", icon = Icons.Default.VideogameAsset)
    object CategoryCars : Category(name = "Cars", icon = Icons.Default.DirectionsCar)
    object CategoryFurniture : Category(name = "Furniture", icon = Icons.Default.Bed)
    object CategoryKids : Category(name = "Kids", icon = Icons.Default.ChildCare)
}

