package com.example.recyclerview.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recyclerview.R

@Preview(showBackground = true)
@Composable
fun CardGame(){
    Card(modifier = Modifier.padding(8.dp)){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)){
            Image(
                modifier = Modifier
                    .height(150.dp)
                    .width(120.dp),
                painter = painterResource(id = R.drawable.eldenringps55),
                contentDescription ="Imagen del Juego",
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = "Elden Ring", modifier = Modifier.padding(top = 8.dp),
                    color = Color(0xFF020202)
                )
                GameDataView()

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50),
                    )
                ) {
                    Text(text ="Comprar")
                 }
            }

        }
    }
}