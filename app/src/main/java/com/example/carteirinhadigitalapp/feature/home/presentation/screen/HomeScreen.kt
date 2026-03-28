package com.example.carteirinhadigitalapp.feature.home.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.carteirinhadigitalapp.core.designsystem.navigation.Routes
import com.example.carteirinhadigitalapp.feature.auth.presentation.screen.LoginContent

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var nomeUsuario by remember { mutableStateOf("Juliana") }

    HomeContent(
        nomeUsuario = nomeUsuario,
        onLoginClick = {
            navController.navigate( Routes.Login.route) {
                popUpTo(Routes.Home.route) { inclusive = true }
            }
        },
        modifier = modifier
    )
}
