package com.example.worldcup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1 Adapter View
        var listView=findViewById<ListView>(R.id.listview)
        //2 Adapter
        var adapter=MyAdapter(this,generateData())
        listView?.adapter=adapter
        adapter?.notifyDataSetChanged()
    }
    //3-data source
    fun generateData():ArrayList<CountryModalClass>
    {
        val res=ArrayList<CountryModalClass>()
        var country1:CountryModalClass= CountryModalClass(
            "Brazil",
            "5",
            R.drawable.brazil
        )
        var country2:CountryModalClass= CountryModalClass(
            "India",
            "0",
            R.drawable.india
        )
        var country3:CountryModalClass= CountryModalClass(
            "Russia",
            "1",
            R.drawable.russia
        )
        var country4:CountryModalClass= CountryModalClass(
            "Brazil",
            "5",
            R.drawable.usa
        )
        res.add(country1)
        res.add(country2)
        res.add(country3)
        res.add(country4)

        return res

    }
}