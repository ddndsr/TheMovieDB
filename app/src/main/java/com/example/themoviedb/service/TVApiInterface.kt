package com.example.themoviedb.service

import com.example.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=4ac12b4bdbd60aec34fca74e2645dbdb")
    fun getTVList(): Call<TVResponse>
}