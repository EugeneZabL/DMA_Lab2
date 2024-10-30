package com.example.dma_lab2.TabbedUI

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.dma_lab2.MainActivity
import com.example.dma_lab2.R

class HomeFrag: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third_frag ,container,false)
        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(activity,MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
        return view
    }
}