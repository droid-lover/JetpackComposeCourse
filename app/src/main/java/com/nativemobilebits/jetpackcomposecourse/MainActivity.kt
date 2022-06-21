package com.nativemobilebits.jetpackcomposecourse

import android.graphics.DrawFilter
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
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

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ImageSection(resource = R.drawable.electric_car)
                ImageSection(resource = R.drawable.tractor)
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
               ImageSection(resource = R.drawable.flight )
               ImageSection(resource = R.drawable.sailing)
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
               ImageSection(resource = R.drawable.two_wheeler)
               ImageSection(resource = R.drawable.snowmobile)
            }
        }

    }
}


@Composable
fun ImageSection(resource: Int) {
    Surface(
        modifier = Modifier
            .height(120.dp)
            .width(120.dp),
        color = Color.White
    ) {
        Image(
            painter = painterResource(id = resource),
            contentDescription = null
        )
    }
}

@Composable
fun SquareBar(color: Color) {

    Surface(
        color = color,
        modifier = Modifier
            .height(120.dp)
            .width(120.dp)
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
