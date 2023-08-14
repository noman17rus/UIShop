package com.example.uishop

import android.annotation.SuppressLint
import android.content.res.Resources
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope


@SuppressLint("RememberReturnType")
@Composable
fun rememberAppState(
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
) = remember(
    navController,
    coroutineScope
) {
    AppState(navController, coroutineScope)
}

class AppState (
    val navController: NavHostController,
    coroutineScope: CoroutineScope,
) {

}