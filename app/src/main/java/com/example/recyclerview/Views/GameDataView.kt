package com.example.recyclerview.Views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview (showBackground = true)
@Composable
fun GameDataView(){
    Row() {
        Text(
            text = "PlayStation 5", modifier = Modifier.padding(top = 8.dp),
            color = Color(0xFF2196F3)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text(
            text = "$1200", modifier = Modifier.padding(top = 8.dp),
            color = Color(0xFF4CAF50)
        )
    }
}