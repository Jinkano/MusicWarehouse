package com.example.musicwarehouse.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.musicwarehouse.fragments.ListGroupFragment
import com.example.musicwarehouse.fragments.MusicListFragment

class ViewPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity)
{
    /**/
    private val tabTitles = listOf("Reproductor", "Grupos")

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> MusicListFragment()
            1 -> ListGroupFragment()
            else -> throw kotlin.IllegalStateException("Invalid position:$position")
        }
    }

    override fun getItemCount(): Int = tabTitles.size

}