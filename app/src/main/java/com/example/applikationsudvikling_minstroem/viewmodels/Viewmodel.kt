package com.example.applikationsudvikling_minstroem.viewmodels

import android.bluetooth.BluetoothClass
import android.icu.lang.UScript.ScriptUsage
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.applikationsudvikling_minstroem.data.models.Device
import com.example.applikationsudvikling_minstroem.data.models.deviceList
import com.example.applikationsudvikling_minstroem.network.RetrofitInstance
import kotlinx.coroutines.runBlocking

class Viewmodel: ViewModel() {
    fun addNewDevice(id: Int, name: String, powerUsage: Int) {
        val newDevice = Device(id, name, powerUsage)
        deviceList.add(newDevice)
    }

    fun getBestPrice() {
        val token = System.getenv("Token") // Retrieve the token from environment variables
        runBlocking {
            val instance = RetrofitInstance()
            val prices = instance.apiService.getPrices("Bearer $token")

            val minPrices = prices.minByOrNull { it.price }
            println(minPrices)
        }
    }
}