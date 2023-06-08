package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainActivityViewModel(perTotal:Int):ViewModel()
{
    private var total=MutableLiveData<Int>()
    val totalSum:LiveData<Int> = total





    init {
        total.value=perTotal

    }
    fun setTotal(input:Int)
    {
        total.value=(total.value)?.plus(input)
    }
}