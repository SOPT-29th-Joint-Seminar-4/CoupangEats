package com.sopt.jointseminargroupfour.ui.sub.adapter

import androidx.annotation.DrawableRes

data class RecommendedMenuItemData(
    @DrawableRes
    val image : Int,
    val restaurant : String,
    val menu : String,
    val satisfyingMenu : String,
    val price : String,
    val description : String
)
