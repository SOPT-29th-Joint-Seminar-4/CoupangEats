package com.sopt.jointseminargroupfour.ui.main.adapter

data class EatsRestaurantItemData(
    val image: String,
    val name: String,
    val deliveryTime: Int,
    val rating: Double,
    val comments: Int,
    val distance: Double,
    val isFree: Boolean,
    val itemViewType: EatsRestaurantViewType = EatsRestaurantViewType.RESTAURANT
)