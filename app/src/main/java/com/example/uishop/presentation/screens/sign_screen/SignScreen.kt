package com.example.uishop.presentation.screens.sign_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uishop.presentation.screens.sign_screen.elements.LogIn
import com.example.uishop.presentation.screens.sign_screen.elements.LogoSignScreen
import com.example.uishop.presentation.screens.sign_screen.elements.SignInElement
import com.example.uishop.presentation.screens.tools.CustomTextField
import com.example.uishop.presentation.screens.tools.MyButton

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "NewApi")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var firstname by remember {
            mutableStateOf("")
        }
        var lastName by remember {
            mutableStateOf("")
        }
        var email by remember {
            mutableStateOf("")
        }

        var count by remember {
            mutableStateOf(0)
        }

        LogoSignScreen()
        UserInfo(
            firstname = firstname,
            lastName = lastName,
            email = email,
            onNameChange = { firstname = it },
            onLastNameChange = { lastName = it },
            onEmailChange = { email = it }
        ) {

        }
        SignInElement()
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserInfo(
    firstname: String,
    lastName: String,
    email: String,
    onNameChange: (String) -> Unit,
    onLastNameChange: (String) -> Unit,
    onEmailChange: (String) -> Unit,
    singIn: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        CustomTextField(
            value = firstname,
            onValueChange = onNameChange,
            placeholderText = "First name"
        )
        Spacer(modifier = Modifier.padding(8.dp))
        CustomTextField(
            value = lastName,
            onValueChange = onLastNameChange,
            placeholderText = "Last name"
        )
        Spacer(modifier = Modifier.padding(8.dp))
        CustomTextField(value = email, onValueChange = onEmailChange, placeholderText = "email")
        Spacer(modifier = Modifier.padding(8.dp))
        MyButton(text = "sign in") {
            singIn
        }
        Spacer(modifier = Modifier.padding(5.dp))
        LogIn()
    }


}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SignInPreview() {
    SignScreen()
}


