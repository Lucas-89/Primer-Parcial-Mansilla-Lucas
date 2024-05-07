package com.example.primerparcial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun MainPage(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    val usuario = "pedro@pe.com.ar"
    val contraseña = "abc123"

    var mail by remember { mutableStateOf("")}
    var pass by remember { mutableStateOf("")}

    Column (

    ){
        Text(
            text = "Pagina de Ingreso",
            modifier = modifier
        )
        TextField(
            value = "",
            onValueChange ={},
            label = { Text(text = "mail")},
            modifier = modifier
                .padding(20.dp)
                .fillMaxWidth()
        )
        TextField(
            value = "",
            onValueChange ={},
            label = { Text(text = "contraseña")},
            modifier = modifier
                .padding(20.dp)
                .fillMaxWidth()
        )
        Button(onClick = {
            if (mail == usuario && pass == contraseña){
                navController.navigate("page1")
            }
        },
            modifier
                .align(Alignment.CenterHorizontally)
                .padding(10.dp)) {
            Text(
                text = "Ingresar",
                modifier = modifier.padding(horizontal = 5.dp)
            )
        }
    }
    NavHost(
        navController = navController,
       // modifier = Modifier.padding(it),
        startDestination = ""
    ) {
      //  composable("page1") { Page1(navController = navController) }
        // comentado porque no funciona 
    }
}


@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    PrimerParcialTheme {
        MainPage()
    }
}