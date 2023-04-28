package com.melvin.myapplicationlabo05diegoarias.repository

import com.melvin.myapplicationlabo05diegoarias.data.model.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {

    fun getMovies() = movies

}