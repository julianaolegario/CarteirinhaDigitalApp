package com.example.carteirinhadigitalapp.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.carteirinhadigitalapp.core.designsystem.navigation.AppNavHost
import com.example.carteirinhadigitalapp.core.designsystem.theme.CarteirinhaDigitalAppTheme

@Composable
fun App() {
    CarteirinhaDigitalAppTheme(){
        val navController = rememberNavController() //função que constroi o bean
        AppNavHost(
            navController = navController,
        )
    }
}

