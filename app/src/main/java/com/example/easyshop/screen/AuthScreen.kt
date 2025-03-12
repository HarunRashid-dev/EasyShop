package com.example.easyshop.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun AuthScreen(modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.banner),
            contentDescription = "Banner"
        )
    }
}