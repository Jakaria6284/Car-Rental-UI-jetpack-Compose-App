package com.kamaljakaria.carrentalui.Data

import com.kamaljakaria.carrentalui.R

data class getAllData(
    val id:Int,
    val imag:Int,
    val name:String,
    val quality:String,
    val type:String,
    val price:String
)

fun fetchAll():List<getAllData>{
    return listOf<getAllData>(
        getAllData(1,R.drawable.pexels_mayday,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(2,R.drawable.car2,"Mercedes","Excellent","Manual","900000/USD Dollar"),
        getAllData(3,R.drawable.car3,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(4,R.drawable.car4,"Tesla","Excellent","Manual","900000/USD Dollar"),
        getAllData(5,R.drawable.car1,"Mercedes","Excellent","Manual","900000/USD Dollar"),
        getAllData(6,R.drawable.car2,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(7,R.drawable.car4,"Toyota","Excellent","Manual","900000/USD Dollar"),
        getAllData(8,R.drawable.car3,"Nissan","Excellent","Manual","900000/USD Dollar"),
        getAllData(9,R.drawable.car1,"BMW","Excellent","Manual","900000/USD Dollar"),
    )
}