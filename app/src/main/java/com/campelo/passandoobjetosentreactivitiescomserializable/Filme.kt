package com.campelo.passandoobjetosentreactivitiescomserializable

import java.io.Serializable

data class Filme(
    val nome: String,
    val duracao: Double,
    val distribuidor: String
): Serializable
