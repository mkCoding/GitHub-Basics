package com.example.github_basics.view
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TestScreen(){
  Column(
      modifier = Modifier
          .fillMaxSize()
          .padding(16.dp),
      horizontalAlignment = Alignment.CenterHorizontally
  ) {
      Text(
          text = "hello",
          style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)
      )
  }

}


@Composable
@Preview (showBackground = true)
fun PreviewTestScreen(){
    TestScreen()
}