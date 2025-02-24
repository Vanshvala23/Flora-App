package com.example.flora

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val btnRegister = findViewById<Button>(R.id.registerButton)
        btnRegister.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish() // Close register activity
        }
    }
}