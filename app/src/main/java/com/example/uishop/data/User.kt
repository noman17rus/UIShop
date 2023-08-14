package com.example.uishop.data

import android.net.Uri

data class User(
    val name: String,
    var image: Uri = Uri.EMPTY
)

