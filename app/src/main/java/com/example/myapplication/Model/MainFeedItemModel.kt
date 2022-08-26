package com.example.myapplication.Model

class MainFeedItemModel(
    val profileImage: Int,
    val nickName: String,
    val isLike: Boolean,
    val likeNickName: String,
    val likeCnt: String,
    val contentText: String,
    val commentCnt: String,
    val userProfileImage: Int,
    val imageList: MutableList<Int>
)