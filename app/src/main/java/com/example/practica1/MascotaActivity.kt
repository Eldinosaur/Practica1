package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_mascota.*
import kotlinx.android.synthetic.main.activity_mascota_respuesta.*
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
            var tipoMascota =
            if(rbPerro.isChecked) {
                   rbPerro.text.toString()
                                }else if(rbGato.isChecked) {
                    rbGato.text.toString()
                                }else{
                    rbConejo.text.toString()
                                }

            val vRabia =if(cbRabia.isChecked) cbRabia.text.toString() else null
            val vParvo =if(cbParvovirus.isChecked) cbParvovirus.text.toString() else null
            val vTriple =if(cbTFelina.isChecked) cbTFelina.text.toString() else null
            val vPoli =if(cbPolivalente.isChecked) cbPolivalente.text.toString() else null
            val vPerreras =if(cbPerreras.isChecked) cbPerreras.text.toString() else null

            if(nombreMascota.isEmpty()){
                Toast.makeText(this,  "Debes ingresar el nombre de tu mascota", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else if(edadMascota.isEmpty()){
                Toast.makeText(this,  "Debes ingresar la edad de tu mascota", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else if(!cbRabia.isChecked||!cbParvovirus.isChecked||!cbTFelina.isChecked||!cbPolivalente.isChecked||!cbPerreras.isChecked){
                Toast.makeText(this,  "Debes seleccionar al menos una vacuna", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val bundle = Bundle().apply {
                putString("KEY_NOMBRE", nombreMascota)
                putString("KEY_EDAD", edadMascota)
                putString("KEY_TIPO", tipoMascota)
                putString("KEY_RABIA",vRabia)
                putString("KEY_PARVO",vParvo)
                putString("KEY_TRIPLE",vTriple)
                putString("KEY_POLI",vPoli)
                putString("KEY_PERRERAS",vPerreras)
            }

            val intent = Intent(this,MascotaRespuestaActivity::class.java).apply{
                putExtras(bundle)
            }
            startActivity(intent)
        }
    }
}