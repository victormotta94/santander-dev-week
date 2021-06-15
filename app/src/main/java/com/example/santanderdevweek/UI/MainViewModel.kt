package com.example.santanderdevweek.UI

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.santanderdevweek.data.Conta
import com.example.santanderdevweek.data.local.fakeData

class MainViewModel : ViewModel() {
    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente(): LiveData<Conta> {
        mutableLiveData.value = fakeData().getLocalData()
        return mutableLiveData
    }
}