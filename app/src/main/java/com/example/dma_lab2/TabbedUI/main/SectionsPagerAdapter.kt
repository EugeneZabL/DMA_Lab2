package com.example.dma_lab2.TabbedUI.main

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.dma_lab2.R
import com.example.dma_lab2.TabbedUI.DefaultFrag
import com.example.dma_lab2.TabbedUI.HomeFrag

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2,
        R.string.tab_text_3

)
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position){
            2 -> HomeFrag();
            else -> {
                return DefaultFrag()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 3
    }
}