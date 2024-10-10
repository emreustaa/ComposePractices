package com.development.composeintro

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
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
import androidx.compose.ui.unit.sp
import com.development.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomText(text = "Hello Android")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello World")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello Kotlin")
        Spacer(modifier = Modifier.padding(5.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomText(text = "Test 1")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Test 2")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Test 3")
        }
    }
}

@Composable
fun CustomText(text: String) {
    Text(modifier = Modifier
        .clickable {
            println("Clicked")
        }
        .background(Color.Black)
        .padding(start = 4.dp, top = 10.dp, end = 1.dp, bottom = 30.dp)

        //.width(150.dp)
        //.fillMaxSize(0.5f)
        //.fillMaxHeight()
        //.fillMaxWidth()
        ,
        textAlign = TextAlign.Center,
        text = text,
        color = Color.White,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainScreen()
}