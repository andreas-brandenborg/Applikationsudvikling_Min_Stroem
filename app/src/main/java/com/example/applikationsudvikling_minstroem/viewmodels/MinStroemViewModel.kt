package com.example.applikationsudvikling_minstroem.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.applikationsudvikling_minstroem.network.MinStroemApi
import kotlinx.coroutines.launch

class MinStroemViewModel: ViewModel() {
    fun getPrices() {
        viewModelScope.launch {
            try {
                val response = MinStroemApi.retrofitService.getPrices()
            } catch (e: Exception) {
                println("Error")
            }
        }
    }
}

