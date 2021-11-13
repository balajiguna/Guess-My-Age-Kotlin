package com.example.guessmyage


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  //To hide a Action Bar
        getSupportActionBar()?.hide()


        val Button = findViewById<Button>(R.id.button)
        val enter_age_year =findViewById<EditText>(R.id.enter_age_year)
        val Age_textview = findViewById<TextView>(R.id.Age_textview)




        Button.setOnClickListener()
        {


            val userDOB:String = enter_age_year.text.toString()
            val year:Int = Calendar.getInstance().get(Calendar.YEAR)
            val PresentAge = year - userDOB.toInt()
            Age_textview.setText("Your age is  "+ PresentAge)
        }

    }
}