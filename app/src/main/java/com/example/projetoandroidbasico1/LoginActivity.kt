package com.example.projetoandroidbasico1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val buttonEntrar = findViewById<Button>(R.id.activity4_button2)
        buttonEntrar.setOnClickListener {
            val intent = Intent(this,VisaoLoginActivity::class.java)
            val usuario = findViewById<EditText>(R.id.ativity4_editText1)
            val senha = findViewById<EditText>(R.id.ativity4_editText2)

            intent.putExtra("login", usuario.text.toString())
            intent.putExtra("senha",senha.text.toString())
            startActivity(intent)
        }
        val buttonCancelar = findViewById<Button>(R.id.activity4_button1)
        buttonCancelar.setOnClickListener {
            finish()
        }
    }
}
