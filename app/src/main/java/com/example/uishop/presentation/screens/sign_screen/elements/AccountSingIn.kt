package com.example.uishop.presentation.screens.sign_screen.elements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uishop.R

@Preview
@Composable
fun SignInElement() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SignElement(
            text = "Sign with Google",
            image = ImageVector.vectorResource(R.drawable.vector_google)
        )
        Spacer(modifier = Modifier.padding(10.dp))
        SignElement(
            text = "Sign with Apple",
            image = ImageVector.vectorResource(R.drawable.logo_apple_new)
        )
    }
}

@Composable
fun SignElement(text: String, image: ImageVector) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier.weight(0.7f)
            ) {
                Icon(
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp),
                    imageVector = image,
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = text,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                )
            }
        }
//        Box(contentAlignment = Alignment.Center) {
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                Row(
//                    horizontalArrangement = Arrangement.Center,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Icon(
//                        modifier = Modifier
//                            .width(24.dp)
//                            .height(24.dp),
//                        imageVector = image,
//                        contentDescription = null
//                    )
//                    Spacer(modifier = Modifier.padding(8.dp))
//                    Column(modifier = Modifier.weight(1f)) {
//                        Text(
//                            text = text,
//                            fontFamily = FontFamily(Font(R.font.montserrat)),
//                            fontWeight = FontWeight.Bold,
//                            fontSize = 12.sp
//                        )
//                    }
//                }
//            }
//
//        }

    }
}