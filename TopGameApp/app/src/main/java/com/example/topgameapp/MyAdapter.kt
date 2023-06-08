package com.example.topgameapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(val gameList:ArrayList<topGameModel>)
    :RecyclerView.Adapter<MyAdapter.myViewHolder>()
{
    inner class myViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
      lateinit var gameImg:ImageView
      lateinit var gameTitle:TextView
      init {
          gameImg=itemView.findViewById(R.id.cardviewImg)
          gameTitle=itemView.findViewById(R.id.cardviewTXT)
          itemView.setOnClickListener(){
              Toast.makeText(itemView.context,"Message You Choose: ${
                  gameList[adapterPosition].txtCard
              }",Toast.LENGTH_SHORT).show()
          }
      }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var v=LayoutInflater.from(parent.context).inflate(
            R.layout.card_item_layout,parent,false
        )
        return myViewHolder(v)
    }

    override fun getItemCount(): Int {
        return  gameList.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.gameImg.setImageResource(gameList[position].img)
        holder.gameTitle.setText(gameList[position].txtCard)
    }
}