package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.ItemParentModel
import com.example.myapplication.Model.StoryItemModel
import com.example.myapplication.databinding.InstaStroyBinding


class RecyclerViewAdapterInstaStory : RecyclerView.Adapter<RecyclerViewAdapterInstaStory.Holder>() {
    var list = mutableListOf<StoryItemModel>()

    inner class Holder(val binding: InstaStroyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: StoryItemModel, position: Int) {
            binding.ivStoryNickname.text = item.nickName
            binding.ivStoryBorder.visibility = if (item.isRead) View.GONE else View.VISIBLE
            binding.ivStoryProfile.setImageResource(item.storyImage)
        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        return Holder(
            InstaStroyBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}



