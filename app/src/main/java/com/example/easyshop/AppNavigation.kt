package com.example.easyshop

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easyshop.screen.AuthScreen
import com.example.easyshop.screen.HomeScreen
import com.example.easyshop.screen.LoginScreen
import com.example.easyshop.screen.SignupScreen
import com.google.firebase.Firebase
import com.google.firebase.auth.auth


@Composable
fun AppNavigation(modifier : Modifier = Modifier){

    val navController = rememberNavController()

    val isLoggedIn = Firebase.auth.currentUser!=null
    val firstPag = if(isLoggedIn) "home" else "auth"

    NavHost(navController = navController, startDestination = firstPag) {

        composable("auth") {
            AuthScreen(modifier,navController)
        }

        composable("login") {
            LoginScreen(modifier,navController)
        }

        composable("signup") {
            SignupScreen(modifier,navController)
        }

        composable ("home"){
            HomeScreen(modifier,navController)
        }

    }

}
