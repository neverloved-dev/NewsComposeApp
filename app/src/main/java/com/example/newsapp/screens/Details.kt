package com.example.newsapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Details(navController: NavController){
    Text(text = "Details page", modifier = Modifier.clickable {
        navController.popBackStack()
    })
}

@Preview(showBackground = true)
@Composable
fun DetailsPreview(){
    Details(navController = rememberNavController())
}