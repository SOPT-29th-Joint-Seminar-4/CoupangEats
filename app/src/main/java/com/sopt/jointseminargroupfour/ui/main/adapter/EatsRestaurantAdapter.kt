package com.sopt.jointseminargroupfour.ui.main.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.databinding.ItemRestaurantListBinding
import com.sopt.jointseminargroupfour.util.binding

class EatsRestaurantAdapter :
    RecyclerView.Adapter<EatsRestaurantAdapter.EatsRestaurantViewHolder>() {

    private val itemList = mutableListOf<EatsRestaurantItemData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        EatsRestaurantViewHolder(parent.binding(R.layout.item_restaurant_list))

    override fun onBindViewHolder(holder: EatsRestaurantViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount() = itemList.size

    fun initItemList(newList: List<EatsRestaurantItemData>) {
        itemList.clear()
        itemList.addAll(newList)
        notifyDataSetChanged()
    }


    class EatsRestaurantViewHolder(private val binding: ItemRestaurantListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: EatsRestaurantItemData) {
            binding.data = item
        }
    }
}