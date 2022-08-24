package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.*
import com.example.myapplication.databinding.InstaMainfeedBinding
import com.example.myapplication.databinding.InstaStroyBinding
import com.example.myapplication.databinding.RecyclerItemViewBinding

class MultiAdapter: RecyclerView.Adapter<MultiAdapter.StoryHolder>() {
    var dataList = mutableListOf<ItemParentModel>()

    inner class StoryHolder(val binding: InstaStroyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: StoryItemModel, position: Int) { //해당 바인드를 통해 필요한 메모리들을 결합해 보여줌 <list view와 의차이점> 최소한의 리스트들만 보여지게
            // itemView에 어떻게 바인딩 할건지 여기서 정의
            binding.ivStoryNickname.text = item.nickName
            binding.ivStoryBorder.visibility = if(item.isRead) View.GONE else View.VISIBLE
            binding.ivStoryProfile.setImageResource(item.storyImage)
        }
    }

//    inner class FeedHolder(val binding: InstaMainfeedBinding) :

    // 어떤홀더를 쓸건지
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryHolder {
//        return when(viewType) {
//            STORY_TYPE -> {
//                StoryHolder(
//                    InstaStroyBinding.inflate(
//                        LayoutInflater.from(parent.context),
//                        parent,
//                        false
//                    )
//                )
//            }
//            FEED_TYPE -> {
//                FeedHolder()
//            }
//        }
        return StoryHolder(
            InstaStroyBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StoryHolder, position: Int) {
//        when (dataList[position].viewType) {
//            STORY_TYPE -> {
//
//            }
//        }
        (holder as StoryHolder).bind(dataList[position].model as StoryItemModel, position)
        holder.setIsRecyclable(false)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}