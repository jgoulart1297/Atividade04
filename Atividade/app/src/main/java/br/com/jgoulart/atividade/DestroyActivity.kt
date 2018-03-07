package br.com.jgoulart.atividade

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DestroyActivity : AppCompatActivity() {

    lateinit var textoDestroy: TextView
    lateinit var botaoSair: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destroy)

        textoDestroy = findViewById(R.id.texto_destroy)
        botaoSair = findViewById(R.id.botao_sair)
        botaoSair.setOnClickListener({
            finish()
            onResume()
        })
    }
}