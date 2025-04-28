package com.example.applikationsudvikling_minstroem.viewmodels

import android.bluetooth.BluetoothClass
import android.icu.lang.UScript.ScriptUsage
import androidx.lifecycle.ViewModel
import com.example.applikationsudvikling_minstroem.data.models.Device
import com.example.applikationsudvikling_minstroem.data.models.deviceList

class Viewmodel: ViewModel() {

    fun addNewDevice(id: Int, name: String, powerUsage: Int) {
        val newDevice = Device(id, name, powerUsage)
        deviceList.add(newDevice)
    }
}