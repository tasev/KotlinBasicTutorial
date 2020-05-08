package com.gsixacademy.android.kotlinbasictutorial

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gsixacademy.android.kotlinbasictutorial.models.Car
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recyclerview_list_item.view.*

class CarsAdapter(val itemList: ArrayList<Car>, val carsAdapterClickEvent: (CarsAdapterClickEvent) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_list_item, parent, false))
    }

    override fun getItemCount(): Int {
       return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var myViewHolder = holder as MyViewHolder
        myViewHolder.bindData(itemList[position], position)
    }

    inner class MyViewHolder (view: View) : RecyclerView.ViewHolder(view){
        fun bindData(itemModel: Car, position: Int) {
            Picasso.get().load(itemModel.imageResource).fit().fit().into(itemView.image_view_car)
//            itemView.image_view_car.setImageResource(itemModel.imageResource)
            itemView.text_view_title.text = itemModel.title
            itemView.text_view_description.text = itemModel.description
            itemView.image_view_favourite.setOnClickListener {
                var mySharedPreferences = itemView.image_view_favourite.context.getSharedPreferences("MyFavourites", Context.MODE_PRIVATE)

                if(mySharedPreferences.contains("myFavourite_$position")) {
                    mySharedPreferences.edit().remove("myFavourite_$position").apply()
                    Picasso.get().load(R.drawable.icon_star_white).fit().fit()
                        .into(itemView.image_view_favourite)
                }else{
                    mySharedPreferences.edit().putInt("myFavourite_$position", position).apply()
                    Picasso.get().load(R.drawable.icon_star).fit().fit()
                        .into(itemView.image_view_favourite)
                }
            }

            var mySharedPreferences = itemView.image_view_favourite.context.getSharedPreferences("MyFavourites", Context.MODE_PRIVATE)

            if(mySharedPreferences.contains("myFavourite_$position")) {
                Picasso.get().load(R.drawable.icon_star).fit().fit()
                    .into(itemView.image_view_favourite)
            }else{
                Picasso.get().load(R.drawable.icon_star_white).fit().fit()
                    .into(itemView.image_view_favourite)
            }

            itemView.constraint_car_main.setOnClickListener {
                carsAdapterClickEvent.invoke(CarsAdapterClickEvent.CarsAdapterItemClicked(itemModel))
            }

        }
    }

}