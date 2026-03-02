package com.example.carteirinhadigitalapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.senai_s_o_paulo_logo),
                contentDescription = "Logo do Senai",
                modifier = Modifier
                    .fillMaxWidth(.6f)
                    .background(color = Color.White)


            )
            Spacer(
                modifier = Modifier
                    .weight(.3f)
            )
            Image(
                painter = painterResource(R.drawable.login),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
                    .clip(CircleShape)
                    .aspectRatio(1f)


            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(.9f)
                    .weight(.6f),
                verticalAlignment = Alignment.CenterVertically

            ) {
                LabelText(
                    "Nome",
                    modifier = Modifier.weight(1f)
                )
                ValueText(
                    value = "Juliana Santos Olegario",
                    modifier = Modifier.weight(2f)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(.9f)
                    .weight(.6f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LabelText(
                    "Curso",
                    modifier = Modifier.weight(1f)
                )
                ValueText(
                    value = "Tecnico Desenvolvimento de Sistemas",
                    fontWeight = FontWeight.Normal,
                    fontSize = 25.sp,
                    modifier = Modifier.weight(4f)

                )

            }
            Button(
                onClick = {}
            ) {
                Text("Aperte aqui")
            }
            TextField(
                value = "",
                onValueChange = {},
                label = {
                    Text("Número de matricula")
                }
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text("Número de matricula")
                }
            )
            QrCode(
                conteudo = "90000000001417282190",
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
            )
            }
            }
        }


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewCarteirinhaClaro(){
    CarteirinhaDigitalAppTheme (darkTheme =true){
        CarteirinhaDigitalApp(modifier = Modifier.padding(16.dp))
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewCarteirinhaEscuro(){
    CarteirinhaDigitalAppTheme(darkTheme = false){
       CarteirinhaDigitalApp(modifier = Modifier.padding(16.dp))
    }
}