package com.example.cosmiccandi.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter: Int = 0
        val tvCounterText = findViewById<TextView>(R.id.textView)
        val btnIncrement = findViewById<Button>(R.id.btn_incrementPeopleCounter)
        btnIncrement.setOnClickListener {
            if ((counter + 1) <= 7) {
                counter += 1
                tvCounterText.text = "${counter}"
                Toast.makeText(
                    this,
                    "Successfully incremented the passenger count to ${counter}!",
                    Toast.LENGTH_SHORT).show()
            } else {
                tvCounterText.setTextColor(Color.parseColor("#FF0000"))
                Toast.makeText(
                    this,
                    "7 passengers is the maximum for a Cirrus Vision Jet!",
                    Toast.LENGTH_LONG).show()
            }
        }
    }

}