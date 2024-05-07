package com.example.primerparcial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun MainPage(modifier: Modifier = Modifier) {

    Column (

    ){
        Text(
            text = "Pagina de Ingreso",
            modifier = modifier
        )
        TextField(
            value = "mail",
            onValueChange ={},
            modifier = modifier.padding(20.dp)
                .fillMaxWidth()
        )
        TextField(
            value = "contraseña",
            onValueChange ={},
            modifier = modifier.padding(20.dp)
                .fillMaxWidth()
        )
        Button(onClick = { /*TODO*/ },
            modifier
                .align(Alignment.CenterHorizontally)
                .padding(10.dp)) {
            Text(
                text = "Ingresar",
                modifier = modifier.padding(horizontal = 5.dp)
            )
        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    PrimerParcialTheme {
        MainPage()
    }
}