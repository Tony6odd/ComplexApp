package com.roja.complexapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.roja.complexapp.ui.theme.ComplexAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComplexAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Complex()
                }
            }
        }
    }
}

@Composable
fun Complex() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Encabezado
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(top = 45.dp)
                .background(Color.Cyan)
        ) {
            Text(text = "Encabezado", modifier = Modifier.align(Alignment.Center))
        }

        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Blue)
                    .fillMaxHeight()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Caja 1")
                    Button(onClick = { /*TODO*/ }) {
                        Text("Botón 1")
                    }
                }
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Red)
                    .fillMaxHeight()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Caja 2")
                    Button(onClick = { /*TODO*/ }) {
                        Text("Botón 2")
                    }
                }
            }
        }

        LazyColumn(
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth()
        ) {
            items(10) { index ->
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(80.dp)
                        .background(Color.LightGray, shape = RoundedCornerShape(16.dp))
                ) {
                    Text(
                        text = "Elemento #$index",
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(start = 16.dp)
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Pie de página", color = Color.White)
        }
    }
}
