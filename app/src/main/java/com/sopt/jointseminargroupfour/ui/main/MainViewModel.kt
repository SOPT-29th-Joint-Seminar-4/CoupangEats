package com.sopt.jointseminargroupfour.ui.main

import androidx.lifecycle.ViewModel
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.ui.main.adapter.EatsRestaurantItemData
import com.sopt.jointseminargroupfour.ui.main.adapter.EatsRestaurantViewType
import com.sopt.jointseminargroupfour.ui.main.adapter.FoodTypeData

class MainViewModel : ViewModel() {
    fun getRestaurantData(): List<EatsRestaurantItemData> {
        return listOf(
            EatsRestaurantItemData(
                R.drawable.img_store_1,
                "피자헛",
                "20~25분",
                "4.8(4,805) 2.2km"
            ),
            EatsRestaurantItemData(
                R.drawable.img_store_2,
                "세인트 버거",
                "15~20분",
                "4.6(1,005) 1.5km"
            ),
            EatsRestaurantItemData(
                R.drawable.img_store_3,
                "페이브",
                "19~29분",
                "4.9(2,832) 1.3km"
            ),
            EatsRestaurantItemData(
                R.drawable.img_store_4,
                "리미니",
                "23~33분",
                "4.8(2,126) 1.8km"
            ),
            EatsRestaurantItemData(
                R.drawable.img_store_5,
                "샐리디",
                "15~25분",
                "4.7(562) 1.4km"
            ),
            EatsRestaurantItemData(
                itemViewType = EatsRestaurantViewType.SEE_MORE
            )
        )
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
}