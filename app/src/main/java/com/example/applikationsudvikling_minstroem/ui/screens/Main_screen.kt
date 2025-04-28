package com.example.applikationsudvikling_minstroem.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.applikationsudvikling_minstroem.R
import com.example.applikationsudvikling_minstroem.navigation.Routes

@Composable
fun Main_screen(navController: NavController) {
    Button(onClick = {
        navController.navigate(Routes.screen_b)
    }) {
        Text(text = "Next Screen")
    }
}



var apparater = listOf("Vaskemaskine", "Tørretumbler", "Ovn", "El-cykel", "Opvaskemaskine", "Add")

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Devices () {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Planlæg apparater")

        FlowRow(maxItemsInEachRow = 3) {
            for (apparat in apparater) {
                Column {
                    Text(apparat)

                    Button(
                        modifier = Modifier

                            .height(100.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.vector),
                            contentDescription = "Button Icon",
                            modifier = Modifier.size(60.dp)
                        )
                    }

                }

            }

        }


    }
}
