package com.campelo.passandoobjetosentreactivitiescomserializable

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    private lateinit var txtNome: TextView
    private lateinit var txtDuracao: TextView
    private lateinit var txtDistribuidor: TextView
    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        txtNome = findViewById(R.id.txtNome)
        txtDuracao = findViewById(R.id.txtDuracao)
        txtDistribuidor = findViewById(R.id.txtDistribuidor)
        btnVoltar = findViewById(R.id.btnVoltar)

        val bundle = intent.extras

        val filme = if(Build.VERSION.SDK_INT >= 33){
            bundle?.getSerializable("filme", Filme::class.java)
        }else{
            bundle?.getSerializable("filme") as Filme
        }

        txtNome.text = "Nome: ${filme?.nome}"
        txtDuracao.text = "Duração: ${filme?.duracao}"
        txtDistribuidor.text = "Distribuidor: ${filme?.distribuidor}"

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}