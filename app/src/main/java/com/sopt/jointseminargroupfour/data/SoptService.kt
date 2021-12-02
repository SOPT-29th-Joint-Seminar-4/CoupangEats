package com.sopt.jointseminargroupfour.data

import androidx.annotation.MenuRes
import retrofit2.Call
import retrofit2.http.*

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

data class MenuResponse(
    val response: ServiceResponse,
    val data: List<MenuData>
) {
    data class MenuData(
        val id: Int,
        val image: String,
        val name: String,
        val menu: String,
        val likes: Int,
        val price: Int,
        val description: String
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

    // 메뉴 조회
    @Headers("Contet-Type: application/json")
    @GET("menu")
    fun getMenu() : Call<MenuResponse>

}