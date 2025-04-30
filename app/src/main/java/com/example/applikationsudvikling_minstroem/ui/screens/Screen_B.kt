package com.example.applikationsudvikling_minstroem.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.applikationsudvikling_minstroem.R
import com.example.applikationsudvikling_minstroem.navigation.Routes

@Composable
fun Screen_B(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF3F2F8))) {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .padding(top = 15.dp)
                .padding(bottom = 80.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Header()
            PlanDevice()
            FindTimeButton()
            CheapestOption()
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .align(Alignment.BottomCenter),
        ) {
            Image(
                painter = painterResource(R.drawable.navbar),
                contentDescription = "Navbar",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        }
    }
}

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            modifier = Modifier.align(Alignment.CenterStart),
            onClick = {}
        ) { Text("Back") }
        Text("Planlæg Ovn",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp)
    }
}

@Composable
fun PlanDevice() {
    var text by remember { mutableStateOf("Hello") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )
}

@Composable
fun FindTimeButton() {
    Text("Find tider")
}

@Composable
fun CheapestOption() {
    Text("Billigste tid")
}