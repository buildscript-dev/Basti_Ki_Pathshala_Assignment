package com.example.bastikipathshala.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object About : Screen("about")
    object Form : Screen("form")
    object Result : Screen("result")

}
