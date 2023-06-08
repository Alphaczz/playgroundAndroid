package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayout.Adapter.myAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    var tabsArray= arrayOf("Movies","Games","Sports")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager=findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout=findViewById<TabLayout>(R.id.tabLayout)
        val adapter=myAdapter(
            supportFragmentManager,lifecycle
        )
        viewPager.adapter=adapter
        TabLayoutMediator(tabLayout,viewPager)
        {
            tab,position->tab.text=tabsArray[position]
        }.attach()
    }
}