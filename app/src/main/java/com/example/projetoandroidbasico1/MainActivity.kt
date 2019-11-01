
package com.example.projetoandroidbasico1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin = findViewById<Button>(R.id.activity1_button1)
        buttonLogin.setOnClickListener {
            val intent = Intent(this,Main4Activity::class.java)
            startActivity(intent)
        }
        val buttonRegistro = findViewById<Button>(R.id.activity1_button2)
        buttonRegistro.setOnClickListener {
            val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }

    }
}
