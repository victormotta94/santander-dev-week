package com.example.santanderdevweek.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.santanderdevweek.R
import com.example.santanderdevweek.data.Conta
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.buscarContaCliente()

    }

    private fun buscarContaCliente() {
        mainViewModel.buscarContaCliente().observe(this, Observer { result ->
            bindOnView(result)
        })
    }

    fun bindOnView(conta: Conta) {
        findViewById<TextView>(R.id.tv_agencia).text = conta.agencia
        findViewById<TextView>(R.id.tv_acc).text = conta.conta
        findViewById<TextView>(R.id.tv_saldo_real).text = "${conta.saldoformatado}"
        findViewById<TextView>(R.id.tv_usuario).text = "Olá, ${conta.cliente.nome}"
        findViewById<TextView>(R.id.tv_valor_saldo_limite).text = "${conta.limiteformatado}"
        findViewById<TextView>(R.id.tv_cartao_value).text = conta.cartao.finalCartao
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_1 -> {
                Log.d("click", "clique no botão 1")
                true
            }
            else -> super.onOptionsItemSelected(item)

        }
    }
}