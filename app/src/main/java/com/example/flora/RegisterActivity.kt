package com.example.flora
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_page)

        val btnRegister = findViewById<Button>(R.id.registerButton)
        btnRegister.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish() // Close register activity
        }
        val alreadyText=findViewById<TextView>(R.id.alreadyText)
        alreadyText.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Close register activity
        }

    }
}