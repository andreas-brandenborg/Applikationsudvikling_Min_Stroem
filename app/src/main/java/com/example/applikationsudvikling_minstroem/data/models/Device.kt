package com.example.applikationsudvikling_minstroem.data.models

class Device(id: Int, name: String, powerUsage: Int) {
    var Charge: Boolean = false

    fun chooseCharge() {
        Charge!=Charge
    }
}

val deviceList = mutableListOf<Device>(
    Device(1, "Ovn", 500),
    Device(2, "Tørertumbler", 500),
    Device(3, "Vaskemaskine", 500),
    Device(4, "Opvasker", 500),
    Device(5, "El-cykel", 500)
)