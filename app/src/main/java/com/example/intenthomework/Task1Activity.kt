package com.example.intenthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Task1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)
        initViews()
    }

    private fun initViews(){
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvAge = findViewById<TextView>(R.id.tvAge)

        var name = intent.getStringExtra("name")
        var age = intent.getStringExtra("age")

        tvName.text = name
        tvAge.text = age
    }
}