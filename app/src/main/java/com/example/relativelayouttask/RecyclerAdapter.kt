package com.example.relativelayouttask

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class RecyclerAdapter (var list:ArrayList<recycledataclass>)
    :RecyclerView.Adapter<RecyclerAdapter.Viewholder>(){
    class Viewholder (var view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        TODO("Not yet implemented")
    }


}