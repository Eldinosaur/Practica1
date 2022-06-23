package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_destination.*
import kotlinx.android.synthetic.main.activity_mascota_respuesta.*

class MascotaRespuestaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascota_respuesta)
        RegresarInicio()
        //recuperar el bundle
        val bundle = intent.extras
        //validar el contenido
        //if(bundle !=null) {
        bundle?.let {

            val nombreMascota = bundle.getString("KEY_NOMBRE") ?: "Desconocido"
            val edadMascota = bundle.getString("KEY_EDAD") ?: "Edad Desconocida"
            val tipoMascota = bundle.getString("KEY_TIPO")?: "Desconocido"
            val vRabia  =bundle.getString("KEY_RABIA")?: "Rabia: NO"
            val vParvo  =bundle.getString("KEY_PARVO")?:"Parvovirus: NO"
            val vTriple =bundle.getString("KEY_TRIPLE")?:"Triple Felina: NO"
            val vPoli  =bundle.getString("KEY_POLI")?:"Polivalente: NO"
            val vPerreras =bundle.getString("KEY_PERRERAS")?:"Traqueobronquitis: NO"

            txtNombreMascota.text = "Nombre: "+nombreMascota
            txtEdadMascota.text = "Edad: "+edadMascota+" Años"
            txtTipoMascota.text = tipoMascota
            txtRabia.text = vRabia
            txtParvo.text = vParvo
            txtTFelina.text = vTriple
            txtPoli.text = vPoli
            txtPerreras.text = vPerreras
            if(tipoMascota == "Perro"){
                imgTipo.setImageResource(R.drawable.perro)
            }else if(tipoMascota == "Gato"){
                imgTipo.setImageResource(R.drawable.gato)
            }else{
                imgTipo.setImageResource(R.drawable.conejo)
            }


        }
    }
    fun RegresarInicio(){
        btnRegresar.setOnClickListener{
            val intent = Intent(this,MascotaActivity::class.java)
            startActivity(intent)
        }
    }
}