package com.sopt.jointseminargroupfour.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.PUT
import retrofit2.http.Path

data class BannerResponse(
    val response: ServiceResponse,
    val data: List<ImageData>
) {
    data class ImageData(
        val id: Int,
        val image: String
    )
}

data class ModifyFavoriteShopResponse(
    val response: ServiceResponse,
    val data: Like
) {
    data class Like(
        val isLike: Boolean
    )
}

interface SoptService {
    @Headers("Content-Type: application/json")
    @GET("banner")
    suspend fun getMainBanner(): BannerResponse

    @Headers("Content-Type: application/json")
    @PUT("shop/{shopId}")
    suspend fun putShopId(
        @Path("shopId") shopId: Int
    ): ModifyFavoriteShopResponse

    @Headers("Content-Type: application/json")
    @GET("shop")
    fun getShop() : Call<ResponseRestaurantData>
}