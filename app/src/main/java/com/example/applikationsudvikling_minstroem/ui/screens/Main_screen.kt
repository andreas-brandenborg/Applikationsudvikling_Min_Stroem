package com.example.applikationsudvikling_minstroem.ui.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.applikationsudvikling_minstroem.navigation.Routes

@Composable
fun Main_screen(navController: NavController) {
    Button(onClick = {
        navController.navigate(Routes.screen_b)
    }) {
        Text(text = "Next Screen")
    }
}