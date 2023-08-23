package com.example.uishop.presentation.screens.profile_screen.ext

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.ContentUris
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import android.util.Log
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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

        val pictureName = "IMG_20230817_180911.jpg"

        var imageUri by remember {
            mutableStateOf(Uri.EMPTY)
        }
        val launcher = rememberLauncherForActivityResult(
            contract = ActivityResultContracts.GetContent(),
            onResult = {
                imageUri = it
                Log.d("URI", it.toString())
            }
        )
        val requestPermission = rememberLauncherForActivityResult(
            contract = ActivityResultContracts.RequestPermission(),
            onResult = {

            }
        )

        val context = LocalContext.current

        LaunchedEffect(key1 = true) {
            requestPermission.launch(
                android.Manifest.permission.READ_EXTERNAL_STORAGE
            )
            Log.d("Image", getImage(context.contentResolver, "31").toString())
        }
        when (imageUri) {
            Uri.EMPTY -> AsyncImage(
                modifier = Modifier
                    .size(61.dp)
                    .clip(CircleShape),
                model = getImage(LocalContext.current.contentResolver, "31"),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            else ->
                AsyncImage(
                    modifier = Modifier
                        .size(61.dp)
                        .clip(CircleShape),
                    model = getImage(LocalContext.current.contentResolver, "31"),
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


fun getImage(contentResolver: ContentResolver, name: String): Uri? {

    val uriStorage = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
    val projection = arrayOf(
        MediaStore.Images.Media._ID,
        MediaStore.Images.Media.DISPLAY_NAME,
        MediaStore.Images.Media.DATA
    )
    val selection = " ${MediaStore.Images.Media._ID} = ?"
    val selectionArgs = arrayOf(
        name
    )
    val cursor = contentResolver.query(
        uriStorage,
        projection,
        selection,
        selectionArgs,
        null
    )

    cursor?.use {
        if (it.moveToFirst()) {
            val idColumn = cursor.getColumnIndex(MediaStore.Images.Media._ID)
            val nameColumn = cursor.getColumnIndex(MediaStore.Images.Media.DISPLAY_NAME)
            val id = it.getLong(idColumn)
            val name1 = it.getString(nameColumn)

            val uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id)
            Log.d("ID", id.toString())
            return uri
        }
    }
    return null
}