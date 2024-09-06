package com.example.contadordecaloriasv1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Resumen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)

        val caloriasTextView: TextView = findViewById(R.id.idCaloriasObjetivo)


        val caloriasObjetivo = 2400

        caloriasTextView.text = "$caloriasObjetivo kcal"

    }
}