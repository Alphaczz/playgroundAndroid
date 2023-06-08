package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var factory: MainActivityViewModelFactory
    lateinit var mainViewModel: MainViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
//viewModel factory
        factory=MainActivityViewModelFactory(100)
        mainViewModel=ViewModelProvider(this,factory).get(MainViewModel::class.java)
     binding.textView.text=mainViewModel.getCurrentCount().toString()
     binding.btn.setOnClickListener()
     {
         binding.textView.text=mainViewModel.getUpdatedCount().toString()
     }
        binding.btn2.setOnClickListener()
        {
            binding.textView.text=mainViewModel.getDecreaseCount().toString()
        }

    }
}