package com.example.applikationsudvikling_minstroem.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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






@Composable
fun MiddleScreen () {
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = {},
            modifier = Modifier
                .height(60.dp)
                .width(350.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFDAEBFF),
                contentColor = Color.Unspecified
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Black)) {
                        append("Gns. besparelse for idag ")
                    }
                    withStyle(style = SpanStyle(color = Color(0xFF4CAF50))) {
                        append("12,6kr.")
                    }
                },
                fontSize = 20.sp
            )
        }


        Spacer(modifier = Modifier.height(16.dp))


        Button(
            onClick = {},
            modifier = Modifier
                .height(60.dp)
                .width(350.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFDAEBFF)
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Black)) {
                        append("Din totale besparelse ")
                    }
                    withStyle(style = SpanStyle(color = Color(0xFF4CAF50))) {
                        append("0 Kr.")
                    }
                },
                fontSize = 20.sp
            )
        }
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

                            .height(100.dp)
                            .padding(end = 10.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                        shape = RoundedCornerShape(20.dp)
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
