package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.myAdapter.Adapter

class MainActivity : AppCompatActivity() {
    lateinit var apter:Adapter
    private val arrayList=ArrayList<String>()
    lateinit var viewPager :ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager=findViewById(R.id.viewPager)
        apter=Adapter(this)
        viewPager.orientation=ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter=apter
    }
}