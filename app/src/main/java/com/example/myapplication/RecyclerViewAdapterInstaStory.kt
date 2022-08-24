package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.StoryItemModel
import com.example.myapplication.databinding.InstaMainfeedBinding
import com.example.myapplication.databinding.InstaStroyBinding


class RecyclerViewAdapterInstaStory : RecyclerView.Adapter<RecyclerViewAdapterInstaStory.Holder>() {
    val list = mutableListOf<StoryItemModel>()

    inner class Holder(val binding: InstaStroyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: StoryItemModel, position: Int) {
            binding.textView.text = item.nickName
            binding.imageStory.setImageResource(item.itemImage)

        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerViewAdapterInstaStory.Holder {
        return Holder(
            InstaStroyBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapterInstaStory.Holder, position: Int) {
        holder.bind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}



