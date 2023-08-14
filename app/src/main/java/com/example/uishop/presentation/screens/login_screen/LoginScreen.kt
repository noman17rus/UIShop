package com.example.uishop.presentation.screens.login_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uishop.presentation.patterns.UiShopButton
import com.example.uishop.presentation.patterns.CustomTextField
import com.example.uishop.presentation.patterns.MyTextStyle
import com.example.uishop.presentation.patterns.PasswordTextField
import dagger.hilt.android.lifecycle.HiltViewModel


@Composable
fun LoginScreen(viewModel: LoginScreenViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Welcome back",
            style = MyTextStyle(fontSize = 29).mainTextStyle
        )
        UserInfo(
            name = viewModel.name,
            password = viewModel.password,
            nameChange = viewModel.nameChange(),
            passwordChange = viewModel.passwordChange(),
            passwordVisible = viewModel.passwordVisible
        )
        UiShopButton(text = "Login in") {
            //button on click
        }
    }
}

@Composable
fun UserInfo(
    name: String,
    password: String,
    nameChange: (String) -> Unit,
    passwordChange: (String) -> Unit,
    passwordVisible: Boolean
) {
    Column {
        var passwordVisible = passwordVisible
        CustomTextField(value = name, onValueChange = nameChange, placeholderText = "first name")
        Spacer(modifier = Modifier.padding(10.dp))
        PasswordTextField(
            value = password, onValueChange = passwordChange,
            placeholderText = "password",
            passwordVisible = passwordVisible,
            trailingIcon = {
                val image = if (passwordVisible)
                    Icons.Outlined.Visibility
                else Icons.Outlined.VisibilityOff
                // Please provide localized description for accessibility services
                val description = if (passwordVisible) "Hide password" else "Show password"
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = image, description)
                }
            }
        )

    }
}