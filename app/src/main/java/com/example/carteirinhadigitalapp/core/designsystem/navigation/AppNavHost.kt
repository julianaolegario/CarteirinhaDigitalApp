package com.example.carteirinhadigitalapp.core.designsystem.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.carteirinhadigitalapp.feature.auth.presentation.screen.LoginScreen
import com.example.carteirinhadigitalapp.feature.carteirinha.presentation.screen.CarteirinhaScreen

@Composable
fun AppNavHost( //lugar onde fica cada caminho
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route //rota inicial que eu escolhi no caso a de login
    ) {
        composable(Routes.Login.route) { //o route agrupa todas as rotas
            LoginScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                navController = navController //da autoridade para dentro da minha tela eu navegar
            )
        }
        composable(Routes.Carteirinha.route) {
            CarteirinhaScreen(
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }
}