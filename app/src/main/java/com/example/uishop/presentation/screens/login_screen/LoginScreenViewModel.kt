package com.example.uishop.presentation.screens.login_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginScreenViewModel : ViewModel() {
    var password by mutableStateOf("")
    var name by mutableStateOf("")
    var passwordVisible by mutableStateOf(false)

    fun nameChange(): (String)->Unit = {
        name = it
    }

    fun passwordChange(): (String)->Unit = {
        name = it
    }
}