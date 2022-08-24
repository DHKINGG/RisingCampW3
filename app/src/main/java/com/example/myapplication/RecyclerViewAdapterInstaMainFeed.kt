package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.MainFeedItemModel
import com.example.myapplication.databinding.InstaMainfeedBinding


class RecyclerViewAdapterInstaMainFeed : RecyclerView.Adapter<RecyclerViewAdapterInstaMainFeed.Holder>() {
    val list = mutableListOf<MainFeedItemModel>()

    inner class Holder(val binding: InstaMainfeedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MainFeedItemModel, position: Int) {
            binding.mainId.text = item.nickName
            binding.mainFeed.setImageResource(item.itemImage)

        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerViewAdapterInstaMainFeed.Holder {
        return Holder(
            InstaMainfeedBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapterInstaMainFeed.Holder, position: Int) {
        holder.bind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}



