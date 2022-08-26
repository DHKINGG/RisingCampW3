package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
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
            binding.tvMainFeedLikeCount.text = "${item.likeNickName}님 외 ${item.likeCnt}명이 좋아합니다"
            binding.tvMainFeedSubNickname.text = item.nickName
            binding.tvMainFeedContent.text = item.contentText
            binding.ivMainFeedUserPrfile.setImageResource(item.userProfileImage)
            binding.tvMainFeedCommentCount.text = "댓글 ${item.commentCnt}개 모두 보기"
            binding.ivMainFeedLike.setImageResource(if (item.isLike) R.drawable.main_feed_like_icon else R.drawable.main_feed_unlike_icon)

            var viewPagerAdapter = ViewPagerAdapter()
            viewPagerAdapter.list = item.imageList
            binding.vpMainFeed.orientation = ViewPager2.ORIENTATION_HORIZONTAL
            binding.vpMainFeed.adapter= viewPagerAdapter

            TabLayoutMediator(binding.tlIndicator, binding.vpMainFeed) { tab, position -> }.attach()

            binding.ivMainFeedLike.setOnClickListener {
                if(item.isLike) {
                    list[position].isLike = false
                    binding.ivMainFeedLike.setImageResource(R.drawable.main_feed_unlike_icon)
                } else {
                    list[position].isLike = true
                    binding.ivMainFeedLike.setImageResource(R.drawable.main_feed_like_icon)
                }
            }

            binding.ivMainFeedMore.setOnClickListener {
                list.removeAt(position)
                // 리사이클러뷰를 바뀐 리스트로 업데이트시켜줌
                notifyItemRemoved(position)
                notifyItemRangeChanged(position,list.size)
            }
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



