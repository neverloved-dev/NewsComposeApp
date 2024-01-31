package com.example.newsapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.newsapp.NewsApp


@Composable
fun Headlines(navController: NavController){
    Text(text = "Headlines", modifier = Modifier.clickable {
        navController.navigate(NewsApp.Details.route)
    })
}

@Preview(showBackground = true)
@Composable
fun HeadlinesPreview(){
    Headlines(navController = rememberNavController())
}