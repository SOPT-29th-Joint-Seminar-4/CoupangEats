package com.sopt.jointseminargroupfour.ui.main.adapter

import androidx.annotation.DrawableRes

data class EatsRestaurantItemData(
    @DrawableRes
    val image: Int,
    val name: String,
    val time: String,
    val rateAndDistance: String,
)