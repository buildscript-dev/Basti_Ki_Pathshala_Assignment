package com.example.bastikipathshala

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bastikipathshala.screen.AboutUsScreen
import com.example.bastikipathshala.screen.FormScreen
import com.example.bastikipathshala.screen.HomeScreen
import com.example.bastikipathshala.ui.theme.BastiKiPathShalaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BastiKiPathShalaTheme {
//                HomeScreen()
//                FormScreen()
                AboutUsScreen()
            }
        }
    }
}
