package com.sopt.jointseminargroupfour.data

import retrofit2.http.GET
import retrofit2.http.Headers

data class BannerResponse(
    val response: ServiceResponse,
    val data: List<ImageData>
) {
    data class ImageData(
        val id: Int,
        val image: String
    )
}

interface SoptService {
    @Headers("Content-Type: application/json")
    @GET("banner")
    suspend fun getMainBanner(): BannerResponse
}