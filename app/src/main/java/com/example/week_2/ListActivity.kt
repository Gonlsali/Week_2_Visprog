package com.example.week_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week_2.ui.theme.Week_2Theme
import com.example.week_2.ui.theme.poppins

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProductList()
                }
            }
        }
    }
}

@Composable
fun ProductList() {
    Column {
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
                text = "Your Cart",
                fontSize = 25.sp,
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(10.dp))
            Image(
                painterResource(id = R.drawable.round_menu_24),
                contentDescription = "Back Arrow",
                modifier = Modifier.padding(10.dp))
        }

        List(
            imagePath = R.drawable.burger1,
            menuDetail = "Plant Based Whopper",
            menuRate = R.drawable.cooking_emoji,
            menuSpice = 5,
            price = "12.000",
            qty = 8
        )
        List(
            imagePath = R.drawable.burger2,
            menuDetail = "Extra Spicy Chicken Burger",
            menuRate = R.drawable.chilli,
            menuSpice = 10,
            price = "36.000",
            qty = 5
        )
        List(
            imagePath = R.drawable.burger1,
            menuDetail = "BBQ Beef Rasher",
            menuRate = R.drawable.cooking_emoji,
            menuSpice = 5,
            price = "30.000",
            qty = 2
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Delivery Charges",
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                color = Color.Gray,
                fontSize = 12.sp)
            Text(
                text = "Free Delivery",
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Right,
                color = Color.Gray,
                fontSize = 12.sp,
                textDecoration = TextDecoration.Underline)
        }

        Divider()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Total Amount",
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                color = Color.Gray,
                fontSize = 12.sp)
            Text(
                text = "Rp. 78.000",
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Right,
                color = Color.Gray,
                fontSize = 12.sp)
        }

        Divider()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 10.dp, end = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedCard(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface),
                border = BorderStroke(1.dp, Color.Black),
                modifier = Modifier.size(width = 150.dp, height = 40.dp)
            ) {
                Text(
                    text = "Rp. 78.000",
                    modifier = Modifier
                        .padding(start = 30.dp, top = 8.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Button(
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF283444)),
                modifier = Modifier.size(width = 175.dp, height = 40.dp),
                onClick = {},
            ) {
                Text(
                    text ="Continue",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.White)
            }
        }

    }
}

@Composable
fun List(
    imagePath: Int,
    menuDetail: String,
    menuRate: Int,
    menuSpice: Int,
    price: String,
    qty: Int
) {
    Row(
        modifier = Modifier.padding(15.dp)
    ) {
        Image(
            painter = painterResource(id = imagePath),
            contentDescription = "$imagePath",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(125.dp)
                .clip(RoundedCornerShape(25.dp))
            )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Styling(
                text = "Krabby Patty",
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                modifier = Modifier.fillMaxWidth(),
                color = Color.Gray,
                size = 12)
            Styling(
                text = menuDetail,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left,
                modifier = Modifier.fillMaxWidth(),
                color = Color.Black,
                size = 20)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Rate - ",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Left)
                Image(
                    painter = painterResource(id = menuRate),
                    contentDescription = "Menu",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(12.dp))
                Text(
                    text = "Spicy level - $menuSpice / 10",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Left)
            }
            Text(
                text = "Rp. $price",
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                textAlign = TextAlign.Left)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "- $qty +",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Left)
                Image(
                    painter = painterResource(id = R.drawable.baseline_cancel_presentation_12),
                    contentDescription = "Cancel")
            }
        }
    }
    Divider()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    Week_2Theme {
        ProductList()
    }
}