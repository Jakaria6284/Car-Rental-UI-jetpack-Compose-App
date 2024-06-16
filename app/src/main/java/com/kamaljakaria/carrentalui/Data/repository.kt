package com.kamaljakaria.carrentalui.Data

import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class repository {
    private val db=FirebaseFirestore.getInstance();

    suspend fun fetchAlldata():List<fireData>
    {
        return  try {
            val result=db.collection("car").get().await()
            result.documents.map { documentSnapshot ->
                fireData(
                    image= documentSnapshot.getString("img")?:"",
                )
            }

        }catch (e:Exception)
        {
            emptyList()
        }
    }

}