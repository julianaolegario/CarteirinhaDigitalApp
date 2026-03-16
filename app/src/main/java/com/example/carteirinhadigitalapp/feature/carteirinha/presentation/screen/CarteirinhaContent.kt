package com.example.carteirinhadigitalapp.feature.carteirinha.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.carteirinhadigitalapp.R
import com.example.carteirinhadigitalapp.core.designsystem.theme.CarteirinhaDigitalAppTheme
import com.example.carteirinhadigitalapp.feature.carteirinha.presentation.component.PerfilAluno
import com.example.carteirinhadigitalapp.feature.carteirinha.presentation.component.QrCode.QrCode

@Composable
fun CarteirinhaContent(
    qrCodeContent: String = "numero de matricula do aluno",
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.plano_de_fundo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.7f)
        )

        Column(
            modifier = Modifier
                .safeDrawingPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(R.drawable.senai_s_o_paulo_logo),
                contentDescription = "Logo do SENAI São Paulo",
                modifier = Modifier.fillMaxWidth(0.6f)
            )

            PerfilAluno(
                modifier = Modifier.fillMaxWidth(0.9f)
            )

            QrCode(
                conteudo = qrCodeContent,
                modifier = Modifier.fillMaxWidth(0.6f)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaContentPreviewClaro() {
    CarteirinhaDigitalAppTheme(darkTheme = false) {
        CarteirinhaContent()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaContentPreviewEscuro() {
    CarteirinhaDigitalAppTheme(darkTheme = true) {
        CarteirinhaContent()
    }
}