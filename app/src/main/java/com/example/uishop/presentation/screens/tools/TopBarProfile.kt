package com.example.uishop.presentation.screens.tools

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uishop.R
import com.example.uishop.ui.theme.UIShopTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarProfile() {
    TopAppBar(
        modifier = Modifier.height(48.dp),
        title = {
            Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.Center) {
                Text(text = "Profile")
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
        navigationIcon = {
            Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.Center) {
                IconButton(onClick = {}) {
                    Icon(Icons.Filled.ArrowBack, "backIcon")
                }
            }
        }
    )
}

@Preview
@Composable
fun ProfileTopBarPreview() {
    UIShopTheme {
        TopBarProfile()
    }
}