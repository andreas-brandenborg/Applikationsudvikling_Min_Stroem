package com.example.applikationsudvikling_minstroem.viewmodels

import android.icu.lang.UScript.ScriptUsage
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.applikationsudvikling_minstroem.data.models.Device
import com.example.applikationsudvikling_minstroem.data.models.deviceList

class Viewmodel: ViewModel() {

    fun addNewDevice(name: String, powerUsage: Int) {
        val autoincrementId = deviceList.size + 1
        val newDevice = Device(autoincrementId, name, powerUsage)
        deviceList.add(newDevice)
        println(deviceList)
    }
}
