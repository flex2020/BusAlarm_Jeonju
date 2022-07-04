// HomeFragment

package com.example.busalarm_jeonju

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.busalarm_jeonju.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var mContext: Context
    lateinit var binding: FragmentHomeBinding
    lateinit var myAdapter: HomeAdapter
    lateinit var dataList: ArrayList<ItemData> // dataList: 즐겨찾기
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        dataList = ArrayList()
        setRecyclerView()
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context as MainActivity
    }
    fun setRecyclerView() {
        myAdapter = HomeAdapter(dataList, mContext)
        binding.homeRecyclerView.adapter = myAdapter

        val lm = LinearLayoutManager(this.context)
        binding.homeRecyclerView.layoutManager = lm
        binding.homeRecyclerView.setHasFixedSize(true)
    }
}