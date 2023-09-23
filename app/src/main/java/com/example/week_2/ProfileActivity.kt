package com.example.week_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week_2.ui.theme.Week_2Theme
import com.example.week_2.ui.theme.poppins

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileView()
                }
            }
        }
    }
}

@Composable
fun ProfileView() {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0424f6)),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(id = R.drawable.baseline_arrow_back_24_white),
                contentDescription = "Back Arrow",
                modifier = Modifier.padding(10.dp))
            Text(
                text = "Profile",
                fontSize = 25.sp,
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier.padding(10.dp))
            Image(
                painterResource(id = R.drawable.baseline_edit_24_white),
                contentDescription = "Edit",
                modifier = Modifier.padding(10.dp))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color(0xFF0424f6)),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Column() {
                Text(
                    text = "Ida Bagus Radhita Putra",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    color = Color.White,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 17.dp))
                Text(
                    text = "Ciputra University",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    color = Color.White,
                    fontSize = 15.sp)
            }
            Image(
                painter = painterResource(id = R.drawable.__j7iuo3_400x400),
                contentDescription = "profile",
                modifier = Modifier.clip(shape = RoundedCornerShape(50.dp)))
        }

        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .width(300.dp)
                .offset(x = 47.dp, y = -40.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            ) {
                Text(
                    text = "Personal Data",
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 5.dp),
                    fontFamily = poppins,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Divider()

                Row(
                    modifier = Modifier.fillMaxWidth() ,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text(
                            text = "NIDN",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(top = 5.dp),
                            fontSize = 12.sp,
                            color = Color.Gray)
                        Text(
                            text = "028104820",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color.Black)
                    }
                    Column() {
                        Text(
                            text = "Date of Birth",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(top = 5.dp),
                            fontSize = 12.sp,
                            color = Color.Gray)
                        Text(
                            text = "1 August 2005",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color.Black)
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth() ,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text(
                            text = "Occupation",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(top = 5.dp),
                            fontSize = 12.sp,
                            color = Color.Gray)
                        Text(
                            text = "Student",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color.Black)
                    }
                    Column() {
                        Text(
                            text = "Marital Status",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(top = 5.dp),
                            fontSize = 12.sp,
                            color = Color.Gray)
                        Text(
                            text = "Taken",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color.Black)
                    }
                }

                Column() {
                    Text(
                        text = "Email",
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(top = 5.dp),
                        fontSize = 12.sp,
                        color = Color.Gray)
                    Text(
                        text = "iradhita@student.ciputra.ac.id",
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        color = Color.Black)
                }
            }
        }

        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .width(300.dp)
                .offset(x = 47.dp, y = -30.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            ) {
                Text(
                    text = "Expertise",
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 5.dp),
                    fontFamily = poppins,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Divider()

                Column() {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.androidstudio_logo),
                            contentDescription = "AS",
                            modifier = Modifier
                                .size(width = 60.dp, height = 60.dp)
                                .padding(10.dp))
                        Text(
                            text = "Android Studio",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color.Black)
                    }
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.java_logo),
                            contentDescription = "Java",
                            modifier = Modifier
                                .size(width = 60.dp, height = 60.dp)
                                .padding(10.dp))
                        Text(
                            text = "Java Programming",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color.Black)
                    }
                }
            }
        }

        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .size(width = 300.dp, height = 180.dp)
                .offset(x = 47.dp, y = -20.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            ) {
                Text(
                    text = "Send A Message",
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 5.dp),
                    fontFamily = poppins,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Divider()

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedCard(
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White),
                        border = BorderStroke(1.dp, Color.Gray),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .padding(top = 10.dp)
                    ) {
                        Text(
                            text = "Write A Message",
                            modifier = Modifier
                                .padding(start = 10.dp, top = 4.dp),
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                    }
                    Button(
                        shape = RoundedCornerShape(25.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF0424f6)),
                        modifier = Modifier.padding(10.dp),
                        onClick = {},
                    ) {
                        Text(
                            text ="Send",
                            fontFamily = poppins,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            color = Color.White)
                    }
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    Week_2Theme {
        ProfileView()
    }
}