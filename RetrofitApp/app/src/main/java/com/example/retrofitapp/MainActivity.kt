  package com.example.retrofitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import retrofit2.Response
import retrofit2.create

  class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text:TextView=findViewById(R.id.txtview)
        val retrofitService=RetroFitInstances.getRetrofitInstance()
            .create(AlbumsService::class.java)
        val reponseLivedata:LiveData<Response<Albums>>
        = liveData { //val response=retrofitService.getAblums()
            val response=retrofitService.getSpecificId(2  )
        emit(response)}
        reponseLivedata.observe(this, Observer {
            val albumList=it.body()?.listIterator()
            if(albumList!=null)
            {
                while (albumList.hasNext())
                {
                    val albumItem=albumList.next()
                    Log.i("tagg",albumItem.title+" "+albumItem.id,)
                    val result="Album Title: ${albumItem.title}\n"
                    text.append(result)
                }
            }
        })

    }
}