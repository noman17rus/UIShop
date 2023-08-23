package com.example.uishop.presentation.screens.login_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginScreenViewModel @Inject constructor() : ViewModel() {
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