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
        storyData.add(StoryItemModel(R.drawable.yadoran, "2blux", false))
        storyData.add(StoryItemModel(R.drawable.insta_story_image1, "doong_hwi", true))
        storyData.add(StoryItemModel(R.drawable.insta_story_image2, "j_youngg", true))
        storyData.add(StoryItemModel(R.drawable.insta_story_image3, "rock_sinwoo", true))
        storyData.add(StoryItemModel(R.drawable.insta_story_image4, "lee_nosense", false))
        storyData.add(StoryItemModel(R.drawable.insta_story_image5, "rock_junsung", false))
        storyData.add(StoryItemModel(R.drawable.insta_story_image6, "sin_gravity", false))
        storyData.add(StoryItemModel(R.drawable.insta_story_image7, "room_jigang", false))
        storyData.add(StoryItemModel(R.drawable.insta_story_image9, "rimmingjoy", false))

    }

    fun setFeedData() {
        feedData.add(
            MainFeedItemModel(
                R.drawable.hoe_bbang,
                R.drawable.insta_story_image4,
                "2blux",
                false,
                "rockJunsung",
                "333,33",
                "Good Morning",
                "151,523",
                (R.drawable.insta_story_image4),
                mutableListOf(
                    R.drawable.insta_story_image6,
                    R.drawable.insta_story_image10,
                    R.drawable.insta_story_image3,
                    R.drawable.hoe_bbang,
                    R.drawable.heart_icon
                )
            )
        )


        feedData.add(
            MainFeedItemModel(
                R.drawable.main_feed_proflie_1,
                R.drawable.insta_story_image4,
                "jiji99",
                false,
                "rockJunsung",
                "333,33",
                "Good Morning",
                "151,523",
                (R.drawable.insta_story_image4),
                mutableListOf(
                    R.drawable.insta_story_image2,
                    R.drawable.insta_story_image9,
                    R.drawable.insta_story_image6,
                    R.drawable.hoe_bbang,
                    R.drawable.insta_story_image10
                )
            )
        )


        feedData.add(
            MainFeedItemModel(
                R.drawable.main_feed_proflie_2,
                R.drawable.insta_story_image4,
                "door123",
                false,
                "rockJunsung",
                "333,33",
                "Good Morning",
                "151,523",
                (R.drawable.insta_story_image4),
                mutableListOf(
                    R.drawable.insta_story_image3,
                    R.drawable.insta_story_image7,
                    R.drawable.insta_story_image4,
                    R.drawable.hoe_bbang,
                    R.drawable.insta_story_image10
                )
            )
        )

        feedData.add(
            MainFeedItemModel(
                R.drawable.main_feed_proflie_3,
                R.drawable.insta_story_image4,
                "kmj99",
                false,
                "dhdh00",
                "151,15",
                "Hell Morning",
                "644,78",
                (R.drawable.insta_story_image4),
                mutableListOf(
                    R.drawable.insta_story_image1,
                    R.drawable.insta_story_image5,
                    R.drawable.insta_story_image8,
                    R.drawable.hoe_bbang,
                    R.drawable.insta_story_image7
                )
            )
        )

        feedData.add(
            MainFeedItemModel(
                R.drawable.main_feed_proflie_4,
                R.drawable.insta_story_image4,
                "domain55",
                false,
                "rockJunsung",
                "333,33",
                "Good Morning",
                "151,523",
                (R.drawable.insta_story_image4),
                mutableListOf(
                    R.drawable.insta_story_image2,
                    R.drawable.insta_story_image3,
                    R.drawable.insta_story_image4,
                    R.drawable.hoe_bbang,
                    R.drawable.insta_story_image6
                )
            )
        )
        feedData.add(
            MainFeedItemModel(
                R.drawable.main_feed_proflie_5,
                R.drawable.insta_story_image4,
                "subway111",
                false,
                "rockJunsung",
                "333,33",
                "Good Morning",
                "151,523",
                (R.drawable.insta_story_image4),
                mutableListOf(
                    R.drawable.insta_story_image2,
                    R.drawable.insta_story_image10,
                    R.drawable.insta_story_image5,
                    R.drawable.hoe_bbang,
                    R.drawable.insta_story_image8
                )
            )
        )
        feedData.add(
            MainFeedItemModel(
                R.drawable.main_feed_proflie_6,
                R.drawable.insta_story_image4,
                "hell890",
                false,
                "rockJunsung",
                "333,33",
                "Good Morning",
                "151,523",
                (R.drawable.insta_story_image4),
                mutableListOf(
                    R.drawable.insta_story_image3,
                    R.drawable.insta_story_image2,
                    R.drawable.insta_story_image1,
                    R.drawable.hoe_bbang,
                    R.drawable.insta_story_image4
                )
            )
        )
    }
}