package com.aire.fordapp.routes

sealed class RoutesGeneral(val route : String) {
    data object LoginScreen : RoutesGeneral("login")
    data object DashboardScreen : RoutesGeneral("dashboard")
}