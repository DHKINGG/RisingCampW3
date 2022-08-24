package com.example.myapplication.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ConcatAdapter
import com.example.myapplication.Model.MainFeedItemModel
import com.example.myapplication.Model.StoryItemModel
import com.example.myapplication.R
import com.example.myapplication.RecyclerViewAdapterInstaMainFeed
import com.example.myapplication.RecyclerViewAdapterInstaStory
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment() : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun initView() {
    val recyclerViewAdapterInstaMainFeed : RecyclerViewAdapterInstaMainFeed = RecyclerViewAdapterInstaMainFeed().apply {
        list.add(MainFeedItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))
        list.add(MainFeedItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))
        list.add(MainFeedItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))
        list.add(MainFeedItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))
        list.add(MainFeedItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))



    }
        val recyclerViewAdapterInstaStory : RecyclerViewAdapterInstaStory = RecyclerViewAdapterInstaStory().apply {
            list.add(StoryItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))
            list.add(StoryItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))
            list.add(StoryItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))
            list.add(StoryItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))
            list.add(StoryItemModel(itemImage = R.drawable.feed_main , nickName = "dd" , text = "ddd"))



        }


        val concatAdapter = ConcatAdapter(recyclerViewAdapterInstaStory,recyclerViewAdapterInstaMainFeed)

        binding.rvMain.adapter = concatAdapter
    }



}

