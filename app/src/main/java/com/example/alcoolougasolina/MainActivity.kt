package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btCalcular(view: View){

        val precoAlcool = findViewById(R.id.preco_alcool) as EditText
        val resultadoAlcool = precoAlcool.text.toString()

        val precoGasolina = findViewById(R.id.preco_gasolina) as EditText
        val resultadoGasolina = precoGasolina.text.toString()

        val valorAlcool = resultadoAlcool.toDouble()
        val valorGasolina = resultadoGasolina.toDouble()

        val texto = findViewById(R.id.resultado) as TextView

        val calculoCombustivel = valorAlcool / valorGasolina



        if(calculoCombustivel >= 0.7){
            texto.setText("Melhor utilizar Gasolina")
        }else {
            texto.setText("Melhor utilizar Alcool")
        }



    }

}