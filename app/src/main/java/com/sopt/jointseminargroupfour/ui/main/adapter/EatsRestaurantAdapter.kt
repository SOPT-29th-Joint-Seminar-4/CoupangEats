package com.sopt.jointseminargroupfour.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.databinding.ItemRestaurantListBinding
import com.sopt.jointseminargroupfour.databinding.ItemSeeMoreBinding
import com.sopt.jointseminargroupfour.util.binding

class EatsRestaurantAdapter :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val itemList = mutableListOf<EatsRestaurantItemData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            EatsRestaurantViewType.RESTAURANT.ordinal -> {
                val binding: ItemRestaurantListBinding = DataBindingUtil.inflate(
                    layoutInflater,
                    R.layout.item_restaurant_list,
                    parent,
                    false
                )
                EatsRestaurantViewHolder(binding)
            }
            else -> {
                val binding: ItemSeeMoreBinding =
                    DataBindingUtil.inflate(layoutInflater, R.layout.item_see_more, parent, false)
                SeeMoreViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentItem = itemList[position]
        when (currentItem.itemViewType) {
            EatsRestaurantViewType.RESTAURANT -> (holder as EatsRestaurantViewHolder).bind(
                currentItem
            )
            EatsRestaurantViewType.SEE_MORE -> (holder as SeeMoreViewHolder)
        }
    }

    override fun getItemCount() = itemList.size

    override fun getItemViewType(position: Int) = itemList[position].itemViewType.ordinal

    fun initItemList(newList: List<EatsRestaurantItemData>) {
        itemList.clear()
        itemList.addAll(newList)
        notifyDataSetChanged()
    }

    class EatsRestaurantViewHolder(private val binding: ItemRestaurantListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: EatsRestaurantItemData) {
            binding.data = item
            Glide.with(binding.ivRestaurantImage)
                .load(item.image)
                .into(binding.ivRestaurantImage)
        }
    }

    class SeeMoreViewHolder(private val binding: ItemSeeMoreBinding) :
        RecyclerView.ViewHolder(binding.root)
}