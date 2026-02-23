package com.example.carteirinhadigitalapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.carteirinhadigitalapp.ui.theme.CarteirinhaDigitalAppTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteirinhaDigitalApp(modifier = Modifier
                        .padding(paddingValues = innerPadding)
                        .fillMaxSize())

                }
            }
        }
    }
}

@Composable
fun CarteirinhaDigitalApp(modifier: Modifier= Modifier) {
    Box() {

        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(R.drawable.senai_s_o_paulo_logo),
                contentDescription = "Logo do Senai",
                modifier = Modifier
                    .weight(.5f)
                    .padding(7.dp)


            )
            Image(
                painter = painterResource(R.drawable.login),
                contentDescription = "Foto de Perfil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize(.6f)


            )

            Row(
                modifier = Modifier.weight(.3f)
            ) {
                Text(text = "Nome:")
                Text(text = "Juliana Santos Olegario")
            }
            Row(
                modifier = Modifier.weight(.3f)
            ) {
                Text(text = "Curso:")
                Text(text = "Tecnico Desenvolvimento de Sistemas")
            }
            QrCode(
                conteudo = "90000000001417282190",
                modifier = Modifier.weight(2f)
            )

        }
    }
}