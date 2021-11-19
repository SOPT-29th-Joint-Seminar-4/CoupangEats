package com.sopt.jointseminargroupfour.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopt.jointseminargroupfour.R
import com.sopt.jointseminargroupfour.databinding.ItemChooseRestaurantOptionList2Binding
import com.sopt.jointseminargroupfour.databinding.ItemChooseRestaurantOptionListBinding
import com.sopt.jointseminargroupfour.util.binding

class ChooseRestaurantOptionAdapter :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val itemList = mutableListOf<ChooseRestaurantOptionData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == OptionViewType.WITHOUT) {
            return ChooseRestaurantOptionViewHolder1(
                ItemChooseRestaurantOptionListBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
        return ChooseRestaurantOptionViewHolder2(
            ItemChooseRestaurantOptionList2Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (itemList[position].viewType) {
            OptionViewType.WITHOUT -> {
                (holder as ChooseRestaurantOptionViewHolder1).bind(itemList[position])
            }
            OptionViewType.WITH -> {
                (holder as ChooseRestaurantOptionViewHolder2).bind(itemList[position])
            }
        }
    }

    override fun getItemCount() = itemList.size

    override fun getItemViewType(position: Int): Int {
        return itemList[position].viewType
    }

    fun initItemList(newList: List<ChooseRestaurantOptionData>) {
        itemList.clear()
        itemList.addAll(newList)
        notifyDataSetChanged()
    }


    class ChooseRestaurantOptionViewHolder1(private val binding: ItemChooseRestaurantOptionListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ChooseRestaurantOptionData) {
            binding.data = item
        }
    }

    class ChooseRestaurantOptionViewHolder2(private val binding: ItemChooseRestaurantOptionList2Binding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ChooseRestaurantOptionData) {
            binding.data = item
        }
    }

    object OptionViewType {
        const val WITHOUT = 1
        const val WITH = 2
    }
}