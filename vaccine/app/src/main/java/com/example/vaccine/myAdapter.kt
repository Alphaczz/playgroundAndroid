package com.example.vaccine

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class myAdapter(val vaccineList:ArrayList<VaccineModel>)
    :RecyclerView.Adapter<myAdapter.MyViewHolder>()
{
    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
       lateinit var vaccineImg:ImageView
       lateinit var vaccineTitle:TextView
        init {
            vaccineImg=itemView.findViewById(R.id.imageview)
            vaccineTitle=itemView.findViewById(R.id.title)

            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,
                    "Lets take Vaccine ${vaccineList[adapterPosition].name
                    }",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v=LayoutInflater.from(parent.context)
            .inflate(R.layout.recycleritem_layout,parent,false)
                return  MyViewHolder(v)
    }

    override fun getItemCount(): Int {
 return vaccineList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    holder.vaccineTitle.setText(vaccineList[position].name)
        holder.vaccineImg.setImageResource(vaccineList[position].img)
    }


}