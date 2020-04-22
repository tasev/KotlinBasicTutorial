package com.gsixacademy.android.kotlinbasictutorial

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator_layout.*

class CalculatorActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_layout)

        initListeners()

    }

    private fun initListeners() {

        button_add.setOnClickListener {

            var firstNumberText = edit_text_number_one.text.toString()
            var secondNumberText = edit_text_number_two.text.toString()

            if(firstNumberText.isEmpty() || secondNumberText.isEmpty()){
                text_view_result_value.text = "0"
                Toast.makeText(applicationContext,"no value entered",Toast.LENGTH_LONG).show()
            }else {
                var result = firstNumberText.toInt() + secondNumberText.toInt()
                text_view_result_value.text = "$result"
            }
        }

        button_sub.setOnClickListener {

            var firstNumberText = edit_text_number_one.text.toString()
            var secondNumbertext = edit_text_number_two.text.toString()

            if(firstNumberText.isEmpty() || secondNumbertext.isEmpty()){
                text_view_result_value.text = "0"
                Toast.makeText(applicationContext,"no value entered",Toast.LENGTH_LONG).show()
            }else {
                var result = firstNumberText.toInt() - secondNumbertext.toInt()
                text_view_result_value.text = "$result"
            }

        }

        button_mul.setOnClickListener {

            var firstNumberText = edit_text_number_one.text.toString()
            var secondNumbertext = edit_text_number_two.text.toString()

            if(firstNumberText.isEmpty() || secondNumbertext.isEmpty()){
                text_view_result_value.text = "0"
                Toast.makeText(applicationContext,"no value entered",Toast.LENGTH_LONG).show()
            }else {
                var result = firstNumberText.toInt() * secondNumbertext.toInt()
                text_view_result_value.text = "$result"
            }

        }

        button_div.setOnClickListener {

            var firstNumberText = edit_text_number_one.text.toString()
            var secondNumbertext = edit_text_number_two.text.toString()

            if (firstNumberText.isEmpty() || secondNumbertext.isEmpty()) {
                text_view_result_value.text = "/"
                Toast.makeText(applicationContext, "no value entered", Toast.LENGTH_LONG).show()
            } else if(secondNumbertext.toInt() == 0){
                text_view_result_value.text = "/"
                Toast.makeText(applicationContext, "second number must not be '0'", Toast.LENGTH_LONG).show()
             }else {
                var result = firstNumberText.toInt() / secondNumbertext.toInt()
                text_view_result_value.text = "$result"
            }

        }

    }

}