package com.example.myapplication.Fragment

import androidx.recyclerview.widget.ConcatAdapter
import com.example.myapplication.Adapter.RecyclerViewAdapterInstaMainFeed
import com.example.myapplication.Adapter.RecyclerViewAdapterInstaStory
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment() : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun initView() {
        val recyclerViewAdapterInstaMainFeed: RecyclerViewAdapterInstaMainFeed =
            RecyclerViewAdapterInstaMainFeed().apply {


            }
        val recyclerViewAdapterInstaStory: RecyclerViewAdapterInstaStory =
            RecyclerViewAdapterInstaStory().apply {

            }


        val concatAdapter =
            ConcatAdapter(recyclerViewAdapterInstaStory, recyclerViewAdapterInstaMainFeed)

        binding.rvMain.adapter = concatAdapter
    }


}

