package com.example.santanderdevweek.data
import java.text.NumberFormat;
import java.util.*

data class Conta (
    val conta: String,
    val agencia: String,
    val saldo: Double,
    val limite: Double,
    val cliente: Cliente,
    val cartao: Cartao,
        ) {

    var limiteformatado = NumberFormat.getCurrencyInstance().format(saldo + limite);
    var saldoformatado = NumberFormat.getCurrencyInstance().format(saldo)

        }