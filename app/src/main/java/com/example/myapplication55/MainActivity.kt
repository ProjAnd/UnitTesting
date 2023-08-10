package com.example.myapplication55

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvfoodItems: RecyclerView
    private val foodList: ArrayList<Food> = arrayListOf(
        Food("Pancake", R.drawable.pancake),
        Food("Veg Roll", R.drawable.roll),
        Food("Pizza", R.drawable.pizza),
        Food("Soup", R.drawable.soup)
    )

    private var foodListAdapter: Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        foodListAdapter = Adapter(this, foodList)
        rvfoodItems = findViewById<RecyclerView>(R.id.rv_food_items)

        setupFoodMenu()
    }

    private fun setupFoodMenu() {
        //Write your logic here
        rvfoodItems.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvfoodItems.adapter = foodListAdapter
        foodListAdapter!!.addItems(foodList!!)

     }

}