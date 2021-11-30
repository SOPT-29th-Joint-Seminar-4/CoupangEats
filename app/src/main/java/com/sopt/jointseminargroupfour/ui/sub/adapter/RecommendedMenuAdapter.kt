package com.sopt.jointseminargroupfour.ui.sub.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sopt.jointseminargroupfour.databinding.ItemRecommendedMenuListBinding

class RecommendedMenuAdapter(
    private val likeButtonClickListener: (Int) -> Unit
) :
    RecyclerView.Adapter<RecommendedMenuAdapter.RecommendedMenuViewHolder>() {
    val recommendedMenuList = mutableListOf<RecommendedMenuItemData>()

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

        fun onBind(data: RecommendedMenuItemData) {
            Glide.with(binding.ivMenu)
                .load(data.image)
                .into(binding.ivMenu)

            binding.tvRestaurant.text = data.restaurant
            binding.tvMenu.text = data.menu
            binding.tvSatisfyingMenu.text = data.satisfyingMenu
            binding.tvPrice.text = data.price
            binding.tvDescription.text = data.description
        }
    }

}