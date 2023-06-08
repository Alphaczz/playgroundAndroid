package com.example.tablayout.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayout.fragments.GamesFragment
import com.example.tablayout.fragments.MoviesFragment
import com.example.tablayout.fragments.SportFragment

class myAdapter (fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle)
{
    override fun getItemCount(): Int {
        return 3;
    }

    override fun createFragment(position: Int): Fragment {
        when(position)
        {
            0->return MoviesFragment()
            1->return GamesFragment()
        }
        return SportFragment()

    }

}