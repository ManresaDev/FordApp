package com.aire.fordapp.routes

sealed class RouteBottomBar(val route : String) {
    data object HomeScreen : RouteBottomBar("home")
    data object FavouriteScreen : RouteBottomBar("favourite")
    data object SearchScreen : RouteBottomBar("search")
    data object ProfileScreen : RouteBottomBar("profile")
}