package com.gsixacademy.android.kotlinbasictutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerViewActivity : AppCompatActivity() {

    var listActivities: ArrayList<String> = arrayListOf("RelativeLayoutActivity","CalculatorActivity","TodoListActivity")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        var activitiesAdapter: ActivitiesAdapter = ActivitiesAdapter(listActivities)
        recycler_view_activities.adapter = activitiesAdapter

    }
    
    
}