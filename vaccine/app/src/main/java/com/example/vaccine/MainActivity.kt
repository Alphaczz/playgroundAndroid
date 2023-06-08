package com.example.vaccine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1-Adapter View

        var recyclerView:RecyclerView=findViewById(R.id.recycleview)
        recyclerView.layoutManager =LinearLayoutManager(this,LinearLayoutManager.VERTICAL,
            false)
        //dta source
        var vaccineList:ArrayList<VaccineModel> = ArrayList()
        val v1=VaccineModel(
            "covid-19",R.drawable.vaccine
        )
        val v2=VaccineModel(
            "covaxin",R.drawable.vaccine
        )
        val v3=VaccineModel(
            "sputnik",R.drawable.vaccine
        )
        val v4=VaccineModel(
            "coviShield",R.drawable.vaccine
        )
        val v5=VaccineModel(
            "Astro",R.drawable.vaccine
        )
        val v6=VaccineModel(
            "covid-20",R.drawable.vaccine
        )
        val v7=VaccineModel(
            "covid-29",R.drawable.vaccine
        )
        val v8=VaccineModel(
            "covid-29",R.drawable.vaccine
        )
        val v9=VaccineModel(
            "covid-29",R.drawable.vaccine
        )
        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)
        vaccineList.add(v5)
        vaccineList.add(v6)
        vaccineList.add(v7)
        vaccineList.add(v8)
        vaccineList.add(v9)

        //3 Adapter
        val adapter=myAdapter(vaccineList)
        recyclerView.adapter=adapter


    }
}