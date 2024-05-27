package com.kamaljakaria.carrentalui.Data

import com.kamaljakaria.carrentalui.R

data class getAllData(
    val imag:Int,
    val name:String,
    val quality:String,
    val type:String,
    val price:String
)

fun fetchAll():List<getAllData>{
    return listOf<getAllData>(
        getAllData(R.drawable.car1,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(R.drawable.car2,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(R.drawable.car3,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(R.drawable.car4,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(R.drawable.car1,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(R.drawable.car2,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(R.drawable.car4,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(R.drawable.car3,"BMW","Excellent","Manual","900000/USD Dollar"),
        getAllData(R.drawable.car1,"BMW","Excellent","Manual","900000/USD Dollar"),
    )
}
