package com.example.wbtechnoschoollesson2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.wbtechnoschoollesson2.ui.theme.WBTechnoschoolLesson2Theme
import com.example.wbtechnoschoollesson2.uiKitScreen.UiKitScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WBTechnoschoolLesson2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UiKitScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}






