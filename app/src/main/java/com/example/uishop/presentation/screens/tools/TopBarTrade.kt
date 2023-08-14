package com.example.uishop.presentation.screens.tools

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uishop.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarTradeScreen() {
    TopAppBar(
        title = { Text(text = "trade") },
        navigationIcon = {
            Box {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.Menu, contentDescription = null)
                }
            }

        },
        actions = {
            Image(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.indus),
                contentDescription = null
            )
        },
    )
}