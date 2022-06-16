package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_generations.*

class GenerationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generations)
        imprimirGeneracion()
    }
    fun imprimirGeneracion(){
        btnVerificar.setOnClickListener{
            val year = edtNacimiento.text.toString().toInt()
            when(year){
                in 1969 .. 1980 ->{
                    txtGeneracion.text="Generacion X"
                }
                in 1981 .. 1993 ->{
                    txtGeneracion.text="Generacion Y"
                }
                in 1994 .. 2010 ->{
                    txtGeneracion.text="Generacion Z"
                }
                else -> {
                    txtGeneracion.text="No pertenece a ninguna generacion"
                }
            }
        }
    }
}