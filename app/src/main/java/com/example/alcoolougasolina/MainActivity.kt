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

    fun btCalcular(view: View) {

        val precoAlcool = findViewById(R.id.preco_alcool) as EditText
        val resultadoAlcool = precoAlcool.text.toString()

        val precoGasolina = findViewById(R.id.preco_gasolina) as EditText
        val resultadoGasolina = precoGasolina.text.toString()

        val valorAlcool = resultadoAlcool.toDouble()
        val valorGasolina = resultadoGasolina.toDouble()

        val textoExcecao = findViewById(R.id.textRejeicao) as TextView

        val texto = findViewById(R.id.resultado) as TextView

        val validaCampos = validarCampo(resultadoAlcool, resultadoGasolina)

        if(validaCampos){
            val caluladoraPreco = calculaPrecoIdeal(resultadoAlcool, resultadoGasolina)

        }else{
            texto.setText("Informe um valor válido aos campos")

        }

    }
    fun validarCampo(resultadoAlcool: String, resultadoGasolina: String): Boolean{
        var camposValidados: Boolean = true

        if(resultadoAlcool == null || resultadoAlcool == "" && resultadoGasolina == null || resultadoGasolina == ""){
            camposValidados = false
        }
        return camposValidados
    }
    fun calculaPrecoIdeal (precoAlcool: String, precoGasolina: String){
        var valorGasolina = precoGasolina.toDouble()
        var valorAlcool = precoAlcool.toDouble()

        var calculardora = valorAlcool / valorGasolina

        val texto = findViewById(R.id.resultado) as TextView

        if(calculardora > 0.7){
            texto.setText("Melhor escolha e a gasolina")
        }else{
            texto.setText("Melhor escolha e o alcool")
        }
    }

}