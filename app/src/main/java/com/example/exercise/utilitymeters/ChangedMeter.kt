package com.example.exercise.utilitymeters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

const val RES_NAME = "resourse_name"
const val LAST_VALUE = "last_value"
const val RES_PICTURE = "resourse_picture"

class ChangedMeter() : AppCompatActivity() {

    lateinit var resourseNameTextView: TextView
    lateinit var lastValueTextView: TextView
    lateinit var resoursePictureImageView: ImageView
    lateinit var sendValueButton: Button
    lateinit var inputCurrent : TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_changed_meter)

        resourseNameTextView = findViewById(R.id.resourse_name_text_view)
        lastValueTextView = findViewById(R.id.lastValueTextView)
        resoursePictureImageView = findViewById(R.id.resoursePictureImageView)
        sendValueButton = findViewById(R.id.send_value_button)
        inputCurrent = findViewById(R.id.textInputEditText)


        var currentValue: String

        resourseNameTextView.text = intent.extras?.getString(RES_NAME, "Nothing")
        lastValueTextView.text = intent.extras?.getString(LAST_VALUE, "Nothing")

        when (resourseNameTextView.text) {
            "Газ"->
                resoursePictureImageView.setImageResource(R.drawable._meter0)
            "Электричество" ->
                resoursePictureImageView.setImageResource(R.drawable.ic_launcher_foreground)
            "Холодная вода" ->
                resoursePictureImageView.setImageResource(R.drawable._meter0)
            "Горячая вода" ->
                resoursePictureImageView.setImageResource(R.drawable.ic_launcher_background)
        }

//        currentValue = inputCurrent.getText().toString()

        inputCurrent.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                //Perform Code
                    val toThiredActivityIntent = Intent(this, ThirdActivity::class.java)
                    startActivity(toThiredActivityIntent)
                 return@OnKeyListener true
            }
            false
        })

        sendValueButton.setOnClickListener {
            val toThiredActivityIntent = Intent(this, ThirdActivity::class.java)
            startActivity(toThiredActivityIntent)
        }





    }
}