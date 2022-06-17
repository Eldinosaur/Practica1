package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_destination.*

class DestinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        //recuperar el bundle
        val bundle = intent.extras
        //validar el contenido
        //if(bundle !=null) {
        bundle?.let {

            val nombres = bundle.getString("KEY_NOMBRES") ?: "Desconocido"
            val edad = bundle.getString("KEY_EDAD") ?: "Edad Desconocida"
            val genero = bundle.getString("KEY_GENERO") ?: "Desconocido"

            txtNombresR.text = nombres
            txtEdadR.text = edad
            txtGeneroR.text = genero
        }
        //}

    }
}