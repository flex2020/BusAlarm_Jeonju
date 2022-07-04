package com.example.busalarm_jeonju

import android.content.Context
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.busalarm_jeonju.databinding.SearchrecylcerviewItemBinding

class SearchAdapter (val dataList: ArrayList<ItemData>, val context: Context): RecyclerView.Adapter<SearchAdapter.Holder>(){
    inner class Holder(val binding: SearchrecylcerviewItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ItemData) {
            if(!item.id.equals("")) {
                binding.tvItem5.text = item.id + "번"
                binding.tvItem6.text = item.start
                binding.tvItem7.text = item.end
                binding.tvItem8.text = "약 " + item.time + "분"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = SearchrecylcerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


}