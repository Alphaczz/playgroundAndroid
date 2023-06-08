package com.example.livedata

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.set
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: mainActivityViewModel
    lateinit var viewModelFactory: mainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModelFactory= mainViewModelFactory(0)
        viewModel=ViewModelProvider(this,viewModelFactory).get(mainActivityViewModel::class.java)

        //Observing for any Data Change
        viewModel.totalSum.observe(
            this, Observer { binding.result.text=it.toString() }
        )
        binding.btn.setOnClickListener{viewModel.setTotal(binding.editText.text.toString().toInt())}
    }
}