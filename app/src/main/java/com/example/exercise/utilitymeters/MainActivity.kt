package com.example.exercise.utilitymeters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

lateinit var gasButton: Button
lateinit var energyButton: Button
lateinit var coldWaterButton: Button
lateinit var hotWaterButton: Button
val gasValue = "81"
val energyValue = "8430"
val coldWaterValue = "265"
val hotWaterValue = "241"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gasButton = findViewById(R.id.gas)
        energyButton = findViewById(R.id.enregy)
        coldWaterButton = findViewById(R.id.cold_water)
        hotWaterButton = findViewById(R.id.hot_water_button)
        val toValueMeterList : TextView = findViewById(R.id.meter_list_text_view3)

        gasButton.setOnClickListener{
            val setActivityIntent = Intent(this, ChangedMeter::class.java)
            setActivityIntent.putExtra(RES_NAME, "Газ")
            setActivityIntent.putExtra(LAST_VALUE, gasValue)
            startActivity(setActivityIntent)
        }

        energyButton.setOnClickListener{
            val setActivityIntent = Intent(this, ChangedMeter::class.java)
            setActivityIntent.putExtra(RES_NAME, "Электричество")
            setActivityIntent.putExtra(LAST_VALUE, energyValue)
            startActivity(setActivityIntent)
        }

        coldWaterButton.setOnClickListener{
            val setActivityIntent = Intent(this, ChangedMeter::class.java)
            setActivityIntent.putExtra(RES_NAME, "Холодная вода")
            setActivityIntent.putExtra(LAST_VALUE, coldWaterValue)
            startActivity(setActivityIntent)
        }

        hotWaterButton.setOnClickListener{
            val setActivityIntent = Intent(this, ChangedMeter::class.java)
            setActivityIntent.putExtra(RES_NAME, "Горячая вода")
            setActivityIntent.putExtra(LAST_VALUE, hotWaterValue)
            startActivity(setActivityIntent)
        }

        toValueMeterList.setOnClickListener {
            val setActivityIntent = Intent(this, ThirdActivity::class.java)
            setActivityIntent.putExtra(GAS, gasValue)
            setActivityIntent.putExtra(ENERGY, energyValue)
            setActivityIntent.putExtra(COLD_WATER, coldWaterValue)
            setActivityIntent.putExtra(HOT_WATER, hotWaterValue)
            startActivity(setActivityIntent)
        }
    }
}