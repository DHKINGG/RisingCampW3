package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.ItemModel
import com.example.myapplication.databinding.RecyclerItemViewBinding

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.Holder>() {
    var list = mutableListOf<ItemModel>()

    inner class Holder(val binding: RecyclerItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ItemModel, position: Int) { //해당 바인드를 통해 필요한 메모리들을 결합해 보여줌 <list view와 의차이점> 최소한의 리스트들만 보여지게
            // itemView에 어떻게 바인딩 할건지 여기서 정의
            binding.itemText.text = item.itemText
            binding.itemSwitch.setOnCheckedChangeListener(null)
            binding.itemSwitch.isChecked = item.isSelect

            binding.itemSwitch.setOnCheckedChangeListener { _, isChecked ->
                list[position].isSelect = isChecked
            }
        }
    }

    // 밑에 세함수는 Adapter 클래스가 생성이되면 저절로 호출

    // 뷰홀더를 생성하는 함수
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        return Holder(
            RecyclerItemViewBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            )
        )
    }

    // 생성된 뷰홀더에 데이터를 바인딩해주는 함수
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list[position], position)
    }

    // recyclerView의 아이템 개수
    override fun getItemCount(): Int {
        return list.size
    }

    fun getListFromView(mList: MutableList<ItemModel>) {
        list = mList
    }
}