package com.example.carteirinhadigitalapp.feature.carteirinha.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier
) {
    CarteirinhaContent(
        qrCodeContent = "seunumerodematriculaaqui",
        modifier = modifier
    )
}