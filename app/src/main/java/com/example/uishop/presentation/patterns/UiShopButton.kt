package com.example.uishop.presentation.patterns

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uishop.R


@Composable
fun UiShopButton(
    text: String,
    icon: ImageVector? = null,
    click: () -> Unit
) {
    Button(
        modifier = Modifier
            .width(289.dp)
            .height(46.dp),
        shape = RoundedCornerShape(15.dp),
        onClick = { click }
    ) {

        if (icon != null) {
            Image(
                imageVector = icon,
                contentDescription = null,
                colorFilter = ColorFilter.tint(
                    Color.White
                )
            )
        }
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = LocalTextStyle.current.copy(
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.montserrat)),
                fontWeight = FontWeight.Bold,
                color = Color(0xFFEAEAEA)
            )
        )
    }
}