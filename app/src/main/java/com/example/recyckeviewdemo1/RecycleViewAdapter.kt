package com.example.recyckeviewdemo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class RecycleViewAdapter(val fruitList:List<Fruits>) : RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listitem: View = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listitem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit: Fruits = fruitList.get(position)
        holder.view.textView.text = fruit.supplier
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }
}