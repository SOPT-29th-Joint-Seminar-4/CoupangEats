package com.sopt.jointseminargroupfour.ui.main

import androidx.lifecycle.ViewModel
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.ui.main.adapter.ChooseRestaurantItemData
import com.sopt.jointseminargroupfour.ui.main.adapter.ChooseRestaurantOptionData
import com.sopt.jointseminargroupfour.ui.main.adapter.EatsRestaurantItemData

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
                R.drawable.img_store_6,
                "뫼루니 참치초밥",
                "1.7km   배달비 3,000원",
                "16-26분"
            ),
            ChooseRestaurantItemData(
                R.drawable.img_store_6,
                "뫼루니 참치초밥",
                "1.7km   배달비 3,000원",
                "16-26분"
            ),
        )
    }
}