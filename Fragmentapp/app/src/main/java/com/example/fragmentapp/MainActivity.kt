package com.example.fragmentapp

import android.app.Fragment
import android.app.FragmentTransaction
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fragmentapp.ui.theme.FragmentappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1:Button=findViewById(R.id.btn1)
        val btn2:Button=findViewById(R.id.btn2)

        btn1.setOnClickListener(){
            val fragment1: Fragment =Fragment1()
            val fragment2:Fragment= fragment2()

            val fraTrans: FragmentTransaction =
                fragmentManager.beginTransaction()

            fraTrans.replace(R.id.frame1,fragment1).commit()

        }
        btn2.setOnClickListener(){
            val fragment1: Fragment =Fragment1()
            val fragment2:Fragment= fragment2()

            val fraTrans: FragmentTransaction =
                fragmentManager.beginTransaction()

            fraTrans.replace(R.id.frame2,fragment2).commit()

        }
    }
}



