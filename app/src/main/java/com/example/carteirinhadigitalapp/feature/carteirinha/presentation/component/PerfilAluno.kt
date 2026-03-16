package com.example.carteirinhadigitalapp.feature.carteirinha.presentation.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteirinhadigitalapp.R

@Composable
fun PerfilAluno(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        Image(
            painter = painterResource(R.drawable.login),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth(.6f)
                .clip(CircleShape)
                .aspectRatio(1f)
        )
        InfoAluno(
            labelText = "Nome",
            valueText = "Juliana Santos Olegario",
            modifier = Modifier.fillMaxWidth(),
        )
        InfoAluno(
            labelText = "Curso",
            valueText = "Técnico em Desenvolvimento de Sistemas",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}