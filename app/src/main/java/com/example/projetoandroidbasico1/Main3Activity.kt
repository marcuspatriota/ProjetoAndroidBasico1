package com.example.projetoandroidbasico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val nome = findViewById<TextView>(R.id.ativity3_text1)
        val cpf = findViewById<TextView>(R.id.ativity3_text2)
        nome.text = "Seu nome é: ${intent.getStringExtra("nome")}"
        cpf.text = "Seu cpf é: ${intent.getStringExtra("cpf")}"
    }
}
