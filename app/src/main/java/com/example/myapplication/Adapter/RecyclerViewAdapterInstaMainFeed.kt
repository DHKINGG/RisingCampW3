package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.Model.MainFeedItemModel
import com.example.myapplication.R
import com.example.myapplication.databinding.InstaMainfeedBinding
import com.google.android.material.tabs.TabLayoutMediator


class RecyclerViewAdapterInstaMainFeed :
    RecyclerView.Adapter<RecyclerViewAdapterInstaMainFeed.Holder>() {
    var list = mutableListOf<MainFeedItemModel>()

    inner class Holder(val binding: InstaMainfeedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MainFeedItemModel, position: Int) {
            binding.ivMainFeedProfile.setImageResource(item.profileImage)
            binding.tvMainFeedNickname.text = item.nickName
            binding.ivMainFeedSubProfile.setImageResource(item.profileImage)
            binding.tvMainFeedLikeCount.text = "${item.nickName}님 외 ${item.likeCnt}명이 좋아합니다"
            binding.tvMainFeedSubNickname.text = item.nickName
            binding.tvMainFeedContent.text = item.contentText
            binding.ivMainFeedUserPrfile.setImageResource(item.userProfileImage)
            binding.tvMainFeedCommentCount.text = "댓글 ${item.commentCnt}개 모두 보기"

            var viewPagerAdapter = ViewPagerAdapter()
            viewPagerAdapter.list = item.imageList
            binding.vpMainFeed.orientation = ViewPager2.ORIENTATION_HORIZONTAL
            binding.vpMainFeed.adapter= viewPagerAdapter

            TabLayoutMediator(binding.tlIndicator, binding.vpMainFeed) { tab, position -> }.attach()
        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        return Holder(
            InstaMainfeedBinding.inflate(
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



