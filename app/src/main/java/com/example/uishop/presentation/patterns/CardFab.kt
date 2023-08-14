package com.example.uishop.presentation.patterns

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun BoxScope.CardFab(
    size: Dp = 10.dp,
    alignment: Alignment = Alignment.BottomEnd,
    icon: ImageVector = Icons.Default.Add,
    padding: Dp = 4.dp,
    iconSize: Dp = 24.dp,
    action: () -> Unit,
) {
    FloatingActionButton(
        modifier = Modifier
            .size(size)
            .align(alignment)
            .padding(bottom = 4.dp, end = padding),
        onClick = { action },
        shape = CircleShape,
        containerColor = Color.LightGray,
        contentColor = Color.DarkGray
    ) {
        Icon(modifier = Modifier.size(iconSize),imageVector = icon, contentDescription = null)
    }
}