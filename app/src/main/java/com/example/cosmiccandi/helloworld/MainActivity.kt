package com.example.cosmiccandi.helloworld

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter: Int = 0
        val tvCounterText = findViewById<TextView>(R.id.textView)
        tvCounterText.setTextColor(Color.CYAN)
        val btnIncrement = findViewById<Button>(R.id.btn_incrementPeopleCounter)
        val btnClear = findViewById<Button>(R.id.btn_clearPassengerCount)

        btnIncrement.setOnClickListener {
            if ((counter + 1) <= 7) {
                tvCounterText.text = "${++counter}"
                Toast.makeText(
                    this,
                    "Successfully incremented the passenger count to ${counter}!",
                    Toast.LENGTH_SHORT).show()
            } else {
                tvCounterText.setTextColor(Color.RED)
                Toast.makeText(
                    this,
                    "7 passengers is the maximum for a Cirrus Vision Jet!",
                    Toast.LENGTH_LONG).show()
            }
        }

        btnClear.setOnClickListener {
            counter = 0
            tvCounterText.setTextColor(Color.CYAN)
            tvCounterText.text = "$counter"
            Toast.makeText(
                this,
                "Passenger counter successfully reset",
                Toast.LENGTH_LONG).show()
        }
    }

}