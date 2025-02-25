package com.example.flora

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LandsAdapter(private val landsList: List<Land>) : RecyclerView.Adapter<LandsAdapter.LandViewHolder>() {
    class LandViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val landImage: ImageView = itemView.findViewById(R.id.land_image)
        val landTitle: TextView = itemView.findViewById(R.id.land_title)
        val landOwner: TextView = itemView.findViewById(R.id.land_owner)
        val landLocation: TextView = itemView.findViewById(R.id.land_location)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.lands_items, parent, false)
        return LandViewHolder(view)
    }

    override fun onBindViewHolder(holder: LandViewHolder, position: Int) {
        val land = landsList[position]
        holder.landImage.setImageResource(land.imageResId)
        holder.landTitle.text = land.title
        holder.landOwner.text = "Owner: ${land.owner}"
        holder.landLocation.text = land.location
    }

    override fun getItemCount(): Int = landsList.size
}