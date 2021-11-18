package com.sopt.jointseminargroupfour.ui.main.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.databinding.ItemFoodTypeBinding
import com.sopt.jointseminargroupfour.util.binding

class FoodTypeAdapter : RecyclerView.Adapter<FoodTypeAdapter.FoodTypeViewHolder>() {

    private val itemList = mutableListOf<FoodTypeData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        FoodTypeViewHolder(parent.binding(R.layout.item_food_type))

    override fun onBindViewHolder(holder: FoodTypeViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount() = itemList.size

    fun initItemList(newList: List<FoodTypeData>) {
        itemList.clear()
        itemList.addAll(newList)
        notifyDataSetChanged()
    }

    class FoodTypeViewHolder(private val binding: ItemFoodTypeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: FoodTypeData) {
            binding.data = item
        }
    }
}
