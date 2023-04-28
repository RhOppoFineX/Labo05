package com.melvin.myapplicationlabo05diegoarias

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class FirstFragment : Fragment() {

    private lateinit var btnActionSend: FloatingActionButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnActionSend = view.findViewById(R.id.buttton_first_fragment)

        btnActionSend.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFrgament)
        }
    }

    private fun bind(){
        //btnActionSend = view?.findViewById(R.id.buttton_first_fragment) as Button
    }

}