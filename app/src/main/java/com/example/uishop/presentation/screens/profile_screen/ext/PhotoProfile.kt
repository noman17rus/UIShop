package com.example.uishop.presentation.screens.profile_screen.ext

import android.net.Uri
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Upload
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.uishop.R
import com.example.uishop.presentation.patterns.MainTextStyle
import com.example.uishop.presentation.patterns.UiShopButton

@Composable
fun PhotoProfile(
    image: Int = R.drawable.profile,
) {
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        var imageUri by remember {
            mutableStateOf(Uri.EMPTY)
        }
        val launcher = rememberLauncherForActivityResult(
            contract = ActivityResultContracts.GetContent(),
            onResult = {
                imageUri = it
            }
        )
        when (imageUri) {
            Uri.EMPTY -> AsyncImage(
                modifier = Modifier
                    .size(61.dp)
                    .clip(CircleShape),
                model = image,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            else ->
                AsyncImage(
                    modifier = Modifier
                        .size(61.dp)
                        .clip(CircleShape),
                    model = imageUri,
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
        }

        Text(
            modifier = Modifier.clickable {
                launcher.launch("image/*")
            },
            text = "change photo",
            style = TextStyle(
                fontSize = 8.sp,
                fontFamily = FontFamily(Font(R.font.montserrat)),
                fontWeight = FontWeight(500),
                color = Color(0xFF808080),
                textAlign = TextAlign.Center,
            )
        )
        Text(
            text = "user.name",
            style = MainTextStyle(color = Color(0xFF6F6B6B)).mainTextStyle
        )

        Spacer(modifier = Modifier.padding(15.dp))
        UiShopButton(text = "Upload photo", icon = Icons.Outlined.Upload) {
            launcher.launch("image/*")
        }
    }
}


@RequiresApi(Build.VERSION_CODES.P)
@Preview
@Composable
fun PhotoProfPreview() {
    PhotoProfile()
}