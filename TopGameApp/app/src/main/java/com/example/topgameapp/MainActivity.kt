
package com.example.topgameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //adapter View
        val recyclerView:RecyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this,
        LinearLayoutManager.VERTICAL,false)

        //2 data Source
        var gamesList:ArrayList<topGameModel> = ArrayList()
        val g1 = topGameModel("Horizon",R.drawable.game1)
        val g2 = topGameModel("Prison Breal",R.drawable.game2)
        val g3 = topGameModel("Pubg",R.drawable.game3)
        val g4 = topGameModel("BgMI",R.drawable.game4)
        val g5 = topGameModel("WWE",R.drawable.game5)
        val g6 = topGameModel("Halo",R.drawable.game6)
        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)
        //Adapter:
        val adapter=MyAdapter(gamesList)
        recyclerView.adapter=adapter
    }
}