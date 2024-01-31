package com.example.newsapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.newsapp.screens.Details
import com.example.newsapp.screens.Headlines

@Composable
fun SetUpNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = NewsApp.Headlines.route){
        composable(route = NewsApp.Headlines.route){
            Headlines(navController)
        }
        composable(route = NewsApp.Details.route){
            Details(navController = navController)
        }
    }
}