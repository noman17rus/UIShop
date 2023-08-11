package com.example.uishop.presentation.screens.sign_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignScreenViewModel : ViewModel() {
    var firstname by mutableStateOf("")

    var lastName by mutableStateOf("")

    var email by mutableStateOf("")


    fun editFirstName(): (String) -> Unit = {
        firstname = it
    }

    fun editLastName(): (String) -> Unit = {
        lastName = it
    }

    fun editEmail(): (String) -> Unit = {
        email = it
    }
}