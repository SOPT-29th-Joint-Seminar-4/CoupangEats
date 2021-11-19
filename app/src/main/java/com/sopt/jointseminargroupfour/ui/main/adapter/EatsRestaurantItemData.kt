package com.sopt.jointseminargroupfour.ui.main.adapter

import androidx.annotation.DrawableRes

data class EatsRestaurantItemData(
    @DrawableRes
    val image: Int = -1,
    val name: String = "",
    val time: String = "",
    val rateAndDistance: String = "",
    val itemViewType: EatsRestaurantViewType = EatsRestaurantViewType.RESTAURANT
)