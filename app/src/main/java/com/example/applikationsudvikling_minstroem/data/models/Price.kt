package com.example.applikationsudvikling_minstroem.data.models

import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("date")
    val date: String,

    @SerializedName("price")
    val price: Float
)