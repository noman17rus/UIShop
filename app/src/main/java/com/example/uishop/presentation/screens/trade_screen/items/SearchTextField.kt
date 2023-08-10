package com.example.uishop.presentation.screens.trade_screen.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material.icons.rounded.Visibility
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uishop.R
import com.example.uishop.ui.theme.TextFieldBackground
import com.example.uishop.ui.theme.UIShopTheme


@Composable
fun SearchTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = { Icons.Default.Search },
    trailingIcon: @Composable () -> Unit = { Image(imageVector = Icons.Default.Search, contentDescription = null) },
    placeholderText: String = "What are you looking for ?",
    passwordVisible: Boolean = false
) {
    BasicTextField(
        modifier = modifier
            .background(
                TextFieldBackground,
                RoundedCornerShape(12.dp),
            )
            .width(262.dp)
            .height(24.dp)
            .padding(4.dp),
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        cursorBrush = SolidColor(MaterialTheme.colorScheme.onSurface),
        textStyle = LocalTextStyle.current.copy(
            textAlign = TextAlign.Center,
            fontSize = 11.sp,
            fontFamily = FontFamily(Font(R.font.montserrat)),
            fontWeight = FontWeight.Bold
        ),

        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Words,
            autoCorrect = true,
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Next
        ),
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        decorationBox = { innerTextField ->
            Row(
                modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Box(Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    if (value.isEmpty())
                        Text(
                            placeholderText,
                            style = LocalTextStyle.current.copy(
                                fontSize = 9.sp,
                                color = Color(0xFF000000),
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 9.sp,
                            fontFamily = FontFamily(Font(R.font.montserrat)),
                            fontWeight = FontWeight(500)
                        )
                    innerTextField()
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterEnd) {
                        trailingIcon()
                    }
                }

            }
        }
    )
}

@Preview
@Composable
fun PrewTF() {
    UIShopTheme {
        SearchTextField(value = "", onValueChange = {})
    }
}