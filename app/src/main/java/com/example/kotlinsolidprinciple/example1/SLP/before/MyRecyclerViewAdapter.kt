package com.example.kotlinsolidprinciple.example1.SLP.before

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kotlinsolidprinciple.example1.SLP.Records

class MyRecyclerViewAdapter(private var  recordList : List<Records>) : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        var title: String = ""
        var author = ""
        var releaseYear = ""
        var country = ""
        var condition = ""
        var genere   = ""
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return null as MyViewHolder;
    }

    override fun getItemCount(): Int {
        return 0;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //
        val record = recordList[position]
        holder.author = record.author
        holder.title = record.title
        holder.condition = record.condition
        holder.country = record.country
        holder.releaseYear = record.releaseYear


        // Here this method violates the Single Responsibility  Principle.
//        Despite its main and only responsibility to be adapting a VinylRecord object
//        to its view representation, it is also performing data formatting as well.
//        It has multiple reasons to be changed in the future, which is wrong.

        var genereStr  = ""
        for (genre in record.genere){
            genereStr+= genre + " , "
        }
        genereStr = if (genereStr.isNotEmpty())
            genereStr.substring(0, genereStr.length - 2)
        else
            genereStr

        holder.genere = genereStr
    }
}
