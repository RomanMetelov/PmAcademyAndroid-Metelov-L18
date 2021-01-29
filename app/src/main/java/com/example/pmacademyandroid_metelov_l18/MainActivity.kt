package com.example.pmacademyandroid_metelov_l18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmacademyandroid_metelov_l18.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupOnClickListeners()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupOnClickListeners() {
        binding.btnTask1.setOnClickListener {
            val intent = Intent(this, Task1Activity::class.java)
            startActivity(intent)
        }

        binding.btnTask2.setOnClickListener {
            val intent = Intent(this, Task2Activity::class.java)
            startActivity(intent)
        }

        binding.btnTask3.setOnClickListener {
            val intent = Intent(this, Task3Activity::class.java)
            startActivity(intent)
        }
    }
}