package com.example.challengeno1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.challengeno1.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        FromMainThread()
        FromIoThread()
        }
    private fun FromMainThread(){
        CoroutineScope(Dispatchers.Main).launch {
            binding.txtview1.text="Hello from "+"${Thread.currentThread().name}"
        }
    }
    private fun  FromIoThread() {
        CoroutineScope(Dispatchers.IO).launch {
            binding.txtview2.text = "Hello from " + "${Thread.currentThread().name}"
        }
    }}


