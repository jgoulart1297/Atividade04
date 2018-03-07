package br.com.jgoulart.atividade

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CreateActivity : AppCompatActivity() {

    lateinit var textoCreate: TextView
    lateinit var botaoStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        textoCreate = findViewById(R.id.texto_create)
        botaoStart = findViewById(R.id.botao_start)
        botaoStart.setOnClickListener({
            val bundle = Bundle()
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}
