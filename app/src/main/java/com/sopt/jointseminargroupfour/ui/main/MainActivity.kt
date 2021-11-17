package com.sopt.jointseminargroupfour.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.databinding.ActivityMainBinding
import com.sopt.jointseminargroupfour.ui.main.adapter.ChooseRestaurantOptionAdapter
import com.sopt.jointseminargroupfour.ui.main.adapter.EatsRestaurantAdapter
import com.sopt.jointseminargroupfour.util.BaseView

class MainActivity : BaseView.BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initRestaurantAdapter()
        initChooseRestaurantOptionAdapter()
    }

    private fun initRestaurantAdapter() {
        val eatsRestaurantAdapter = EatsRestaurantAdapter()
        eatsRestaurantAdapter.initItemList(viewModel.getRestaurantData())
        binding.rvEatsRestaurantList.adapter = eatsRestaurantAdapter
    }

    private fun initChooseRestaurantOptionAdapter() {
        val chooseRestaurantOptionAdapter = ChooseRestaurantOptionAdapter()
        chooseRestaurantOptionAdapter.initItemList(viewModel.getChooseRestaurantOptionData())
        binding.rvChooseRestaurantOptionList.adapter = chooseRestaurantOptionAdapter
    }
}