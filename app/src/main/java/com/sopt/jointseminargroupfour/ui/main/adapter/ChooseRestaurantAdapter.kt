package com.sopt.jointseminargroupfour.ui.main.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.databinding.ItemChooseRestaurantListBinding
import com.sopt.jointseminargroupfour.util.binding

class ChooseRestaurantAdapter :
    RecyclerView.Adapter<ChooseRestaurantAdapter.ChooseRestaurantViewHolder>() {

    private val itemList = mutableListOf<ChooseRestaurantItemData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ChooseRestaurantAdapter.ChooseRestaurantViewHolder(parent.binding(R.layout.item_choose_restaurant_list))

    override fun onBindViewHolder(holder: ChooseRestaurantAdapter.ChooseRestaurantViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount() = itemList.size

    fun initItemList(newList: List<ChooseRestaurantItemData>) {
        itemList.clear()
        itemList.addAll(newList)
        notifyDataSetChanged()
    }


    class ChooseRestaurantViewHolder(private val binding: ItemChooseRestaurantListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ChooseRestaurantItemData) {
            binding.data = item
        }
    }
}