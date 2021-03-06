package com.gsixacademy.android.kotlinbasictutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.gsixacademy.android.kotlinbasictutorial.movies.PopularMoviesActivity
import com.gsixacademy.android.kotlinbasictutorial.people.PopularPeopleActivity
import com.gsixacademy.android.kotlinbasictutorial.search.SearchMoviesActivity
import com.gsixacademy.android.kotlinbasictutorial.search.SearchPeopleActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listActivities: ArrayList<String> = arrayListOf("RelativeLayoutActivity","CalculatorActivity","TodoListActivity", "RecyclerViewActivity", "LoginActivity", "PopularMoviesActivity", "PopularPeopleActivity", "SearchMoviesActivity","SearchPeopleActivity")

    //this is for commit test only
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Picasso.get().load("https://wallpaperaccess.com/full/57166.jpg").fit().fit().into(image_view_background)

        var activitiesAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listActivities)

        list_view_activities.adapter = activitiesAdapter

        list_view_activities.setOnItemClickListener { adapterView, view, i, l ->
            var className = listActivities[i]

            when (className) {
                 "RelativeLayoutActivity" -> startActivity(Intent(applicationContext, RelativeLayoutActivity::class.java))
                 "CalculatorActivity" -> startActivity(Intent(applicationContext, CalculatorActivity::class.java))
                 "TodoListActivity"  -> startActivity(Intent(applicationContext, TodoListActivity::class.java))
                 "RecyclerViewActivity" -> startActivity(Intent(applicationContext, RecyclerViewActivity::class.java))
                 "LoginActivity" -> startActivity(Intent(applicationContext, LoginActivity::class.java))
                "PopularMoviesActivity" -> startActivity(Intent(applicationContext, PopularMoviesActivity::class.java))
                "PopularPeopleActivity" -> startActivity(Intent(applicationContext, PopularPeopleActivity::class.java))
                "SearchMoviesActivity" -> startActivity(Intent(applicationContext, SearchMoviesActivity::class.java))
                "SearchPeopleActivity" -> startActivity(Intent(applicationContext, SearchPeopleActivity::class.java))
                }

            Toast.makeText(applicationContext,className,Toast.LENGTH_LONG).show()
        }
    }
}
