package com.example.kotlinsolidprinciple.example1.SLP.after

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinsolidprinciple.example1.SLP.Records

class MyRecyclerViewAdapter(val recordList : List<Records>) : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: String = ""
        var author = ""
        var releaseYear = ""
        var country = ""
        var condition = ""
        var genere   = ""
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return null as MyViewHolder
    }

    override fun getItemCount(): Int {
        return  0;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//
        val record = recordList[position]
        holder.author = record.author
        holder.title = record.title
        holder.condition = record.condition
        holder.country = record.country
        holder.releaseYear = record.releaseYear


        /**
         * Instead of performing data formatting operations here, we move that responsibility to
         * other class. So single responsibility for each class
         */


        holder.genere = getGenreData()
    }
    fun getGenreData():String{
        // code
        return  ""
    }

}