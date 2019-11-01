package com.example.projetoandroidbasico1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonEntrar = findViewById<Button>(R.id.activity2_button2)

        buttonEntrar.setOnClickListener {
            val intent = Intent(this, VisaoCadastroActivity::class.java)
            val nome = findViewById<EditText>(R.id.ativity2_editText1)
            val cpf = findViewById<EditText>(R.id.ativity2_editText2)
            intent.putExtra("nome",nome.text.toString())
            intent.putExtra("cpf",cpf.text.toString())

            startActivity (intent)

        }
        val buttonCancelar = findViewById<Button>(R.id.activity2_button1)
        buttonCancelar.setOnClickListener {
            finish()
        }
    }
}
