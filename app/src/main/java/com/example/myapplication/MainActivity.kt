package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Model.ItemModel
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var data = mutableListOf<ItemModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setData()

        binding.rvMain.layoutManager = LinearLayoutManager(this)

        val adapter = RecyclerAdapter()
        adapter.getListFromView(data)

        binding.rvMain.adapter = adapter
    }


    fun setData() {
        data.add(ItemModel("이청원", false))
        data.add(ItemModel("김동휘", true))
        data.add(ItemModel("박준성", true))
        data.add(ItemModel("김민준", true))
        data.add(ItemModel("변호정", false))
        data.add(ItemModel("최재용", false))
        data.add(ItemModel("신중혁", false))
        data.add(ItemModel("정승연", true))
        data.add(ItemModel("김해웅", false))
        data.add(ItemModel("김해웅", false))
        data.add(ItemModel("룸지강", false))
        data.add(ItemModel("룸지강", false))
        data.add(ItemModel("룸지강", false))
        data.add(ItemModel("룸지강", false))
        data.add(ItemModel("룸지강", false))
        data.add(ItemModel("이청원", false))
        data.add(ItemModel("룸지강", false))
        data.add(ItemModel("이청원", false))
        data.add(ItemModel("이청원", false))
        data.add(ItemModel("룸지강", false))
        data.add(ItemModel("이청원", false))
        data.add(ItemModel("이청원", false))
        data.add(ItemModel("룸지강", false))
        data.add(ItemModel("이청원", false))

    }
}