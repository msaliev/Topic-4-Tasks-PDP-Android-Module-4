package com.example.intenthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.intenthomework.model.Human
import com.example.intenthomework.model.User

class Task5SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task5_second)
        initViews()
    }

    fun initViews() {
        val tv_detail = findViewById<TextView>(R.id.tvTask5FirstPage)
        val btn_back = findViewById<Button>(R.id.btnTask5FirstPage)

        btn_back.setOnClickListener {
            backToFinish(human)
        }

        val user = intent.getParcelableExtra<User>("user")

        tv_detail.setText(user.toString())

    }
    val human = Human("22", "Mukhammadyusuf")

    override fun onBackPressed() {
        super.onBackPressed()
        backToFinish(human)
    }

    fun backToFinish(human: Human) {
        val returnIntent = Intent()
        returnIntent.putExtra("human", human)
        setResult(RESULT_OK, returnIntent)
        finish()
    }
}