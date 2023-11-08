package com.softsense.fusademo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.GridLayout
import com.softsense.fusademo.databinding.ActivityMainBinding
import com.softsense.fusademo.databinding.ActivityVehicleBinding
import kotlin.random.Random

class VehicleActivity : AppCompatActivity() {
    lateinit var binding: ActivityVehicleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVehicleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val gridLayout = binding.gridLayoutVehicle.apply {
            // Assuming we want 3 rows of buttons
            rowCount = 6
            columnCount = 4 // 4 columns as specified
        }

        val numColumns = 4
        val numRows = 6 // Set the number of rows you want
        val colors = listOf(
            0xFF008000.toInt(), // Green
            0xFFFF0000.toInt(), // Red
            0xFFFFA500.toInt(), // Orange


        )

        for (i in 0 until numColumns * numRows) {
            val random = Random.nextInt(1000, 2000)
            val button = Button(this).apply {
                text = (random).toString()
                setBackgroundColor(colors[Random.nextInt(colors.size)])
                layoutParams = GridLayout.LayoutParams().apply {
                    width = 230
                    height = 120
                    rowSpec = GridLayout.spec(i / numColumns)
                    columnSpec = GridLayout.spec(i % numColumns)
                    gravity = Gravity.CENTER
                    textSize = 16f
                    setMargins(10, 10, 10, 10)
                    setPadding(10, 5, 10, 5)
                }
            }
            button.setOnClickListener {
                startActivity(Intent(this, VehicleDetails::class.java))
            }
            gridLayout.addView(button)
        }
    }
}