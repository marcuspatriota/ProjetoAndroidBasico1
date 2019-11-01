package com.example.projetoandroidbasico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val usuario = findViewById<TextView>(R.id.activity5_text1)
        val senha = findViewById<TextView>(R.id.activity5_text2)
        usuario.text = "Seu login é: ${intent.getStringExtra("login")}"
        senha.text = "Sua senha é ${intent.getStringExtra("senha")}"
    }
}
