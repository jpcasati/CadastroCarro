package br.edu.mouralacerda.cadastrocarro

import androidx.room.*

@Entity
data class Carro(
    val marca: String,
    val modelo: String,
    val ano: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int?
){
    override fun toString(): String {
        return "$id - $marca - $modelo - $ano"
    }
}
