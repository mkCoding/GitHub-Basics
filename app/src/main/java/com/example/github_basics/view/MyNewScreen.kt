package com.example.github_basics.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MyNewScreen(){
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Hello World", style = TextStyle(fontSize = 40.sp))
        Text(text = "Good Bye World", style = TextStyle(fontSize = 40.sp))
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewMyNewScreen(){
    MyNewScreen()
}