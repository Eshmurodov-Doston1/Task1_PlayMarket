package com.example.task1_playmarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task1_playmarket.R
import com.example.task1_playmarket.models.ClassIdList
import kotlinx.android.synthetic.main.item_play_market.view.*

class PlayMarketAdapter(var list: List<ClassIdList>):RecyclerView.Adapter<PlayMarketAdapter.Vh>() {
    inner class Vh(itemView:View):RecyclerView.ViewHolder(itemView){
        fun onBind(classIdList: ClassIdList){
            itemView.title_tv.text = classIdList.title
            var inPlayMarket = InPlayMarket(classIdList.appList!!)
            itemView.item_inside.adapter = inPlayMarket
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_play_market,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
       holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}