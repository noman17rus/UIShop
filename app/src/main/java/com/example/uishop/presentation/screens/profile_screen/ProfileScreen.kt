package com.example.uishop.presentation.screens.profile_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Restore
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material.icons.outlined.Upload
import androidx.compose.material.icons.rounded.Help
import androidx.compose.material.icons.rounded.Upload
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.uishop.R
import com.example.uishop.presentation.screens.tools.BottomNavBar
import com.example.uishop.presentation.screens.tools.MyButton
import com.example.uishop.presentation.screens.tools.PhotoProfile
import com.example.uishop.presentation.screens.tools.ProfileBalanceItem
import com.example.uishop.presentation.screens.tools.ProfileItem
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
            PhotoProfile()
            Text(
                text = "Satria Adhi Pradana",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF3F3F3F),
                    textAlign = TextAlign.Center,
                )
            )

            MyButton(text = "Upload item", icon = Icons.Outlined.Upload) {

            }
            ProfileItem(
                image = Icons.Default.CreditCard,
                text = "Trade store",
                argument = Icons.Default.ArrowForwardIos
            )
            ProfileItem(
                image = Icons.Default.CreditCard,
                text = "Payment method",
                argument = Icons.Default.ArrowForwardIos
            )
            ProfileBalanceItem(
                image = Icons.Default.CreditCard,
                text = "Balance",
                balance = "6548"
            )
            ProfileItem(
                image = Icons.Default.CreditCard,
                text = "Trade history",
                argument = Icons.Default.ArrowForwardIos
            )
            ProfileItem(
                image = Icons.Default.Restore,
                text = "Restore Purchase",
                argument = Icons.Default.ArrowForwardIos
            )
            ProfileItem(
                image = Icons.Rounded.Help,
                text = "Help",
                argument = Icons.Default.ArrowForwardIos
            )
            ProfileItem(
                image = Icons.Default.Logout,
                text = "Log out",
                argument = Icons.Default.ArrowForwardIos
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