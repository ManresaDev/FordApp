package com.aire.fordapp.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aire.fordapp.routes.RouteBottomBar

@Composable
fun DashboardScreen(){
    val navControllerBottombar = rememberNavController()
    Scaffold(
        bottomBar = {
            CustomBottomBar(navControllerBottombar)
        }
    ) {

        NavHost(modifier = Modifier.padding(bottom = it.calculateBottomPadding()),navController = navControllerBottombar, startDestination = RouteBottomBar.HomeScreen.route ){
            composable(RouteBottomBar.HomeScreen.route){
                HomeScreen()
            }
            composable(RouteBottomBar.SearchScreen.route){
                SearchScreen()
            }
            composable(RouteBottomBar.ProfileScreen.route){
                ProfileScreen()
            }
            composable(RouteBottomBar.FavouriteScreen.route){
                FavouriteScreen()
            }
        }

    }
}

@Composable
fun CustomBottomBar(navControllerBottombar: NavHostController) {
    BottomAppBar {
        NavigationBarItem(selected = false, onClick = { navControllerBottombar.navigate(RouteBottomBar.HomeScreen.route) }, icon = { Icon(
            imageVector = Icons.Filled.Home,
            contentDescription = null
        ) })
        NavigationBarItem(selected = false, onClick = {navControllerBottombar.navigate(RouteBottomBar.FavouriteScreen.route) }, icon = {
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = null
            )
        })
        NavigationBarItem(selected = false, onClick = {navControllerBottombar.navigate(RouteBottomBar.SearchScreen.route) }, icon = {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = null
            )
        })
        NavigationBarItem(selected = false, onClick = { navControllerBottombar.navigate(RouteBottomBar.ProfileScreen.route)}, icon = {
            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = null
            )
        })
    }
}