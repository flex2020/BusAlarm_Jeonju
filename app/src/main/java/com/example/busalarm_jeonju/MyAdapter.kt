package com.example.busalarm_jeonju

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    //데이터들을 저장하는 변수
    private var data = mutableListOf<ItemData>()

    class MyViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding,root) {
        //View와 데이터를 연결시키는 함수
        fun bind(layoutData : LayoutData) {
            binding.tvGoods.text = layoutData.tv_goods
            ...
        }

        //상속받으면 자동 생성
        //ViewHolder에 쓰일 Layout을 inflate하는 함수
        //ViewGroup의 context를 사용하여 특정 화면에서 구현할 수 있도록 함
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeatureViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_product_review, parent, false)
            return MyViewHolder(binding)
        }

        //상속받으면 자동 생성
        override fun getItemCount(): Int = data.size

        //상속받으면 자동 생성
        //ViewHolder에서 데이터 묶는 함수가 실행되는 곳
        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.onBind(data[position])
        }

        fun replaceList(newList: MutableList<LayoutData>) {
            data = newList.toMutableList()
            //어댑터의 데이터가 변했다는 notify를 날린다
            notifyDataSetChanged()
        }
    }

}