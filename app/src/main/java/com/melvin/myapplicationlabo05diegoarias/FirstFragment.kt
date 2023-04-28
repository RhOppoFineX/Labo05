package com.melvin.myapplicationlabo05diegoarias

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.melvin.myapplicationlabo05diegoarias.data.model.MovieModel


class FirstFragment : Fragment() {
    // TODO: Rename and change types of parametersl
    private lateinit var btnActionSend: FloatingActionButton
    private lateinit var starwars_cardaction: CardView

    private val viewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnActionSend = view.findViewById(R.id.btnActionSend)
        starwars_cardaction = view.findViewById(R.id.star_wars_card_action)

        btnActionSend.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        starwars_cardaction.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }

        Log.d("Movies", viewModel.getMovies().toString())

    }


}