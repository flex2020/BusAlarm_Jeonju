package com.example.busalarm_jeonju

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.busalarm_jeonju.databinding.FragmentHomeBinding
import com.example.busalarm_jeonju.databinding.RecyclerviewItemBinding

class MyAdapter(val dataList: ArrayList<ItemData>): RecyclerView.Adapter<MyAdapter.Holder>(){
    inner class Holder(val binding: RecyclerviewItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ItemData) {
            binding.tvItem1.text = item.id
            binding.tvItem2.text = item.start
            binding.tvItem3.text = item.end
            binding.tvItem4.text = item.dest
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


}