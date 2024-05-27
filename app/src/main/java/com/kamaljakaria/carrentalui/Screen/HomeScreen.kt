package com.kamaljakaria.carrentalui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamaljakaria.carrentalui.Data.fetchAll
import com.kamaljakaria.carrentalui.Data.getAllData

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Row {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.MoreVert, contentDescription = null, tint = Color.White)
            }
            Spacer(modifier = Modifier.weight(0.6f))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.LocationOn, contentDescription = null, tint = Color.White)
            }
            Text(text = "New Jersy", style = TextStyle(
               fontSize = 16.sp,
                fontWeight = FontWeight.W900,
                color = Color.White

            ),
                modifier = Modifier.padding(top = 13.dp)
                )
        }
        Row( modifier = Modifier.padding(top = 30.dp)) {
            Text(text = "Your Ideal\nCar Awaits", style = TextStyle(
                fontSize = 26.sp,
                fontWeight = FontWeight.W900,
                color = Color.White

            ),
                modifier = Modifier.padding(top = 13.dp, start = 15.dp)
            )
            Spacer(modifier = Modifier.weight(0.6f))

           Box(
               modifier = Modifier
                   .size(width = 150.dp, height = 70.dp)
                   .clip(RoundedCornerShape(topStart = 50.dp, bottomStart = 50.dp))
                   .background(Color(0xFF4B4141))
                   .padding(top = 16.dp),
               contentAlignment = Alignment.Center
           ) {
               IconButton(onClick = { /*TODO*/ }) {
                   Icon(Icons.Default.Search, contentDescription = null, tint = Color.White, modifier = Modifier
                       .size(50.dp, 50.dp)
                       .padding(bottom = 13.dp))
               }
           }
        }

        LazyColumn(modifier = Modifier.padding(top = 30.dp)) {
            val myList= fetchAll()
            itemsIndexed(myList, itemContent = {index, item ->
                lazyColumnItem(item = item)

            })
        }



    }
}

@Composable
fun lazyColumnItem(item:getAllData){

    Box(modifier = Modifier
        .fillMaxWidth()
        .height(300.dp)
        .padding(start = 10.dp, end = 10.dp, bottom = 5.dp)
        .clip(RoundedCornerShape(25.dp))) {
        Box(modifier = Modifier
            .fillMaxSize()) {

                Image(painter = painterResource(id = item.imag), contentDescription =null, contentScale = ContentScale.Crop)



        }


    }
    Spacer(modifier = Modifier.height(20.dp))
}