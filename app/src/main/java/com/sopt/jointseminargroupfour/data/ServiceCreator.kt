package com.sopt.jointseminargroupfour.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    private const val BASE_URL = ""
    private val soptRetrofit: Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    val soptService: SoptService = soptRetrofit.create(SoptService::class.java)
}