package com.example.shareasmile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn()
        click()

    }
    fun btn(){
        btn=findViewById(R.id.btn)

    }
    fun click(){
        btn.setOnClickListener {
            val Explore=Intent(baseContext,LoginActivity::class.java)
            startActivity(Explore)
        }
    }

}