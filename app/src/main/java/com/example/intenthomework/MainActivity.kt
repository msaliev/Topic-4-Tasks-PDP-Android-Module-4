package com.example.intenthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.FileIntegrityManager
import android.widget.Button
import com.example.intenthomework.model.Member
import com.example.intenthomework.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        val btnTask1 = findViewById<Button>(R.id.btnTask1)
        val btnTask2 = findViewById<Button>(R.id.btnTask2)
        val btnTask3 = findViewById<Button>(R.id.btnTask3)
        val btnTask4 = findViewById<Button>(R.id.btnTask4)
        val btnTask5 = findViewById<Button>(R.id.btnTask5)
        val btnTask6 = findViewById<Button>(R.id.btnTask6)


        btnTask1.setOnClickListener {
            val intent = Intent(this, Task1Activity::class.java)
            intent.putExtra("name", "Mukhammadyusuf")
            intent.putExtra("age", "22")
            startActivity(intent)
        }

        btnTask2.setOnClickListener {
            val intent = Intent(this, Task2Activity::class.java)
            val member = Member("22", "Mukhammadyusuf")
            intent.putExtra("user", member)
            startActivity(intent)
        }

        btnTask3.setOnClickListener {
            val intent = Intent(this, Task3Activity::class.java)
            val user = User("22", "Mukhammadyusuf")
            intent.putExtra("user", user)
            startActivity(intent)
        }

        btnTask4.setOnClickListener {
            val intent = Intent(this, Task4Actvity::class.java)
            startActivity(intent)
        }

        btnTask5.setOnClickListener {
            val intent = Intent(this, Task5Activity::class.java)
            startActivity(intent)
        }

        btnTask6.setOnClickListener {
            val intent = Intent(this, Task6Activity::class.java)
            startActivity(intent)
        }

    }





}