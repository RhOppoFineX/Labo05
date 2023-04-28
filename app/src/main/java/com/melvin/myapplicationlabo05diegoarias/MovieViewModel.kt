package com.melvin.myapplicationlabo05diegoarias


import androidx.lifecycle.ViewModel

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.melvin.myapplicationlabo05diegoarias.data.moviesDatabse
import com.melvin.myapplicationlabo05diegoarias.repository.MovieRepository

class MovieViewModel(private var repository: MovieRepository): ViewModel() {


    fun getMovies () = repository.getMovies()

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val repository = MovieRepository(moviesDatabse)
                MovieViewModel(repository)
            }
        }
    }
}