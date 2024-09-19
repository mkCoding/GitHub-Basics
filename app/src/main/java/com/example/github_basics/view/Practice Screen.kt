package com.example.github_basics.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PracticeScreen(){
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Practice Now!")
        Text(text = "John Jones!")
        Text(text = "Izzy Black!")
        Text(text = "Tony Tiger!")
        Text(text = "Practice Now!")
        Text(text = "Sue Ellen!")
        Text(text = "Bill Ding!")
        Text(text = "Tay Bull!")
        Text(text = "Sally Waltz!")
        Text(text = "Peter Pan!")
        Text(text = "Lacey Green!")
        Text(text = "Kung Pow!")
        Text(text = "Safety Cone!")
        Text(text = "Moon Shine!")
        Text(text = "Glenn Beck!")
        Text(text = "Jack Jumping!")
        Text(text = "Daisy Flower!")

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPracticeScreen(){
    PracticeScreen()
}