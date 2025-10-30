package br.edu.mouralacerda.cadastrocarro

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CarroDAO {

    @Insert
    fun salvar(carro: Carro)

    @Query("SELECT * FROM Carro")
    fun listar(): List<Carro>

    @Query("SELECT * FROM Carro ORDER BY ano")
    fun listarAno(): List<Carro>
}