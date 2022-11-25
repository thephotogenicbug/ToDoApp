package com.naveen.todoapp.fragments.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.naveen.todoapp.R

class ListFragment : Fragment() {

     lateinit var button : FloatingActionButton



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        button = view.findViewById(R.id.floatingActionButton)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment )
        }

        return view
    }
}