package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class fakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Victor")
        val cartao = Cartao("999999")
        return Conta(
            "12345-67",
            "00001-0",
            100.00,
            150.00,
            cliente,
            cartao
        );

    }
}