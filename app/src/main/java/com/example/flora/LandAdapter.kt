package com.example.flora

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LandAdapter(private val landList: List<LandModel>) :
    RecyclerView.Adapter<LandAdapter.LandViewHolder>() {

    class LandViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val landImage: ImageView = view.findViewById(R.id.landImage)
        val landName: TextView = view.findViewById(R.id.landName)
        val landLocation: TextView = view.findViewById(R.id.landLocation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_land_card, parent, false)
        return LandViewHolder(view)
    }

    override fun onBindViewHolder(holder: LandViewHolder, position: Int) {
        val land = landList[position]
        holder.landName.text = land.name
        holder.landLocation.text = land.location
        holder.landImage.setImageResource(land.imageResId)
    }

    override fun getItemCount() = landList.size
}