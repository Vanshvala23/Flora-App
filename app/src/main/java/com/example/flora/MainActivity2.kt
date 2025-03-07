package com.example.flora


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var landsAdapter: LandsAdapter
    private lateinit var landList: ArrayList<Land>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        landList= arrayListOf(
            Land(R.drawable.land_image1,"Tarsali Land","Patel Abhay","Vadodara"),
            Land(R.drawable.land_image1,"Tarsali Land","Patel Harsh","Surat"),
        )

        landsAdapter = LandsAdapter(landList)
        recyclerView.adapter = landsAdapter
        val btnPlant = findViewById<Button>(R.id.btn_plants)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.selectedItemId = R.id.nav_home

        btnPlant.setOnClickListener {
            val intent = Intent(this, PlantPage::class.java)
            startActivity(intent)
        }

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home ->{
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
    }
}