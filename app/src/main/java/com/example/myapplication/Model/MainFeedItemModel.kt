package com.example.myapplication.Model

class MainFeedItemModel(
    val profileImage: Int,
    val likeProfileImage : Int,
    val nickName: String,
    var isLike: Boolean,
    val likeNickName: String,
    val likeCnt: String,
    val contentText: String,
    val commentCnt: String,
    val userProfileImage: Int,
    val imageList: MutableList<Int>
)