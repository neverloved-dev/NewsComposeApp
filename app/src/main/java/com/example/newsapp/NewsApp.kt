package com.example.newsapp

sealed class NewsApp (val route:String){
    object Details:NewsApp("details_screen")
    object Headlines:NewsApp("headlines_screen")
}