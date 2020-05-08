package com.gsixacademy.android.kotlinbasictutorial.movies

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gsixacademy.android.kotlinbasictutorial.R
import com.gsixacademy.android.kotlinbasictutorial.api.ServiceBuilder
import com.gsixacademy.android.kotlinbasictutorial.api.TheMovieDbApi
import com.gsixacademy.android.kotlinbasictutorial.models.PopularMovies
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopularMoviesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        val request = ServiceBuilder.buildService(TheMovieDbApi::class.java)

        val call = request.getPopularMovies("8dd3a40cdacd660d79bce7c46bad942e")

        call.enqueue(object : Callback<PopularMovies> {
            override fun onResponse(call: Call<PopularMovies>, response: Response<PopularMovies>) {
                if (response.isSuccessful){

                    val popularMovies = response.body()

                    val moviesList = popularMovies?.results

                    Toast.makeText(applicationContext, " moviesList ${moviesList?.size}",Toast.LENGTH_LONG).show()

                }
            }
            override fun onFailure(call: Call<PopularMovies>, t: Throwable) {
                // show the error
            }
        })


    }
}