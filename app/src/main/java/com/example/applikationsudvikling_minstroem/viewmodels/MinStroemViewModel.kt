package com.example.applikationsudvikling_minstroem.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.applikationsudvikling_minstroem.network.RetrofitInstance
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

val token = System.getenv("Token") // Retrieve the token from environment variables

fun main() {
    runBlocking {
        val instance = RetrofitInstance()
        val prices = instance.apiService.getPrices("Bearer $token")

        println(prices)
    }
}
