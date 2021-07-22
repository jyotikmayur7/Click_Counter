package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter : Int = 0
        val clickCount: TextView = findViewById(R.id.click_count)
        val showClickCount: Button = findViewById(R.id.show_click_count)

        showClickCount.setOnClickListener{
            clickCount.setText("Button Clicked ${++counter} times")
        }
    }
}