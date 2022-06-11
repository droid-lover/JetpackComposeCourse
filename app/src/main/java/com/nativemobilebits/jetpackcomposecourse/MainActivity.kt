package com.nativemobilebits.jetpackcomposecourse

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nativemobilebits.jetpackcomposecourse.ui.theme.JetpackComposeCourseTheme

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
    Surface(
        color = Color.Gray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row {
            HorizontalBar(color = Color.Yellow)
            HorizontalBar(color = Color.Red)
            HorizontalBar(Color.Green)
            HorizontalBar(color = Color.Blue)
        }

    }
}

@Composable
fun HorizontalBar(color: Color){
    Surface(
        color = color,
        modifier = Modifier
            .fillMaxHeight()
            .width(40.dp)
    ) {

    }
}


@Composable
fun WelcomeText(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentSize(align = Alignment.CenterStart)
            .padding(
                20.dp
            ),
        style = MaterialTheme.typography.h4,
        color = Color.Blue

    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}
