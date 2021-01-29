package com.example.pmacademyandroid_metelov_l18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.pmacademyandroid_metelov_l18.databinding.ActivityTask3Binding
import java.lang.System.load

class Task3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTask3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupOnClickListeners()
    }

    private fun setupBinding() {
        binding = ActivityTask3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupOnClickListeners() {
        binding.btnShowPicture.setOnClickListener {
            loadImage()
        }
    }

    private fun loadImage() {
        Glide.with(this)
            .load("https://i3.infocar.ua/img/bazar2/386/385445/2381171_3.jpg")
            .circleCrop()
            .transition(DrawableTransitionOptions.withCrossFade(3000))
            .into(binding.imgvThePicture)
    }
}