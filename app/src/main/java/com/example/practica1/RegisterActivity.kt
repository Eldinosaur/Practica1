package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        enviarDatos()
    }
    fun enviarDatos(){
        btnEnviarR.setOnClickListener{
            val nombres = edtNombresR.text.toString()
            val edad = edtEdadR.text.toString()
            val genero = if(rbMasculinoR.isChecked) rbMasculinoR.text.toString() else rbFemeninoR.text.toString()

            if(nombres.isEmpty()){
                Toast.makeText(this,  "Debe ingresar los nombres",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else if(edad.isEmpty()){
                Toast.makeText(this,  "Debe ingresar la edad",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else if(!cbTerminos.isChecked){
                Toast.makeText(this,  "Debe aceptar los terminos",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val bundle = Bundle().apply {
                putString("KEY_NOMBRES", nombres)
                putString("KEY_EDAD", edad)
                putString("KEY_GENERO", genero)
            }

            val intent = Intent(this,DestinationActivity::class.java).apply{
                putExtras(bundle)
            }
            startActivity(intent)
        }
    }
}