package com.example.applikationsudvikling_minstroem.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.applikationsudvikling_minstroem.R
import com.example.applikationsudvikling_minstroem.navigation.Routes

val dates = listOf("I dag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag")
val currentDate = "29/04/2025"

@Composable
fun Main_screen(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .padding(top = 15.dp)
    ) {
        GraphSection(dates)
        Button(onClick = {
            navController.navigate(Routes.screen_b)
        }) {
            Text(text = "Next Screen")
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xffffffff)
@Composable
fun GraphPreview() {
    GraphSection(dates)
}

@Composable
fun GraphSection(days: List<String>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(14.dp),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            items(days.size) { index ->
                Text(text = days[index],
                    fontWeight = FontWeight.W500,
                    fontSize = 16.sp)
            }
        }
        Column {
            Text("Elpriser $")
            Image(
                painter = painterResource(id = R.drawable.graph),
                contentDescription = "Graph of electricity prices",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}