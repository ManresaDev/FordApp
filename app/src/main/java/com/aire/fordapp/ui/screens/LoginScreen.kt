package com.aire.fordapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.aire.fordapp.R

@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceAround) {
        Image(painter = painterResource(id = R.drawable.fordlogo), contentDescription = null)
        Column {
            TextField(
                value = email,
                onValueChange = {email = it}
            )
            TextField(
                value = password,
                onValueChange = {password = it}
            )
        }
        Button(
            onClick = {
                navController.navigate("home")
            },
            enabled = email.isNotEmpty() && password.isNotEmpty()
        ) {
            Text(text = "Login")
        }
    }
}