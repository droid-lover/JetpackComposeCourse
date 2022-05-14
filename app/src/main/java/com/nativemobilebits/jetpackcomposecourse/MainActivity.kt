package com.nativemobilebits.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nativemobilebits.jetpackcomposecourse.ui.theme.JetpackComposeCourseTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           WelcomeText(value = "Hello World")
        }
    }
}

@Composable
fun WelcomeText(value:String){
    Text(
        text = value,
        modifier = Modifier
            .width(100.dp)
            .height(80.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    WelcomeText(value = "Hello World")
}
