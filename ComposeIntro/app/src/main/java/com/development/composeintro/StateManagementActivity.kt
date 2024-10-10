package com.development.composeintro

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.development.composeintro.ui.theme.ComposeIntroTheme

class StateManagementActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainFunction()
        }
    }
}

@Composable
fun MainFunction() {

    Surface(color = Color.LightGray) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hello",
                fontSize = 26.sp
            )

            Spacer(modifier = Modifier.padding(7.dp))

            Button(onClick = {
                Log.e("Status", "Clicked")
            }) {
                Text(text = "Button")
                Text(text = "Test")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.logo), contentDescription = "" )

            Spacer(modifier = Modifier.padding(7.dp))


            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)

            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    MainFunction()
}