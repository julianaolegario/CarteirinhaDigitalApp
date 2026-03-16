package com.example.carteirinhadigitalapp.feature.auth.presentation.screen



import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.carteirinhadigitalapp.core.designsystem.navigation.Routes


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    LoginContent(
        login = login,
        senha = senha,
        onLoginChange = { it },
        onSenhaChange = { it },
        onLoginClick = {
            navController.navigate(
                Routes.Carteirinha.route
            )
        },
        modifier = modifier
    )
}