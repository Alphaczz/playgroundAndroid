package com.example.sharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
private lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText:EditText=findViewById(R.id.editText)
        textView=findViewById(R.id.textViewName)
        val btn:Button=findViewById(R.id.btn)
        displayName()
        btn.setOnClickListener {
        val entTxt:String=editText.toString()
            saveNameInSharedPref(entTxt)
        }



    }

    private fun saveNameInSharedPref(entTxt: String) {
         //saving the text into shared prefrences we have to create shared prefrences
        val sharedPre:SharedPreferences=getSharedPreferences("UserName", MODE_PRIVATE)
        //writing data to sharedpre
        val editor:SharedPreferences.Editor=sharedPre.edit()
        editor.putString("name1",entTxt)
        editor.commit()

    }
    //reading data from shrepre
    fun displayName()
    {
       val sharepre: SharedPreferences=getSharedPreferences("Username", MODE_PRIVATE)
        val s1:String?=sharepre.getString("name1","Hello")

        textView.setText(s1).toString()
    }
}