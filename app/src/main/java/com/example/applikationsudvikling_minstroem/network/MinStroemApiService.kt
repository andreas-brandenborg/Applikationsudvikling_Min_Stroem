package com.example.applikationsudvikling_minstroem.network
import com.example.applikationsudvikling_minstroem.data.models.Price
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET


private const val BASE_URL =
    "https://api.minstroem.app/thirdParty"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface MinStroemApiService {
    @GET("prices/DK2")
    suspend fun getPrices(): Price
}

object MinStroemApi {
    val retrofitService : MinStroemApiService by lazy {
        retrofit.create(MinStroemApiService::class.java)
    }
}
