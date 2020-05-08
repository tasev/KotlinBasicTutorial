package com.gsixacademy.android.kotlinbasictutorial

import com.gsixacademy.android.kotlinbasictutorial.models.Car

sealed class CarsAdapterClickEvent {
    data class CarsAdapterItemClicked(val car: Car): CarsAdapterClickEvent()
}