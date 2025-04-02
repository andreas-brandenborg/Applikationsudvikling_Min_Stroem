package com.example.applikationsudvikling_minstroem.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.applikationsudvikling_minstroem.ui.screens.Main_screen
import com.example.applikationsudvikling_minstroem.ui.screens.Screen_B

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.mainScreen, builder = {
        composable(Routes.mainScreen){
            Main_screen(navController)
        }
        composable(Routes.screen_b){
            Screen_B(navController)
        }
    })
}

// Funky banana push comment. Nu stopper du!
