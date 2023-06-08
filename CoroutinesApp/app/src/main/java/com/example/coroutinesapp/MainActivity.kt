package com.example.coroutinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil

import com.example.coroutinesapp.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var counter:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.counterBtn.setOnClickListener{
            binding.counterText.text=counter++.toString()+" ${Thread.currentThread().name}"
        }
        binding.startDownloadbtn.setOnClickListener {

            //using coroutines
          CoroutineScope(Dispatchers.IO).launch {
              downloadBigFileFormNet()
          }

        }
    }

    private suspend fun downloadBigFileFormNet(){
        for (i in 1.. 100000)
        {
            withContext(Dispatchers.Main)
            {
                binding.downloadtextprogress.text="$i in ${Thread.currentThread().name}"

            }
          //  Log.i("TaGY","Downloading $i in ${Thread.currentThread().name}")
        }

    }
}