package com.gsixacademy.android.kotlinbasictutorial.api

import com.gsixacademy.android.kotlinbasictutorial.models.PopularMovies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieDbApi {

    @GET("/3/movie/popular")
    fun getPopularMovies(@Query("api_key") key: String): Call<PopularMovies>
    
}