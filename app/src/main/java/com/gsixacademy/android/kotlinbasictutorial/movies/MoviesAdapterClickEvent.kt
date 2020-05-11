package com.gsixacademy.android.kotlinbasictutorial.movies

import com.gsixacademy.android.kotlinbasictutorial.models.MovieResult

sealed class MoviesAdapterClickEvent {
    data class MoviesAdapterItemClicked(val movieResult: MovieResult): MoviesAdapterClickEvent()
}