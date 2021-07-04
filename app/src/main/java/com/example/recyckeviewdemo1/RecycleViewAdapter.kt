package com.example.recyckeviewdemo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class RecycleViewAdapter : RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listitem: View = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listitem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.view.textView.text = "hello"
    }

    override fun getItemCount(): Int {
        return 5
    }

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }
}