package com.softsense.fusademo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softsense.fusademo.databinding.ActivityVehicleDetailsBinding

class VehicleDetails : AppCompatActivity() {
    lateinit var binding: ActivityVehicleDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVehicleDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardViewUnfall.setOnClickListener {
            startActivity(Intent(this, UnfallActivity::class.java))
        }
    }
}