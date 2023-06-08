package com.example.livedata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class mainViewModelFactory(private val perTotal:Int):ViewModelProvider.Factory
{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(mainActivityViewModel::class.java))
        {
            return  mainActivityViewModel(perTotal )as T
        }
        throw IllegalArgumentException("Unknown View Model")
    }
}