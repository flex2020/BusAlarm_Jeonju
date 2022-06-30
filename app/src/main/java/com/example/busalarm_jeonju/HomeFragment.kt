package com.example.busalarm_jeonju

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.busalarm_jeonju.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    lateinit var myAdapter: MyAdapter
    lateinit var dataList: ArrayList<ItemData>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        dataList = ArrayList()
        for(i: Int in 1..20) {
            var item: ItemData = ItemData("1", "2", "3", "4")
            dataList.add(item)
        }
        setRecyclerView()
        return binding.root
    }

    fun setRecyclerView() {
        myAdapter = MyAdapter(dataList)
        binding.homeRecyclerView.adapter = myAdapter

        val lm = LinearLayoutManager(this.context)
        binding.homeRecyclerView.layoutManager = lm
        binding.homeRecyclerView.setHasFixedSize(true)
    }
}