package com.example.task1_playmarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task1_playmarket.R
import com.example.task1_playmarket.models.Program
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_in_play_market.view.*

class InPlayMarket(var applist: List<Program>):RecyclerView.Adapter<InPlayMarket.Vh>() {
    inner class Vh(itemView:View):RecyclerView.ViewHolder(itemView){
      fun onBind(program: Program){
          Picasso.get().load(program.imgUrl).into(itemView.img)
          itemView.app_name.text = program.appName
          itemView.skach.text = program.skachat
      }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_in_play_market,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
          holder.onBind(applist[position])
    }

    override fun getItemCount(): Int {
        return applist.size
    }
}