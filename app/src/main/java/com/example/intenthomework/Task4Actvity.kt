package com.example.intenthomework

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.intenthomework.model.Member

class Task4Actvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task4)
        initViews()
    }

    private fun initViews(){
        val tvTask4SecondPage = findViewById<TextView>(R.id.tvTask4SecondPage)
        val btnTask4SecondPage = findViewById<Button>(R.id.btnTask4SecondPage)

        val detailLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ){ result ->
            if(result.resultCode == Activity.RESULT_OK){
                val data: Intent? = result.data
                val text = data!!.getSerializableExtra("result")
                tvTask4SecondPage.text = text.toString()
            }

        }




        btnTask4SecondPage.setOnClickListener {
            val intent = Intent(this, Task4SecondActivity::class.java)
            val member = Member("22", "Mukhammadyusuf")
            intent.putExtra("member", member)
            detailLauncher.launch(intent)
        }
    }
}