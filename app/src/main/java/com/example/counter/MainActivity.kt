package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1: ImageButton = findViewById(R.id.boton1)
        val boton2: ImageButton = findViewById(R.id.boton2)
        val boton3: ImageButton = findViewById(R.id.boton3)
        val boton4: ImageButton = findViewById(R.id.boton4)

        val contador: TextView = findViewById(R.id.contador)

        boton1.setOnClickListener {
            contador.text = actualizaNumero(contador, 1.0f).toString()
        }
        boton3.setOnClickListener {
            contador.text = actualizaNumero(contador, -1.0f).toString()
        }
        boton2.setOnClickListener {
            contador.text = actualizaNumero(contador, -0.5f).toString()
        }
        boton4.setOnClickListener {
            contador.text = actualizaNumero(contador, 0.5f).toString()
        }
    }

    private fun actualizaNumero(tv_number: TextView, num: Float): Float {
        val res: Float = tv_number.text.toString().toFloat()
        val sum: Float = res + num
        return sum
    }
}










