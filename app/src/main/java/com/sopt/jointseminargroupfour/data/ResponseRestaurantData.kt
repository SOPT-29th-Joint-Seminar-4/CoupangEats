package com.sopt.jointseminargroupfour.data

import com.google.gson.annotations.SerializedName
import com.sopt.jointseminargroupfour.ui.main.adapter.EatsRestaurantViewType

data class ResponseRestaurantData(
    val status: Int,
    val success: Boolean,
    val message: String,
    val data : List<RestaurantData>,

) {
    data class RestaurantData(
        val id: Int,
        val name: String,
        val deliveryTime: Int,
        val rating: Double,
        val comments: Int,
        val distance: Double,
        val isFree: Boolean,
        val deliveryFee: Int,
        val image: String,
    )
}
