package com.sopt.jointseminargroupfour.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.data.ResponseRestaurantData
import com.sopt.jointseminargroupfour.data.ServiceCreator
import com.sopt.jointseminargroupfour.databinding.ActivityMainBinding
import com.sopt.jointseminargroupfour.ui.main.adapter.*
import com.sopt.jointseminargroupfour.ui.sub.SubActivity
import com.sopt.jointseminargroupfour.util.BaseView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.E


class MainActivity : BaseView.BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initChooseRestaurantOptionAdapter()
        initChooseRestaurantAdapter()
        initFoodListAdapter()
        initRecommendButton()
        observeBannerImage()
        initNetwork()
    }

    private fun initNetwork(){
        val call: Call<ResponseRestaurantData> = ServiceCreator.soptService.getShop()

        call.enqueue(object: Callback<ResponseRestaurantData> {
            override fun onResponse(
                call: Call<ResponseRestaurantData>,
                response: Response<ResponseRestaurantData>
            ) {
                if(response.isSuccessful) {
                    val data = response.body()?.data
                    if (data != null) {
                        initRestaurantAdapter(data)
                    }
                } else {
                    Log.e("NetworkTest","error")
                }
            }

            override fun onFailure(call: Call<ResponseRestaurantData>, t: Throwable) {
                Log.e("NetworkTest","error:$t")
            }
        })
    }

    private fun initRestaurantAdapter(data: List<ResponseRestaurantData.RestaurantData>) {
        val eatsRestaurantAdapter = EatsRestaurantAdapter()
        binding.rvEatsRestaurantList.adapter = eatsRestaurantAdapter

        eatsRestaurantAdapter.initItemList(

            data.map { EatsRestaurantItemData(
                it.image,
                it.name,
                it.deliveryTime,
                it.rating,
                it.comments,
                it.distance,
                it.isFree,
            ) },

            data.map { EatsRestaurantItemData(
                it.image,
                it.name,
                it.deliveryTime,
                it.rating,
                it.comments,
                it.distance,
                it.isFree,
                itemViewType = EatsRestaurantViewType.SEE_MORE
            ) },
        )
    }

    private fun initChooseRestaurantOptionAdapter() {
        val chooseRestaurantOptionAdapter = ChooseRestaurantOptionAdapter()
        chooseRestaurantOptionAdapter.initItemList(viewModel.getChooseRestaurantOptionData())
        binding.rvChooseRestaurantOptionList.adapter = chooseRestaurantOptionAdapter
    }

    private fun initChooseRestaurantAdapter() {
        val chooseRestaurantAdapter = ChooseRestaurantAdapter()
        chooseRestaurantAdapter.initItemList(viewModel.getChooseRestaurantData())
        binding.rvChooseRestaurantList.adapter = chooseRestaurantAdapter
    }

    private fun initFoodListAdapter() {
        val foodTypeAdapter = FoodTypeAdapter()
        foodTypeAdapter.initItemList(viewModel.getFoodTypeData())
        binding.rvFoodType.adapter = foodTypeAdapter
    }

    private fun initRecommendButton() {
        binding.btnRecoMenu.setOnClickListener {
            startActivity(Intent(this, SubActivity::class.java))
        }
    }

    private fun observeBannerImage() {
        viewModel.bannerImageUrl.observe(this) { newImageUrl ->
            Glide.with(binding.ivTopAd)
                .load(newImageUrl)
                .into(binding.ivTopAd)
        }
    }
}