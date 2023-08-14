package com.example.uishop.presentation.screens.profile_screen

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uishop.AppState
import com.example.uishop.presentation.patterns.ProfileEvents
import com.example.uishop.presentation.screens.profile_screen.ext.PhotoProfile
import com.example.uishop.presentation.screens.tools.BottomNavBar
import com.example.uishop.presentation.screens.tools.TopBarProfile
import com.example.uishop.rememberAppState
import com.example.uishop.ui.theme.UIShopTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    val appState = rememberAppState()
    Scaffold(
        topBar = { TopBarProfile() },
        bottomBar = { BottomNavBar(appState.navController) },
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
            ProfileEvents(
                goToTradeStore = { },
                goToPayment = { },
                goToTradeHistory = { },
                restorePurchase = { },
                goToHelp = { },
                logout = { },
            )
        }

    }
}

@Composable
fun LoadImage() {


}


@RequiresApi(Build.VERSION_CODES.P)
@Preview
@Composable
fun ProfilePreview() {
    UIShopTheme {
        ProfileScreen()
    }
}