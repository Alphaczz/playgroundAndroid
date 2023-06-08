package com.example.viewpager.myAdapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.MainActivity
import com.example.viewpager.fragments.fragmentOne
import com.example.viewpager.fragments.fragmentThree
import com.example.viewpager.fragments.fragmenttwo

class Adapter(mainActivity: MainActivity):FragmentStateAdapter(mainActivity)
{
    private val Fragment_size=3

    override fun getItemCount(): Int {
      return this.Fragment_size
    }

    override fun createFragment(position: Int): Fragment {
        when(position)
        {
            0->{
                return  fragmentOne()
            }
            1->{return fragmenttwo()}
            2->{return fragmentThree()}

        }
        return fragmentOne()
    }

}