package com.example.uishop.presentation.screens.profile_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Upload
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uishop.presentation.patterns.MainTextStyle
import com.example.uishop.presentation.patterns.UiShopButton
import com.example.uishop.presentation.screens.tools.BottomNavBar
import com.example.uishop.presentation.screens.profile_screen.ext.PhotoProfile
import com.example.uishop.presentation.screens.tools.ProfileEvents
import com.example.uishop.presentation.screens.tools.TopBarProfile
import com.example.uishop.ui.theme.UIShopTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen() {
    Scaffold(
        topBar = { TopBarProfile() },
        bottomBar = { BottomNavBar() },
    ) {
        Column(
            modifier = Modifier
                .padding(top = it.calculateTopPadding(), bottom = it.calculateBottomPadding())
                .fillMaxSize(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Spacer(modifier = Modifier.padding(5.dp))
            PhotoProfile()
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = "Satria Adhi Pradana",
                style = MainTextStyle(color = Color(0xFF6F6B6B)).mainTextStyle
            )
            Spacer(modifier = Modifier.padding(15.dp))
            UiShopButton(text = "Upload item", icon = Icons.Outlined.Upload) {

            }
            ProfileEvents(
                goToTradeStore = {},
                goToPayment = {},
                goToTradeHistory = {},
                restorePurchase = {},
                goToHelp = {},
                logout = {},
            )
        }

    }
}

@Preview
@Composable
fun ProfilePreview() {
    UIShopTheme {
        ProfileScreen()
    }
}