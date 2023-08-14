package com.example.uishop.presentation.patterns

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uishop.R
import com.example.uishop.presentation.patterns.MyTextStyle
import com.example.uishop.presentation.patterns.ProfileItem
import com.example.uishop.ui.theme.UIShopTheme


@Composable
fun ProfileBalanceItem(
    image: ImageVector,
    text: String,
    balance: String
) {
    Column(
        modifier = Modifier
            .width(375.dp)
    ) {
        Box(modifier = Modifier.clickable { }
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
                    Text(
                        text = "$ $balance",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.montserrat)),
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF040402),
                            textAlign = TextAlign.Center,
                        )
                    )
                }
            }
        }
    }

}

@Preview
@Composable
fun ItemBalancePreview() {
    UIShopTheme {
        ProfileItem(
            image = Icons.Default.Image,
            text = "test text",
            argument = Icons.Default.ArrowForwardIos,
            action = { }
        )
    }
}