package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun imprimirDatos(){
        var nombres = edt_nombre.text
        var apellidos = edt_apellido.text
        btn_confirmar.setOnClickListener{
            var resultado = nombres +" "+apellidos
            txt_resultado.setText(resultado)
        }
    }
}