package com.example.petmilyandroid.ui.main.info

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.petmilyandroid.LogGridRVAdapter
import com.example.petmilyandroid.databinding.ItemInfoListBinding
import com.example.petmilyandroid.databinding.ItemLogGridBinding

class InfoListRVAdapter(private var list: ArrayList<String>): RecyclerView.Adapter<InfoListRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): InfoListRVAdapter.ViewHolder {
        val binding: ItemInfoListBinding = ItemInfoListBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: InfoListRVAdapter.ViewHolder, position: Int) { // 데이터 바인딩 작업할 때마다 불러오는 함수
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(val binding: ItemInfoListBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(name: String){
            binding.itemInfoListProfileNameTv.text = name
        }
    }
}