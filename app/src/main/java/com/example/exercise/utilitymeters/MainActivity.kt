package com.example.exercise.utilitymeters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

lateinit var gasButton: Button
lateinit var energyButton: Button
lateinit var coldWaterButton: Button
lateinit var hotWaterButton: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gasButton = findViewById(R.id.gas)
        energyButton = findViewById(R.id.enregy)
        coldWaterButton = findViewById(R.id.cold_water)
        hotWaterButton = findViewById(R.id.hot_water_button)

        gasButton.setOnClickListener{
            val setActivityIntent = Intent(this, ChangedMeter::class.java)
            setActivityIntent.putExtra(RES_NAME, "Газ")
            setActivityIntent.putExtra(LAST_VALUE, "81")
            startActivity(setActivityIntent)
        }

        energyButton.setOnClickListener{
            val setActivityIntent = Intent(this, ChangedMeter::class.java)
            setActivityIntent.putExtra(RES_NAME, "Электричество")
            setActivityIntent.putExtra(LAST_VALUE, "8430")
            startActivity(setActivityIntent)
        }

        coldWaterButton.setOnClickListener{
            val setActivityIntent = Intent(this, ChangedMeter::class.java)
            setActivityIntent.putExtra(RES_NAME, "Холодная вода")
            setActivityIntent.putExtra(LAST_VALUE, "265")
            startActivity(setActivityIntent)
        }

        hotWaterButton.setOnClickListener{
            val setActivityIntent = Intent(this, ChangedMeter::class.java)
            setActivityIntent.putExtra(RES_NAME, "Горячая вода")
            setActivityIntent.putExtra(LAST_VALUE, "241")
            startActivity(setActivityIntent)
        }
    }
}