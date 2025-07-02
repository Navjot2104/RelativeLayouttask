package com.example.relativelayouttask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class RecyclerAdapter (var list:ArrayList<recycledataclass>)
    :RecyclerView.Adapter<RecyclerAdapter.Viewholder>(){
    class Viewholder (var view: View):RecyclerView.ViewHolder(view) {
        var name=view.findViewById<TextView>(R.id.txxtt)
        var update=view.findViewById<Button>(R.id.btn123)
        var delete=view.findViewById<Button>(R.id.btn234)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.Viewholder {

        var view=LayoutInflater.from(parent.context).inflate(R.layout.itemlayout,parent,false)
        return Viewholder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }
    interface OnClick{
        fun update(position: Int)
        fun delete(position: Int)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.Viewholder, position: Int) {
        holder.apply {
            name.setText(list[position].name)
            update.setOnClickListener {
                clickInterface.update(position)
            }
        }
        delete.setOnClickListener{
            clickInterface.delete(position)
        }
    }


}