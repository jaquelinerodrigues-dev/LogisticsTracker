package br.fatec.garca.logistics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    // Ponto de entrada (Main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LogisticsTracker", "App iniciado com sucesso")

        // Infla o XML na tela
        setContentView(R.layout.main_activity)

        // Lógica dinâmica
        val tvStatus = findViewById<TextView>(R.id.textViewStatus)
        tvStatus.text = "Sistema de Rastreio Ativo"

        val botao = findViewById<Button>(R.id.botao)

        botao.setOnClickListener {
            Log.d("LogisticsTracker", "Botão clicado!")
        }
    }
}