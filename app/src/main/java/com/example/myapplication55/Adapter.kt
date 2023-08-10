package com.example.myapplication55

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Adapter(private val context: Context, private val foodList: ArrayList<Food>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    var itemList = ArrayList<Food>()

    public class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foodImage: ImageView
        var foodName: TextView
        var cartButton: Button
        var foodItemCard: CardView

        init {
            foodItemCard = itemView.findViewById(R.id.food_item_card)
            foodImage = itemView.findViewById(R.id.food_image)
            foodName = itemView.findViewById(R.id.food_name)
            cartButton = itemView.findViewById(R.id.food_cart_button)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.food_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
           val data = foodList[position]
           if(data.name.isNotEmpty()){
               holder.foodName.text = data.name
           }
    }

    public fun addItems(itemList:ArrayList<Food>){
        this.itemList= itemList
        notifyDataSetChanged()
    }

}