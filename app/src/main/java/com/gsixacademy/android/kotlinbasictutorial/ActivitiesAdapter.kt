package com.gsixacademy.android.kotlinbasictutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_list_item.view.*

class ActivitiesAdapter(val itemList: ArrayList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_list_item, parent, false))
    }

    override fun getItemCount(): Int {
       return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var myViewHolder = holder as MyViewHolder
        myViewHolder.bindData(itemList[position])
    }

    inner class MyViewHolder (view: View) : RecyclerView.ViewHolder(view){
        fun bindData(itemModel: String) {
            itemView.text_view_title.text = itemModel
        }
    }

}