package com.example.carteirinhadigitalapp.feature.home.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinhadigitalapp.core.designsystem.theme.CarteirinhaDigitalAppTheme

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {} //nao recebe parametro e nao retorna nada
) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        Text(
            text = "Bem-vindo, $nomeUsuario",
            style = MaterialTheme.typography.headlineSmall
        )
        

        Button (
            onClick = onLoginClick,
            modifier = Modifier.fillMaxWidth(0.6f),
            shape = RoundedCornerShape(size = 9.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.background
            ),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.primary
            )
        ) {
            Text("Sair")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewHomeContentClaro() {
    CarteirinhaDigitalAppTheme(darkTheme = true) {
        HomeContent(
            nomeUsuario = "Juliana"
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLHomeContentEscuro() {
    CarteirinhaDigitalAppTheme(darkTheme = false) {
        HomeContent(nomeUsuario = "Juliana" )
    }
}
