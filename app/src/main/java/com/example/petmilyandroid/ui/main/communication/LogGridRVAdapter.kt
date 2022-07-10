package com.example.petmilyandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.petmilyandroid.databinding.ItemLogGridBinding

class LogGridRVAdapter(private var list: ArrayList<String>): RecyclerView.Adapter<LogGridRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): LogGridRVAdapter.ViewHolder { //ViewHolder를 만들 때 나오는 함수
        val binding: ItemLogGridBinding = ItemLogGridBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LogGridRVAdapter.ViewHolder, position: Int) { // 데이터 바인딩 작업할 때마다 불러오는 함수
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
    //리사이클러 뷰의 마지막이 언제인지

    inner class ViewHolder(val binding: ItemLogGridBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(name: String){
            binding.itemProfileNameTv.text = name
        }
    }
}