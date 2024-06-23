package com.example.primerparcial

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun Page2(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    Column {
        Text(
            text = "Bienvenido",
            modifier = modifier
        )
        Text(
            text = "Pedro Pe",
            modifier = modifier
        )
    }

}

@Preview(showBackground = true)
@Composable
fun Page2Preview() {
    val navController = rememberNavController()
    PrimerParcialTheme {
        Page1(modifier = Modifier,navController = navController)
    }
}