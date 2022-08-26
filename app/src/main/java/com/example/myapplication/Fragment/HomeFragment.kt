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
        // requireContext : fragment엔 context가 없어서 context를 요청해서 가져와야함

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
        val imageList = mutableListOf<Int>()
        for (i in 0..4) {
            imageList.add(R.drawable.yadoran)
        }
        for (i in 0..10) {
            feedData.add(
                MainFeedItemModel(
                    R.drawable.hoe_bbang,
                    "$i",
                    false,
                    "doong_hwi",
                    "151,515",
                    "Good Morning",
                    "151,523",
                    R.drawable.ye,
                    imageList
                )
            )
        }
    }
}

