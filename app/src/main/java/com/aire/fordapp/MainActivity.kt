package com.aire.fordapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aire.fordapp.routes.RoutesGeneral
import com.aire.fordapp.ui.screens.DashboardScreen
import com.aire.fordapp.ui.screens.HomeScreen
import com.aire.fordapp.ui.screens.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = RoutesGeneral.LoginScreen.route){
                composable(RoutesGeneral.LoginScreen.route){
                    LoginScreen(navController = navController)
                }
                composable(RoutesGeneral.DashboardScreen.route){
                    DashboardScreen()
                }
            }
        }
    }
}

