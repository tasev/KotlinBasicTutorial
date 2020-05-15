package com.gsixacademy.android.kotlinbasictutorial.people

import com.gsixacademy.android.kotlinbasictutorial.models.PersonResult

sealed class PeopleAdapterClickEvent {
    data class PeopleAdapterItemClicked(val personResult: PersonResult): PeopleAdapterClickEvent()
}