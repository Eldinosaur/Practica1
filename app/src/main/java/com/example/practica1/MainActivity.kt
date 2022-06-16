package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imprimirDatos()

        //val btn: Button = findViewById(R.id.btn_confirmar)
       //btn.setOnClickListener{ }
    }

    //Acceso a los elementos del activity
    //1. findViewById
    //2. plugin android-extensions
    //3. viewBinding
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