package com.example.applikationsudvikling_minstroem.ui.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.applikationsudvikling_minstroem.navigation.Routes

@Composable
fun Screen_B(navController: NavController) {
    Button(onClick = {
        navController.navigate(Routes.mainScreen)
    }) {
        Text(text = "Main_screen")
    }
}