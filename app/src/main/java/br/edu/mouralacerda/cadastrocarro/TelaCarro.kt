package br.edu.mouralacerda.cadastrocarro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class TelaCarro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_carro)

        val botaoSalvar = findViewById<Button>(R.id.btnSalvar)

        botaoSalvar.setOnClickListener {

            val marca = findViewById<EditText>(R.id.edtMarca).text.toString()
            val modelo = findViewById<EditText>(R.id.edtModelo).text.toString()
            val ano = findViewById<EditText>(R.id.edtAno).text.toString().toInt()

            val c = Carro(marca, modelo, ano, null)

            Database.getInstance(this)!!.carroDAO().salvar(c)

            Toast.makeText(this, "Salvo com sucesso!", Toast.LENGTH_SHORT).show()

            finish()
        }
    }
}