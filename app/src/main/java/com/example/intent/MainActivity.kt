package com.example.intent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button

import android.widget.TextView
import androidx.activity.ComponentActivity




class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)


      val signin: Button= findViewById<Button>(R.id.login_button)
        signin.setOnClickListener {
            val intent= Intent(this, newActivity ::class.java)
            startActivity(intent)
        }
        val home: Button =findViewById(R.id.button)
        home.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

    }
}
