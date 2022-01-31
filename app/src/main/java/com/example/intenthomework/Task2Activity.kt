package com.example.intenthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Task2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)
        initViews()
    }


    private fun initViews(){
        val person = findViewById<TextView>(R.id.tvAgeTask2)
        val member = intent.getSerializableExtra("user")

        person.text = member.toString()

    }
}