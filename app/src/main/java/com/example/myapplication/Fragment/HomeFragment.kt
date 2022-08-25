package com.example.myapplication.Fragment

import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapter.MultiAdapter
import com.example.myapplication.Adapter.RecyclerViewAdapterInstaMainFeed
import com.example.myapplication.Adapter.RecyclerViewAdapterInstaStory
import com.example.myapplication.Model.ItemParentModel
import com.example.myapplication.Model.MainFeedItemModel
import com.example.myapplication.Model.STORY_TYPE
import com.example.myapplication.Model.StoryItemModel
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment() : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private var storyData = mutableListOf<StoryItemModel>()
    private var feedData = mutableListOf<MainFeedItemModel>()
    override fun initView() {
        setStoryData()
        setFeedData()

        binding.rvMain.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        val adapter = MultiAdapter()
        adapter.storyDataList = storyData
        adapter.feedDataList = feedData
        adapter.setContext(requireContext())
        binding.rvMain.adapter = adapter
    }

    fun setStoryData() {
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", false))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", false))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", false))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", false))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
        storyData.add(StoryItemModel(R.drawable.yadoran, "yaya", true))
    }

    fun setFeedData() {
        for (i in 0..10) {
            feedData.add(
                MainFeedItemModel(
                    R.drawable.yadoran,
                    "kkk",
                    false,
                    "dddd",
                    "151,515",
                    "edqeqe",
                    "151,523",
                    R.drawable.yadoran
                )
            )
        }
    }
}

