package com.example.santanderdevweek.data

class Cartao (val numeroCartao: String,
val finalCartao: String = numeroCartao.substring(numeroCartao.length - 4)) {
}