package com.example.github_basics.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PracticeScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Practice Now!")

        MyButton()
        MyCard()


    }

}

@Composable
fun MyButton(){
    Button(
        modifier = Modifier.padding(top = 30.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
        onClick = { /*TODO*/ }) {
        Text(text = "testing branch button")
    }
}

@Composable
fun MyCard(){
    Card(
        modifier = Modifier
            .width(300.dp)
            .height(60.dp)

    ) {
        Text(text = "ddjkd")
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewPracticeScreen(){
    PracticeScreen()
}