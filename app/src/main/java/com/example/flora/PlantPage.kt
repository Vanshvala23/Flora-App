package com.example.flora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PlantPage : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var plantAdapter: PlantAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plantpage)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val plantList = listOf(
            PlantModel("Mango", "Hapus mango", "Organic", "Yes", R.drawable.mango),
            PlantModel("Neem", "Kadva Neem", "N/A", "Yes", R.drawable.neem),
            PlantModel("Rose", "Red Rose", "Flower", "No", R.drawable.rose)
        )

        plantAdapter = PlantAdapter(plantList)
        recyclerView.adapter = plantAdapter
    }
}
