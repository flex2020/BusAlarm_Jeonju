// SearchFragment

package com.example.busalarm_jeonju

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.busalarm_jeonju.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    lateinit var mContext: Context
    lateinit var binding: FragmentSearchBinding
    lateinit var myAdapter: SearchAdapter
    lateinit var dataList: ArrayList<ItemData> // dataList: 검색결과
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        dataList = ArrayList()
        setRecyclerView()

        binding.btnSearching.setOnClickListener(View.OnClickListener {
            dataList.add(ItemData("970", "송천동종점", "전북도립미술관", "", "15"))
            setRecyclerView()
        })

        return binding.root
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context as MainActivity
    }
    fun setRecyclerView() {
        myAdapter = SearchAdapter(dataList, mContext)
        binding.searchRecyclerView.adapter = myAdapter

        val lm = LinearLayoutManager(this.context)
        binding.searchRecyclerView.layoutManager = lm
        binding.searchRecyclerView.setHasFixedSize(true)
    }
}