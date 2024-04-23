package com.example.app_exemplo.componentes

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.app_exemplo.SimpleTextField

@Preview
@Composable

fun SimpleTextField (){

    var text by remember { mutableStateOf("") }

    TextField(value = text, onValueChange = {}, label= { Text(text= "Nome")})
}
