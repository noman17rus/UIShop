package com.example.uishop.presentation.screens.tools

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Restore
import androidx.compose.material.icons.rounded.Help
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uishop.ui.theme.UIShopTheme


@Composable
fun ProfileEvents(
    modifier: Modifier = Modifier,
    goToTradeStore: () -> Unit,
    goToPayment: () -> Unit,
    goToTradeHistory: () -> Unit,
    restorePurchase: () -> Unit,
    goToHelp: () -> Unit,
    logout: () -> Unit
) {
Column(modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly) {
    ProfileItem(
        image = Icons.Default.CreditCard,
        text = "Trade store",
        argument = Icons.Default.ArrowForwardIos,
        action = goToTradeStore
    )
    ProfileItem(
        image = Icons.Default.CreditCard,
        text = "Payment method",
        argument = Icons.Default.ArrowForwardIos,
        action = goToPayment
    )
    ProfileBalanceItem(
        image = Icons.Default.CreditCard,
        text = "Balance",
        balance = "6548"
    )
    ProfileItem(
        image = Icons.Default.CreditCard,
        text = "Trade history",
        argument = Icons.Default.ArrowForwardIos,
        action = goToTradeHistory
    )
    ProfileItem(
        image = Icons.Default.Restore,
        text = "Restore Purchase",
        argument = Icons.Default.ArrowForwardIos,
        action = restorePurchase
    )
    ProfileItem(
        image = Icons.Rounded.Help,
        text = "Help",
        argument = Icons.Default.ArrowForwardIos,
        action = goToHelp
    )
    ProfileItem(
        image = Icons.Default.Logout,
        text = "Log out",
        argument = Icons.Default.ArrowForwardIos,
        action = logout
    )
}
}


@Composable
fun ProfileItem(
    image: ImageVector,
    text: String,
    argument: ImageVector,
    action: () -> Unit
) {
    Column(
        modifier = Modifier
            .width(375.dp)
    ) {
        Box(modifier = Modifier.clickable { action }
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Image(imageVector = image, contentDescription = null)
                }

                Text(text = text, style = MyTextStyle().mainTextStyle)
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                    Image(imageVector = argument, contentDescription = null)
                }
            }
        }
    }

}

@Preview
@Composable
fun ItemPreview() {
    UIShopTheme {
        ProfileEvents(
            goToTradeStore = { /*TODO*/ },
            goToPayment = { /*TODO*/ },
            goToTradeHistory = { /*TODO*/ },
            restorePurchase = { /*TODO*/ },
            goToHelp = { /*TODO*/ }) {
            
        }
    }
}