package com.kalemlisipahi.kotlinfirst

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row_layout.view.*

class Adapter(private var myList : ArrayList<Model>) : RecyclerView.Adapter<Adapter.MyVH>() {
    class MyVH (itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row_layout,parent,false)
        return MyVH(itemView)
    }

    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.itemView.recyclerText.text = myList[position].category
    }

    override fun getItemCount(): Int {
        return myList.size
    }
}