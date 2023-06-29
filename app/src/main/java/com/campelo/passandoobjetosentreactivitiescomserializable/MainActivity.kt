package com.campelo.passandoobjetosentreactivitiescomserializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnEntrar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEntrar = findViewById(R.id.btnEntrar)
        btnEntrar.setOnClickListener {

            val intent = Intent(this, DetalhesActivity::class.java)
            val filme = Filme("Velozes e Furiosos 10", 2.21, "Prime Video")

            intent.putExtra("filme", filme)

            startActivity(intent)
        }
    }
}