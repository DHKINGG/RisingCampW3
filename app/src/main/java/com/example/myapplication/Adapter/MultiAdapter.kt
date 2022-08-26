package com.example.myapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.*
import com.example.myapplication.databinding.*

class MultiAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var storyDataList = mutableListOf<StoryItemModel>()
    var feedDataList = mutableListOf<MainFeedItemModel>()
    lateinit var adapterContext: Context

    inner class StoryHolder(val binding: InstaStoryMultiViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MutableList<StoryItemModel>) { //해당 바인드를 통해 필요한 메모리들을 결합해 보여줌 <list view와 의차이점> 최소한의 리스트들만 보여지게
            binding.rvStory.layoutManager = LinearLayoutManager(adapterContext, LinearLayoutManager.HORIZONTAL, false)
            val recyclerAdapter = RecyclerViewAdapterInstaStory()
            recyclerAdapter.list = item
            binding.rvStory.adapter = recyclerAdapter
        }
    }

    inner class FeedHolder(val binding: InstaFeedMultiviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MutableList<MainFeedItemModel>) { //해당 바인드를 통해 필요한 메모리들을 결합해 보여줌 <list view와 의차이점> 최소한의 리스트들만 보여지게
            binding.rvFeed.layoutManager = LinearLayoutManager(adapterContext, LinearLayoutManager.VERTICAL, false)
            val recyclerAdapter = RecyclerViewAdapterInstaMainFeed()
            recyclerAdapter.list = item
            binding.rvFeed.adapter = recyclerAdapter
        }
    }

    // 어떤홀더를 쓸건지
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == 0) {
            return StoryHolder(
                InstaStoryMultiViewBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        } else {
            return FeedHolder(
                InstaFeedMultiviewBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (position == 0) {
            (holder as StoryHolder).bind(storyDataList)
        } else {
            (holder as FeedHolder).bind(feedDataList)
        }
        holder.setIsRecyclable(false)
    }

    override fun getItemCount(): Int {
        return 2
    }

    fun setContext(context: Context) {
        adapterContext = context
    }
}