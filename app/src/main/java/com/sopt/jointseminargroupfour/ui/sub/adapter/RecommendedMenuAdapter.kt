package com.sopt.jointseminargroupfour.ui.sub.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sopt.jointseminargroupfour.data.MenuResponse
import com.sopt.jointseminargroupfour.databinding.ItemRecommendedMenuListBinding

class RecommendedMenuAdapter(
    private val likeButtonClickListener: (Int) -> Unit
) :
    RecyclerView.Adapter<RecommendedMenuAdapter.RecommendedMenuViewHolder>() {
    val recommendedMenuList = mutableListOf<MenuResponse.MenuData>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecommendedMenuViewHolder {
        val binding = ItemRecommendedMenuListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )

        return RecommendedMenuViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: RecommendedMenuViewHolder,
        position: Int
    ) {
        holder.onBind(recommendedMenuList[position])
    }

    override fun getItemCount(): Int = recommendedMenuList.size

    inner class RecommendedMenuViewHolder(private val binding: ItemRecommendedMenuListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.btnHeart.setOnClickListener {
                binding.btnHeart.isSelected = !binding.btnHeart.isSelected
                likeButtonClickListener.invoke(adapterPosition + 1) // 1부터 있음
            }
        }

        fun onBind(data: MenuResponse.MenuData) {
            Glide.with(binding.ivMenu)
                .load(data.image)
                .into(binding.ivMenu)

            binding.tvRestaurant.text = data.name
            binding.tvMenu.text = data.menu
            binding.tvSatisfyingMenu.text = data.likes.toString() + "명이 만족한 메뉴"
            binding.tvPrice.text = data.price.toString() + "원"
            binding.tvDescription.text = data.description
        }
    }

}