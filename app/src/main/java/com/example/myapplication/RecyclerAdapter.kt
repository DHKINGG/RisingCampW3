package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.RecyclerItemViewBinding

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.Holder>() {
    var list = mutableListOf<ItemModel>()

    inner class Holder(val binding: RecyclerItemViewBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ItemModel, position: Int) {
            // itemView에 어떻게 바인딩 할건지 여기서 정의
            binding.itemText.text = item.itemText
            binding.itemSwitch.setOnCheckedChangeListener(null)
            binding.itemSwitch.isChecked = item.isSelect

            binding.itemSwitch.setOnCheckedChangeListener { _, isChecked ->
                list[position].isSelect = isChecked
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        return Holder(RecyclerItemViewBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun getListFromView(mList: MutableList<ItemModel>) {
        list = mList
    }
}