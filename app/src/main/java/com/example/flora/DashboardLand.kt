package com.example.flora

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardLand:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_land)
        val bottomNav=findViewById<BottomNavigationView>(R.id.bottomNav)
        val backbtn=findViewById<ImageView>(R.id.backButton)
        backbtn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity2::class.java))
                    finish()
                    true
                }
                R.id.nav_dashboard -> {
                    startActivity(Intent(this, DashboardActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_settings -> {
                    startActivity(Intent(this, SettingActivity::class.java))
                    finish()
                    true
                }
                else -> false
            }
        }
        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewLand)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val landList = listOf(
            LandModel("Chettral", "Vadodara, Gujarat", R.drawable.chetrral),
            LandModel("Jamalpur", "Vadodara, Gujarat", R.drawable.jamalpur),
            LandModel("Bharuch", "Bharuch, Gujarat", R.drawable.bharuch),
            LandModel("Surat", "Surat, Gujarat", R.drawable.surat)
        )

        val adapter = LandAdapter(landList)
        recyclerView.adapter = adapter
    }
}