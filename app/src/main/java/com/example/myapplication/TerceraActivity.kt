package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TerceraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        val tvResumen = findViewById<TextView>(R.id.tvResumen)

        val nombre = intent.getStringExtra("nombre") ?: ""
        val ciudad = intent.getStringExtra("ciudad") ?: ""

        tvResumen.text = "Nombre: $nombre\nCiudad: $ciudad"
    }
}
