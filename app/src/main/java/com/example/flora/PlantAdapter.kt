package com.example.flora

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlantAdapter(private val plantList: List<PlantModel>) : RecyclerView.Adapter<PlantAdapter.PlantViewHolder>() {

    class PlantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val plantImage: ImageView = itemView.findViewById(R.id.plant_image)
        val plantName: TextView = itemView.findViewById(R.id.plant_name)
        val plantDetail: TextView = itemView.findViewById(R.id.plant_detail)
        val plantType: TextView = itemView.findViewById(R.id.plant_type)
        val plantAvailability: TextView = itemView.findViewById(R.id.plant_availability)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_items, parent, false)
        return PlantViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
        val plant = plantList[position]
        holder.plantName.text = plant.name
        holder.plantDetail.text = "Plant Detail: ${plant.detail}"
        holder.plantType.text = "Plant Type: ${plant.type}"
        holder.plantAvailability.text = "Availability: ${plant.availability}"
        holder.plantImage.setImageResource(plant.imageRes)
    }

    override fun getItemCount(): Int = plantList.size
}
