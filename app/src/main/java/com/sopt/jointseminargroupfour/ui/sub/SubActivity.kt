package com.sopt.jointseminargroupfour.ui.sub

import android.os.Bundle
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.databinding.ActivitySubBinding
import com.sopt.jointseminargroupfour.ui.sub.adapter.RecommendedMenuAdapter
import com.sopt.jointseminargroupfour.ui.sub.adapter.RecommendedMenuItemData
import com.sopt.jointseminargroupfour.util.BaseView

class SubActivity: BaseView.BaseActivity<ActivitySubBinding>(R.layout.activity_sub) {
    private lateinit var recommendedMenuAdapter: RecommendedMenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAdapter()
        initBackBtn()
        setContentView(binding.root)
    }

    private fun initAdapter() {
        recommendedMenuAdapter = RecommendedMenuAdapter()
        binding.rvRecommended.adapter = recommendedMenuAdapter
        recommendedMenuAdapter.recommendedMenuList.addAll(
            listOf(
                RecommendedMenuItemData(
                    R.drawable.chikcen,
                    "둘둘치킨 서현점",
                    "후라이드치킨",
                    "46명이 만족한 메뉴",
                    "18,000원",
                    "새 식용유를 매일 사용하여 건강하고 깨끗한 맛.\n 얇은 튀김옷으로 칼로리를 낮춪 담백한 치킨."
                ),
                RecommendedMenuItemData(
                    R.drawable.img_store_7,
                    "피자테리아",
                    "더블크러스트골드",
                    "265명이 만족한 메뉴",
                    "16,000원",
                    "얇은 도우 두겹사이에 고구마무스 가득~\n 세블락과 화이트 허브 소세지가 추가된 프리미..."
                ),
                RecommendedMenuItemData(
                    R.drawable.img_store_8,
                    "라비떼",
                    "쿠치나",
                    "152명이 만족한 메뉴",
                    "18,000원",
                    "꽃게 새우 오징어 갑오징어 바지락 홍합\n 토마토소스와 누룽지가 들어간 매콤한 파스타..."
                ),
                RecommendedMenuItemData(
                    R.drawable.chikcen,
                    "둘둘치킨 서현점",
                    "후라이드치킨",
                    "46명이 만족한 메뉴",
                    "18,000원",
                    "새 식용유를 매일 사용하여 건강하고 깨끗한 맛.\n 얇은 튀김옷으로 칼로리를 낮춪 담백한 치킨."
                ),
                RecommendedMenuItemData(
                    R.drawable.img_store_7,
                    "피자테리아",
                    "더블크러스트골드",
                    "265명이 만족한 메뉴",
                    "16,000원",
                    "얇은 도우 두겹사이에 고구마무스 가득~\n 세블락과 화이트 허브 소세지가 추가된 프리미..."
                ),
                RecommendedMenuItemData(
                    R.drawable.img_store_8,
                    "라비떼",
                    "쿠치나",
                    "152명이 만족한 메뉴",
                    "18,000원",
                    "꽃게 새우 오징어 갑오징어 바지락 홍합\n 토마토소스와 누룽지가 들어간 매콤한 파스타..."
                ),
                RecommendedMenuItemData(
                    R.drawable.chikcen,
                    "둘둘치킨 서현점",
                    "후라이드치킨",
                    "46명이 만족한 메뉴",
                    "18,000원",
                    "새 식용유를 매일 사용하여 건강하고 깨끗한 맛.\n 얇은 튀김옷으로 칼로리를 낮춪 담백한 치킨."
                ),
                RecommendedMenuItemData(
                    R.drawable.img_store_7,
                    "피자테리아",
                    "더블크러스트골드",
                    "265명이 만족한 메뉴",
                    "16,000원",
                    "얇은 도우 두겹사이에 고구마무스 가득~\n 세블락과 화이트 허브 소세지가 추가된 프리미..."
                ),
                RecommendedMenuItemData(
                    R.drawable.img_store_8,
                    "라비떼",
                    "쿠치나",
                    "152명이 만족한 메뉴",
                    "18,000원",
                    "꽃게 새우 오징어 갑오징어 바지락 홍합\n 토마토소스와 누룽지가 들어간 매콤한 파스타..."
                )
            )
        )
        binding.tvCount.text ="총 ${recommendedMenuAdapter.itemCount}개"
        recommendedMenuAdapter.notifyDataSetChanged()
    }

    private fun initBackBtn(){
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
