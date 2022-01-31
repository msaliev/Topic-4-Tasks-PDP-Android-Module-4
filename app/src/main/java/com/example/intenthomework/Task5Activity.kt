package com.example.intenthomework

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.intenthomework.model.Human
import com.example.intenthomework.model.Member
import com.example.intenthomework.model.User
import org.w3c.dom.Text

class Task5Activity : AppCompatActivity() {
    lateinit var tvHome: TextView
    companion object {
        const val START_ACTIVITY_3_REQUEST_CODE = 0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task5)
        tvHome = findViewById(R.id.tvTask5SecondPage)

        initViews()
    }

    private fun initViews() {
        val btnDetail = findViewById<Button>(R.id.btnTask5SecondPage)
        btnDetail.setOnClickListener {
            val user = User("22", "Mukhammadyusuf")
            openDetailActivity(user)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == START_ACTIVITY_3_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                val human = data!!.getParcelableExtra<Human>("human")
                tvHome.text = human.toString()
            }
        }
    }

    private fun openDetailActivity(user: User) {
        val intent = Intent(this, Task5SecondActivity::class.java)
        intent.putExtra("user", user)
        startActivityForResult(intent, START_ACTIVITY_3_REQUEST_CODE)
    }


}