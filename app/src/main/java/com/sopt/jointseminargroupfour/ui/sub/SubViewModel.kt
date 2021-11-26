package com.sopt.jointseminargroupfour.ui.sub

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.jointseminargroupfour.data.ServiceCreator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SubViewModel : ViewModel() {
    private val ioDispatchers = Dispatchers.IO
    fun putLikeButton(id: Int) {
        viewModelScope.launch(ioDispatchers) {
            ServiceCreator.soptService.putShopId(id)
        }
    }
}