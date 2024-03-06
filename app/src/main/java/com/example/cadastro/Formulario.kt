package com.example.cadastro

class Formulario (
    var nome: String,
    var telefone: String,
    var email: String,
    var comunicacoes: Boolean,
    var sexo: String,
    var cidade: String,
    var uf: String
){
    override fun toString(): String {
        return "Formulario(nome='$nome', telefone=$telefone, email=$email, comunicacoes=$comunicacoes, sexo='$sexo', cidade='$cidade', uf='$uf')"
    }
}