package com.example.projetoandroidbasico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class VisaoLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val usuario = findViewById<TextView>(R.id.activity5_text1)
        val senha = findViewById<TextView>(R.id.activity5_text2)

        usuario.text = "${usuario.text} ${intent.getStringExtra("login")}"
        senha.text = "${senha.text} ${intent.getStringExtra("senha")}"
    }
}
