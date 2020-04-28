package com.gsixacademy.android.kotlinbasictutorial

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator_layout.*

class CarDetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_details)

        var myTitle = intent.getStringExtra("title")
        var myDescription = intent.getStringExtra("description")
        var myImageResource = intent.getIntExtra("imageResource", 0)

    }


}