package com.example.primerparcial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun Page1(
    modifier: Modifier = Modifier,
    navController: NavHostController
    ) {
    val usuario = "pedro@pe.com.ar"
    val contraseña = "abc123"

    var mail by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    Column (
        modifier = modifier.padding(20.dp)
    ){
        Text(
            text = "Pagina de Ingreso",
            modifier = modifier
        )
        TextField(
            value = mail,
            onValueChange ={mail = it},
            label = { Text(text = "mail")},
            modifier = modifier
                .padding(20.dp)
                .fillMaxWidth()
        )
        TextField(
            value = pass,
            onValueChange ={pass = it},
            label = { Text(text = "contraseña")},
            modifier = modifier
                .padding(20.dp)
                .fillMaxWidth()
        )
        Button(onClick = {
            if (mail == usuario && pass == contraseña){
                navController.navigate("page2")
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

}

@Preview(showBackground = true)
@Composable
fun Page1Preview() {
    val navController = rememberNavController()
    PrimerParcialTheme {
        Page1(modifier = Modifier,navController = navController)
    }
}