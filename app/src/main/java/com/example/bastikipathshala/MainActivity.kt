package com.example.bastikipathshala

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bastikipathshala.navigation.Screen
import com.example.bastikipathshala.screen.AboutScreen
import com.example.bastikipathshala.screen.FormScreen
import com.example.bastikipathshala.screen.HomeScreen
import com.example.bastikipathshala.ui.theme.BastiKiPathShalaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BastiKiPathShalaTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Screen.Home.route
                ) {
                    composable(Screen.Home.route) {
                        HomeScreen(navController)
                    }
                    composable(Screen.Form.route) {
                        FormScreen(navController)
                    }
                    composable(Screen.About.route) {
                        AboutScreen(navController)
                    }
                }

            }
        }
    }
}
