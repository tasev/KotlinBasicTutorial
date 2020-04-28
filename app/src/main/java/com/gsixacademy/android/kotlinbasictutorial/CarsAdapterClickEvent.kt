package com.gsixacademy.android.kotlinbasictutorial

sealed class CarsAdapterClickEvent {
    data class CarsAdapterItemClicked(val car: Car): CarsAdapterClickEvent()
}