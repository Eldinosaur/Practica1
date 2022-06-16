package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edad.*

class EdadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edad)
        ImprimirResultado()
    }
    fun ImprimirResultado(){
        btnProcesar.setOnClickListener{
            val year = edtEdad.text.toString().toInt()
            when (year){
                in 0 .. 17 ->{
                    txtEdad.text = "Usted es menor de edad"
                }
                in 18 .. 100 ->{
                    txtEdad.text = "Usted es mayor de edad"
                }
                else ->{
                    txtEdad.text = "No es una edad real"
                }
            }
        }
    }
}