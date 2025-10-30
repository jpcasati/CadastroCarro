package br.edu.mouralacerda.cadastrocarro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoAdd = findViewById<FloatingActionButton>(R.id.btnAdd)

        botaoAdd.setOnClickListener {
            val i = Intent(this, TelaCarro::class.java)
            startActivity(i)
        }
    }

    override fun onResume() {
        super.onResume()
        val listaCarros = findViewById<ListView>(R.id.lstCarros)
        preencherlista(listaCarros)
    }

    private fun preencherlista(listaTela: ListView) {

        val lista = Database.getInstance(this)!!.carroDAO().listarAno()

        val listaAdaptada =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, lista)

        listaTela.adapter = listaAdaptada
    }
}