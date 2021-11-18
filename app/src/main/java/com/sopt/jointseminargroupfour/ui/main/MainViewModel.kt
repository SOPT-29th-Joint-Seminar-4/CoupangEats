package com.sopt.jointseminargroupfour.ui.main

import androidx.lifecycle.ViewModel
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.ui.main.adapter.EatsRestaurantItemData
import com.sopt.jointseminargroupfour.ui.main.adapter.EatsRestaurantViewType

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
}