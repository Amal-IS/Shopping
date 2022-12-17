package com.example.shopping

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ShoesAdapter(private val context: Context,
                   private val dataset: List<Shoes>) : RecyclerView.Adapter<ShoesAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        val item = dataset[position]
        holder.Shoes_Title.text = context.resources.getString(item.name)
        holder.Shoes_Price.text = context.resources.getString(item.price)
        holder.Shoes_Image.setImageResource(item.image)

    }

    override fun getItemCount() = dataset.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val Shoes_Title: TextView = itemView.findViewById(R.id.textView)
        val Shoes_Price: TextView = itemView.findViewById(R.id.textView2)
        val Shoes_Image: ImageView = itemView.findViewById(R.id.image_view)

    }

}