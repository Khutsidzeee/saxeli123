package com.example.sakontrolo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.sakontrolo.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity :AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val secondActbutton = findViewById<Button>(R.id.button1)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, HomeActivity::class.java)
            startActivity(Intent)
        }
    }
}


