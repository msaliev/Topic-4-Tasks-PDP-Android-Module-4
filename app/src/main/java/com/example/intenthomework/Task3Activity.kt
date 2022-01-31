package com.example.intenthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.intenthomework.model.User

class Task3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)
        initViews()
    }

    private fun initViews() {
        val tvTask3 = findViewById<TextView>(R.id.tvTask3)

        val user = intent.getParcelableExtra<User>("user")

        tvTask3.text = user.toString()
    }
}