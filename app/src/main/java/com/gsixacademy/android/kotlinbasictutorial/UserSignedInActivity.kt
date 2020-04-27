package com.gsixacademy.android.kotlinbasictutorial

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user_signed_in.*

class UserSignedInActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_signed_in)

        var mySharedPreferences = getSharedPreferences("KotlinBasicTutorialPreferences", Context.MODE_PRIVATE)

        var myUserName = mySharedPreferences.getString("userName","/")

        text_view_title.text = "Signd in with: $myUserName"


        button_log_out.setOnClickListener {
            mySharedPreferences.edit().remove("userName")
            onBackPressed()
        }

    }
}