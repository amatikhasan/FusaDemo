package com.softsense.fusademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softsense.fusademo.databinding.ActivityUnfallBinding

class UnfallActivity : AppCompatActivity() {
    lateinit var binding: ActivityUnfallBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unfall)
    }
}