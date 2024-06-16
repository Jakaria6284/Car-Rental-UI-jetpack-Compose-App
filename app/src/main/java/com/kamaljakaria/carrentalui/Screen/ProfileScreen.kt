package com.kamaljakaria.carrentalui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import coil.compose.rememberImagePainter
import com.kamaljakaria.carrentalui.ViewModel.viewmodel

@Composable
fun ProfileScreen(viewmodel: viewmodel= viewmodel())
{
   val items by viewmodel.items.observeAsState(emptyList())
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

        )
    {
        val immageurl=items.firstOrNull()?.image?:""
   Image(painter = rememberImagePainter(immageurl) , contentDescription = null)

    }
}