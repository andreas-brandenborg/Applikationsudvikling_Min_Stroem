package com.example.applikationsudvikling_minstroem.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.applikationsudvikling_minstroem.R
import com.example.applikationsudvikling_minstroem.navigation.Routes

val dates = listOf("I dag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag")
val currentDate = "29/04/2025"

@Composable
fun Main_screen(navController: NavController) {
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
            GraphSection(dates)
            MiddleScreen()
            Devices()
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

@Preview(showBackground = true, backgroundColor = 0xffffffff)
@Composable
fun GraphPreview() {
    Devices()
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
            Text("Elpriser $currentDate")
            Image(
                painter = painterResource(id = R.drawable.graph),
                contentDescription = "Graph of electricity prices",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun MiddleScreen () {
    Column (horizontalAlignment = Alignment.CenterHorizontally) {
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
    Column {
        Text("Planlæg apparater", fontSize = 36.sp)
        FlowRow(
            maxItemsInEachRow = 3,
            horizontalArrangement = Arrangement.Center) {
            for (apparat in apparater) {
                Column {
                    Text(apparat, textAlign = TextAlign.Center)

                    Button(
                        modifier = Modifier
                            .height(100.dp)
                            .padding(5.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFBABABA)),
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
