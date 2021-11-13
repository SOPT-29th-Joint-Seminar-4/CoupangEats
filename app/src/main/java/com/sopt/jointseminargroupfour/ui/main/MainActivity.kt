package com.sopt.jointseminargroupfour.ui.main

import android.os.Bundle
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.databinding.ActivityMainBinding
import com.sopt.jointseminargroupfour.util.BaseView

class MainActivity : BaseView.BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}