package com.example.week_2

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week_2.ui.theme.Week_2Theme
import java.time.format.TextStyle

class QuadranActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadranView()
                }
            }
        }
    }
}

@Composable
fun QuadranView() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            CellView(title = "Text Composable",
                desc = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFEADDFF)))
            CellView(title = "Image Composable",
                desc = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFD0BCFF)))
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            CellView(title = "Row Composable",
                desc = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8)))
            CellView(title = "Column Composable",
                desc = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF)))
        }
    }
}

@Composable
fun CellView(title: String, desc: String, modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextStyle(
            title,
            FontWeight.Bold,
            TextAlign.Center,
            Modifier.padding(bottom = 16.dp))
        TextStyle(
            desc,
            FontWeight.Normal,
            TextAlign.Justify,
            Modifier.padding(15.dp))
    }
}

@Composable
fun TextStyle(
    text: String, 
    fontWeight: FontWeight, 
    textAlign: TextAlign,
    modifier: Modifier,
) {
    Text(
        text = text,
        fontWeight = fontWeight,
        textAlign = textAlign,
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadranPreview() {
    Week_2Theme {
        QuadranView()
    }
}