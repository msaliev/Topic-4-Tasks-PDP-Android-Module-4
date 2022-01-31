package com.example.intenthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.intenthomework.model.Person

class Task4SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task4_second)
        initViews()



    }

    fun backToFirstactivity() {
        val returnIntent = Intent()
        val person = Person("Muhammadyusuf", "22")
        returnIntent.putExtra("result", person)
        setResult(RESULT_OK, returnIntent)
        finish()
    }

    private fun initViews(){
        val tvTask4FirstPage = findViewById<TextView>(R.id.tvTask4FirstPage)
        val btnTask4FirstPage = findViewById<Button>(R.id.btnTask4FirstPage)


        btnTask4FirstPage.setOnClickListener {
            backToFirstactivity()
        }

        val member = intent.getSerializableExtra("member")
        tvTask4FirstPage.text = member.toString()
    }
}