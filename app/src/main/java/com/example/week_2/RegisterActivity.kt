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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week_2.ui.theme.Week_2Theme
import com.example.week_2.ui.theme.poppins

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RegisterView()
                }
            }
        }
    }
}

@Composable
fun RegisterView() {
    Column(
        modifier = Modifier
            .background(Color(0xFFFFC0CB))
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
        }

        Image(
            painter = painterResource(id = R.drawable.registerlogo),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(30.dp))

        Surface(
            modifier = Modifier
                .height(700.dp)
                .fillMaxWidth(),
            color = Color.LightGray,
            shape = RoundedCornerShape(topStart = 45.dp, topEnd = 45.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Create New Account",
                    fontFamily = poppins,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(20.dp),
                    fontSize = 25.sp,)
                RegisForm()
            }
        }

    }
}

@Composable
fun RegisForm() {
    Surface(
        modifier = Modifier
            .height(500.dp)
            .fillMaxWidth(),
        color = Color.White,
        shape = RoundedCornerShape(topStart = 45.dp, topEnd = 45.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.facebook_icon),
                    contentDescription = "facebook",
                    modifier = Modifier
                        .size(width = 60.dp, height = 60.dp)
                        .padding(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.x_icon),
                    contentDescription = "x",
                    modifier = Modifier
                        .size(width = 60.dp, height = 60.dp)
                        .padding(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.google_icon),
                    contentDescription = "google",
                    modifier = Modifier
                        .size(width = 60.dp, height = 60.dp)
                        .padding(10.dp))
            }
            Text(
                text = "or use your email account",
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .padding(5.dp),
                fontSize = 12.sp,
                color = Color.Gray)

            Column() {
                Text(
                    text = "Name",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp),
                    fontSize = 15.sp)
                OutlinedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surface),
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .padding(start = 20.dp, end = 20.dp)
                ) {
                    Text(
                        text = "Ex : Jane Doe",
                        modifier = Modifier
                            .padding(start = 10.dp, top = 8.dp),
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                }

                Text(
                    text = "Email",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp),
                    fontSize = 15.sp,)
                OutlinedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surface),
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .padding(start = 20.dp, end = 20.dp)
                ) {
                    Text(
                        text = "Ex : janedoe@example.com",
                        modifier = Modifier
                            .padding(start = 10.dp, top = 8.dp),
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                }

                Text(
                    text = "Password",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp),
                    fontSize = 15.sp,)
                OutlinedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surface),
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .padding(start = 20.dp, end = 20.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Enter Password",
                            modifier = Modifier
                                .padding(start = 10.dp, top = 8.dp),
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                        Image(
                            painter = painterResource(id = R.drawable.baseline_visibility_off_16),
                            contentDescription = "pass",
                            modifier = Modifier
                                .padding(end = 20.dp, top = 8.dp)
                                .size(width = 25.dp, height = 25.dp))
                    }
                }
            }

            Button(
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF84E59)),
                modifier = Modifier.padding(10.dp),
                onClick = {},
            ) {
                Text(
                    text ="Register",
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    color = Color.White)
            }
            Text(
                text = "Already have an account?",
                fontFamily = poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp)
            Text(
                text = "Login",
                fontFamily = poppins,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFF84E59),
                fontSize = 15.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview4() {
    Week_2Theme {
        RegisterView()
    }
}