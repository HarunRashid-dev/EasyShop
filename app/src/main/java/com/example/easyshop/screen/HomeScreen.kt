package com.example.easyshop.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigator
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import kotlinx.coroutines.selects.select

@Composable
fun HomeScreen(modifier: Modifier = Modifier,navController: NavController){

    val navItemList = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Favorite", Icons.Default.Favorite),
        NavItem("Cart", Icons.Default.ShoppingCart),
        NavItem("Profile", Icons.Default.Person),
        )
}

@Composable
fun NavItem(x0: String, x1: ImageVector) {
    TODO("Not yet implemented")
}
Scaffold (
        bottomBar = {
        NavigatorBar{
            NavigationBarItem(
                selected = false,
                onClick ={  },
                icon = {
                    Icon(imageVector = Icon.Default.ShoppingCart, contentDescription = "cart")
                },
                label = { Text(text = "Cart")}
            )
            NavigatorBar{
                NavigationBarItem(
                    selected = false,
                    onClick ={  },
                    icon = {
                        Icon(imageVector = Icon.Default.ShoppingCart, contentDescription = "cart")
                    },
                    label = { Text(text = "Cart")}
                )
                NavigatorBar{
                    NavigationBarItem(
                        selected = false,
                        onClick ={  },
                        icon = {
                            Icon(imageVector = Icon.Default.ShoppingCart, contentDescription = "cart")
                        },
                        label = { Text(text = "Cart")}
                    )
        }
    }
    ){

        ContentScreen(modifier = modifier.padding(it))
    }
        }

@Composable
fun ContentScreen(modifier: Modifier = Modifier){

}

            data class NavItem( new*
            val label : String,
                val icon : ImageVector
            )