package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val etCiudad = findViewById<EditText>(R.id.etCiudad)
        val btnSiguiente2 = findViewById<Button>(R.id.btnSiguiente2)

        val nombre = intent.getStringExtra("nombre") ?: ""

        btnSiguiente2.setOnClickListener {
            val ciudad = etCiudad.text.toString()
            val intent = Intent(this, TerceraActivity::class.java)
            intent.putExtra("nombre", nombre)
            intent.putExtra("ciudad", ciudad)
            startActivity(intent)
        }
    }
}
