package com.example.dma_lab2.TabbedUI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.dma_lab2.R

class DefaultFrag : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tabbed_def ,container,false)
        view.findViewById<TextView>(R.id.TextToChange).text = "1"
        return view
    }
}