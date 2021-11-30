package com.sopt.jointseminargroupfour.ui.main.adapter

import androidx.annotation.DrawableRes

data class FoodTypeData(
    val name: String,
    @DrawableRes
    val image: Int,
    val isNew: Boolean = false
)