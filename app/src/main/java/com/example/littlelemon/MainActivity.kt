package com.example.littlelemon

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.navigation.LittleLemonNavigation
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {



val sharedPreferences by lazy { getSharedPreferences("Little Lemon", Activity.MODE_PRIVATE) }
override fun onCreate(savedInstanceState: Bundle?) {


    super.onCreate(savedInstanceState)
    setContent {
        LittleLemonTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                val navController = rememberNavController()
                LittleLemonNavigation(context = applicationContext,navController = navController)
            }
        }
    }
}
}