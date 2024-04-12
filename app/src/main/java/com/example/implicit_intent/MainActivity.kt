package com.example.implicit_intent

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardbutton=findViewById<CardView>(R.id.cardbutton)
        cardbutton.setOnClickListener{

            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.cricbuzz.com/")
            startActivity(intent)
        }
    }
}