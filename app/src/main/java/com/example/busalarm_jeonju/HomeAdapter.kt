package com.example.busalarm_jeonju

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.busalarm_jeonju.databinding.HomerecyclerviewItemBinding

class HomeAdapter(val dataList: ArrayList<ItemData>, val context: Context): RecyclerView.Adapter<HomeAdapter.Holder>(){
    inner class Holder(val binding: HomerecyclerviewItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ItemData) {
            binding.tvItem1.text = item.id + "번"
            binding.tvItem2.text = item.end
            binding.tvItem3.text = item.dest
            binding.tvItem4.text = "약 " + item.time + "분"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = HomerecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


}