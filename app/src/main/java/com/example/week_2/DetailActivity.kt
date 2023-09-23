package com.example.week_2

import android.os.Bundle
import android.webkit.WebSettings.TextSize
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.example.week_2.ui.theme.Week_2Theme
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.example.week_2.ui.theme.poppins

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview2()
                }
            }
        }
    }
}

@Composable
fun ProductDetail() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "Back Arrow",
                modifier = Modifier.padding(10.dp))
            Text(
                text = "Krabby Patty",
                fontSize = 25.sp,
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(10.dp))
            Image(
                painterResource(id = R.drawable.round_menu_24),
                contentDescription = "Back Arrow",
                modifier = Modifier.padding(10.dp))
        }
        Image(
            painter = painterResource(id = R.drawable.burger),
            contentDescription = "Burger",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp))
        Image(
            painter = painterResource(id = R.drawable.baseline_circle_10),
            contentDescription = "Dot",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 10.dp))
        Card()
    }
}

@Composable
fun Styling(text: String,
            fontWeight: FontWeight,
            textAlign: TextAlign,
            modifier: Modifier,
            color: Color,
            size: Int
) {
    Text(
        text = text,
        fontFamily = poppins,
        fontWeight = fontWeight,
        textAlign = textAlign,
        modifier = modifier,
        color = color,
        fontSize = size.sp
    )
}

@Composable
fun Card() {
    Surface(
        modifier = Modifier
            .height(500.dp)
            .fillMaxWidth(),
        color = Color(0xFF283444),
        shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Styling(
                text = "King Box Cheesy Beef Burger",
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp),
                Color.White,
                size = 23)
            Row(){
                Image(
                    painter = painterResource(id = R.drawable.baseline_star_24),
                    contentDescription = "Star",
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp))
                Styling(
                    text = "5.0",
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(3.dp),
                    color = Color.LightGray,
                    size = 15)
                Styling(
                    text = "(684 Reviews)",
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(3.dp),
                    color = Color.Gray,
                    size = 15)
            }
            Styling(
                text = "Cheesey Beef Burger + 1 Pc Ayam Crispy + Nasi + Coke Reguler + Spider-Verse Toys: Brooklyn Sky Scraper + Super Flat Coke",
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                modifier = Modifier.padding(start = 20.dp, top = 5.dp),
                color = Color.White,
                size = 20)
            Text(
                text = "Read More...",
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .padding(start = 20.dp, top = 5.dp),
                color = Color.White,
                fontSize = 20.sp,
                textDecoration = TextDecoration.Underline)
            Row(modifier = Modifier
                .padding(start = 20.dp, top = 25.dp, end = 20.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Rp. 40,909",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    color = Color.White,
                    fontSize = 25.sp)

                Button(
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    onClick = {},
                ) {
                    Text(
                        text ="Add to Cart",
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    Week_2Theme {
        ProductDetail()
    }
}