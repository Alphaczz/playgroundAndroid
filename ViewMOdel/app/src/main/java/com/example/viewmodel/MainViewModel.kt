package com.example.viewmodel
import androidx.lifecycle.ViewModel
 class MainViewModel(startingNum: Int) :ViewModel() {
  private  var counter=startingNum
     fun getCurrentCount():Int{
         return counter
     }
     fun getUpdatedCount():Int{
         return  ++counter
     }
     fun getDecreaseCount():Int{
         return --counter
     }


 }