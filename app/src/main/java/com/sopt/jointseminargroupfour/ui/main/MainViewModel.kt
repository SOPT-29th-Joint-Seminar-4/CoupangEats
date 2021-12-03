package com.sopt.jointseminargroupfour.ui.main

import android.icu.lang.UCharacter
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.data.ResponseRestaurantData
import com.sopt.jointseminargroupfour.data.ServiceCreator
import com.sopt.jointseminargroupfour.ui.main.adapter.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    private val ioDispatcher = Dispatchers.IO
    private val _bannerImageUrl = MutableLiveData<String>()
    val bannerImageUrl: LiveData<String> get() = _bannerImageUrl

    init {
        getMainBanner()
    }

    private fun getMainBanner() {
        viewModelScope.launch(ioDispatcher) {
            val soptService = ServiceCreator.soptService.getMainBanner()
            _bannerImageUrl.postValue(soptService.data[0].image)
        }
    }

    fun getFoodTypeData(): List<FoodTypeData> {
        return listOf(
            FoodTypeData(
                "신규 맛집",
                R.drawable.food1,
                true
            ),
            FoodTypeData(
                "1인분",
                R.drawable.food2,
            ),
            FoodTypeData(
                "한식",
                R.drawable.food3,
            ),
            FoodTypeData(
                "치킨",
                R.drawable.food4,
            ),
            FoodTypeData(
                "분식",
                R.drawable.food5,
            ),
            FoodTypeData(
                "돈까스",
                R.drawable.food6,
            ),
            FoodTypeData(
                "족발/보쌈",
                R.drawable.food7,
            ),
            FoodTypeData(
                "샌드위치",
                R.drawable.food8,
            ),
            FoodTypeData(
                "커피",
                R.drawable.food9,
            ),
            FoodTypeData(
                "디저트",
                R.drawable.food10,
            )
        )
    }

    fun getChooseRestaurantOptionData(): List<ChooseRestaurantOptionData> {
        return listOf(
            ChooseRestaurantOptionData(
                "추천순",
                2
            ),
            ChooseRestaurantOptionData(
                "치타배달",
                1
            ),
            ChooseRestaurantOptionData(
                "배달비",
                2
            ),
            ChooseRestaurantOptionData(
                "최소주문",
                2
            ),
            ChooseRestaurantOptionData(
                "포장",
                1
            ),
            ChooseRestaurantOptionData(
                "할인쿠폰",
                1
            )


        )
    }

    fun getChooseRestaurantData(): List<ChooseRestaurantItemData> {
        return listOf(
            ChooseRestaurantItemData(
                R.drawable.img_store_6_temp,
                "뫼루니 참치초밥",
                "1.7km   배달비 3,000원",
                "16-26분"
            ),
            ChooseRestaurantItemData(
                R.drawable.img_store_6_temp,
                "뫼루니 참치초밥",
                "1.7km   배달비 3,000원",
                "16-26분"
            ),
        )
    }
}