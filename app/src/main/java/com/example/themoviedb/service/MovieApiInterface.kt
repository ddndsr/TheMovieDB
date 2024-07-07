package com.example.themoviedb.service

import com.example.themoviedb.model.MovieResponse
import retrofit2.Call

import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=4ac12b4bdbd60aec34fca74e2645dbdb")
    fun getMovieList(): Call<MovieResponse>
}