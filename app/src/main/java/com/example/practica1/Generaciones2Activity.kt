package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_generaciones2.*

class Generaciones2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generaciones2)
        verificarGeneracion()
    }
    fun verificarGeneracion(){
        btnVerificacion.setOnClickListener{
            val year = edtYearGeneracion.text.toString().toInt()
            when(year){
                in 1930 .. 1948 ->{
                    txtGeneraciones.text = "Silent Generation"
                    txtPoblacion.text = "Población de 6 300 000 personas"
                    txtRasgo.text = "Rasgo característico: Austeridad"
                }
                in 1949 .. 1968 ->{
                    txtGeneraciones.text = "Generación Baby Boomers"
                    txtPoblacion.text = "Población de 12 200 000 personas"
                    txtRasgo.text = "Rasgo característico: Ambición"
                }
                in 1969 .. 1980 ->{
                    txtGeneraciones.text = "Generación X"
                    txtPoblacion.text = "Población de 9 300 000 personas"
                    txtRasgo.text = "Rasgo característico: Obsesion por el éxito"
                }
                in 1981 .. 1993 ->{
                    txtGeneraciones.text = "Generación Y"
                    txtPoblacion.text = "Población de 7 200 000 personas"
                    txtRasgo.text = "Rasgo característico: Frustración"
                }
                in 1994 .. 2010 ->{
                    txtGeneraciones.text = "Generación Z"
                    txtPoblacion.text = "Población de 7 800 00. personas"
                    txtRasgo.text = "Rasgo característico: Irreverencia"
                }
                else ->{
                    txtGeneraciones.text = "No pertenece a ninguna generación"
                    txtPoblacion.text = "Poblacion no definida"
                    txtRasgo.text = "Rasgo caracteristico: No definido"
                }
            }
        }
    }
}