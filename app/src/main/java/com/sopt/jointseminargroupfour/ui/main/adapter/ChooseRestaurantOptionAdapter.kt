package com.sopt.jointseminargroupfour.ui.main.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.databinding.ItemChooseRestaurantOptionListBinding
import com.sopt.jointseminargroupfour.util.binding

class ChooseRestaurantOptionAdapter :
    RecyclerView.Adapter<ChooseRestaurantOptionAdapter.ChooseRestaurantOptionViewHolder>() {

    private val itemList = mutableListOf<ChooseRestaurantOptionData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ChooseRestaurantOptionAdapter.ChooseRestaurantOptionViewHolder(parent.binding(R.layout.item_choose_restaurant_option_list))

    override fun onBindViewHolder(holder: ChooseRestaurantOptionAdapter.ChooseRestaurantOptionViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount() = itemList.size

    fun initItemList(newList: List<ChooseRestaurantOptionData>) {
        itemList.clear()
        itemList.addAll(newList)
        notifyDataSetChanged()
    }


    class ChooseRestaurantOptionViewHolder(private val binding: ItemChooseRestaurantOptionListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ChooseRestaurantOptionData) {
            binding.data = item
        }
    }
}