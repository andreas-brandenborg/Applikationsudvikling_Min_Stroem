package com.example.applikationsudvikling_minstroem.network
import android.os.Environment
import com.example.applikationsudvikling_minstroem.data.models.Price
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

class RetrofitInstance {
    private val baseURL = "https://api.minstroem.app/thirdParty/"

    private val retrofitClient = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofitClient.create(MinStroemApiService::class.java)
}

interface MinStroemApiService {

    @GET("prices/DK2")
    suspend fun getPrices(
        @Header("Authorization") token: String // Pass the token as a parameter
    ): Price
}
