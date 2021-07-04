package com.example.recyckeviewdemo1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //  val fruitList = listOf("mango", "apple", "banana", "guava", "grapes", "lemon", "pear")
    val fruitList = listOf(
        Fruits("mango", "tom"), Fruits("apple", "tommy"),
        Fruits("banana", "goutam"), Fruits("pear", "rani")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecycleViewAdapter(fruitList)
    }
}