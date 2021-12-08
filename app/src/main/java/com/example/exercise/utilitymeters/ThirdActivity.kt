package com.example.exercise.utilitymeters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val toFirstAct : ImageView = findViewById(R.id.pictureThirdActivity)

        toFirstAct.setOnClickListener {
            val backToFirstActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(backToFirstActivityIntent)
        }


    }
}