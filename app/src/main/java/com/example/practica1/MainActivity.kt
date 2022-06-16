package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imprimirDatos()
    }
    fun imprimirDatos(){

        btn_confirmar.setOnClickListener{
            val nombres = edt_nombre.text.toString()
            val apellidos = edt_apellido.text.toString()
            val resultado ="Bienvenido $nombres $apellidos"
                //nombres +" "+apellidos
            txt_resultado.setText(resultado)
        }
    }
}