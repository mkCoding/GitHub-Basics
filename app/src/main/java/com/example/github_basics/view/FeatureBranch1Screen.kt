package com.example.github_basics.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun FeatureBranch1Screen(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){
        Text(
            text = "Feature Branch 1 Changes",
            style = TextStyle(fontSize = 20.sp)
        )

        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "Hello World",
            style = TextStyle(fontSize = 20.sp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFeatureBranch1Screen(){
    FeatureBranch1Screen()
}