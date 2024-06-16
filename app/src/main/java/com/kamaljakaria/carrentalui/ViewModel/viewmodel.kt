package com.kamaljakaria.carrentalui.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kamaljakaria.carrentalui.Data.fetchAll
import com.kamaljakaria.carrentalui.Data.fireData
import com.kamaljakaria.carrentalui.Data.repository
import kotlinx.coroutines.launch

class viewmodel: ViewModel() {
    val Repository=repository()
    private val _items = MutableLiveData<List<fireData>>()
    val items: LiveData<List<fireData>> = _items

    init {
         fetchAll()
    }

    private fun fetchAll()
    {
        viewModelScope.launch {
            _items.value=Repository.fetchAlldata()
        }
    }

}