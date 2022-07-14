package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickbtn = findViewById<Button>(R.id.button)
        val mytext = findViewById<TextView>(R.id.textView)
        var people = 0
        clickbtn.setOnClickListener {
            people += 1
            mytext.text = people.toString()
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        }
    }
}
