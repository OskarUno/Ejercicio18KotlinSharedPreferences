package com.awakelab.oskar.ejercicio18kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.awakelab.oskar.ejercicio18kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}