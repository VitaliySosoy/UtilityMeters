package com.example.exercise.utilitymeters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

const val GAS = "GAS"
const val ENERGY = "ENERGY"
const val COLD_WATER = "COLD_WATER"
const val HOT_WATER = "HOT_WATER"

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val resourseName = intent.extras?.getString(RES_NAME, "Nothing")
        val currentValue = intent.extras?.getString(LAST_VALUE, "Nothing")

        val toFirstAct : Button = findViewById(R.id.to_first_button)
        val toSecondAct : Button = findViewById(R.id.to_second_button)

        toFirstAct.setOnClickListener {
            val backToFirstActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(backToFirstActivityIntent)
        }

        toSecondAct.setOnClickListener {
            val backToFirstActivityIntent = Intent(this, ChangedMeter::class.java)
            startActivity(backToFirstActivityIntent)
        }


    }
}