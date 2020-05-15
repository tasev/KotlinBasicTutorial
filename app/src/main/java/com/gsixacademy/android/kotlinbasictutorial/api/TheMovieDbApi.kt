package com.gsixacademy.android.kotlinbasictutorial.api

import com.gsixacademy.android.kotlinbasictutorial.models.PopularMovies
import com.gsixacademy.android.kotlinbasictutorial.models.PopularPeople
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieDbApi {

    @GET("/3/movie/popular")
    fun getPopularMovies(@Query("api_key") key: String): Call<PopularMovies>

    @GET("/3/person/popular")
    fun getPopularPeople(@Query("api_key") key: String): Call<PopularPeople>

    @GET("/3/search/movie")
    fun searchMovies(@Query("api_key") key: String, @Query("query") query: String): Call<PopularMovies>

    @GET("/3/search/person")
    fun searchPeople(@Query("api_key") key: String, @Query("query") query: String): Call<PopularPeople>

}