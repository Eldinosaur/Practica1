package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_mascota.*
import kotlinx.android.synthetic.main.activity_register.*

class MascotaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascota)
        EnviarDatosMascotas()
    }
    fun EnviarDatosMascotas(){
        btnEnviarMascota.setOnClickListener{
            val nombreMascota = edtNombreMascota.text.toString();
            val edadMascota = edtEdadMascota.text.toString();
            val tipoMascota = if(rbPerro.isChecked) rbPerro.text.toString() else if(rbGato.isChecked) rbGato.text.toString() else rbConejo.text.toString()

            if(nombreMascota.isEmpty()){
                Toast.makeText(this,  "Debes ingresar el nombre de tu mascota", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else if(edadMascota.isEmpty()){
                Toast.makeText(this,  "Debes ingresar la edad de tu mascota", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val bundle = Bundle().apply {
                putString("KEY_NOMBRES", nombreMascota)
                putString("KEY_EDAD", edadMascota)
                putString("KEY_TIPO", tipoMascota)
            }
            if(cbRabia.isChecked){
                val vRabia = cbRabia.text.toString()
                bundle.putString("KEY_RABIA" ,vRabia)
            }

            val intent = Intent(this,MascotaRespuestaActivity::class.java).apply{
                putExtras(bundle)
            }
            startActivity(intent)
        }
    }
}