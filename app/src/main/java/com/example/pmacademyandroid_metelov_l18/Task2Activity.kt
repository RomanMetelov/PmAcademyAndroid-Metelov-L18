package com.example.pmacademyandroid_metelov_l18

import android.graphics.*
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.drawToBitmap
import com.bumptech.glide.Glide
import com.example.pmacademyandroid_metelov_l18.databinding.ActivityTask2Binding
import java.io.ByteArrayOutputStream


class Task2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTask2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupImage()
        setupOnClickListeners()
    }

    private fun setupBinding() {
        binding = ActivityTask2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupImage() {
        Glide.with(this)
            .load("https://images.ctfassets.net/ip74mqmfgvqf/4TBnKGAY1i4guUwyQewusy/e1b86c06f513cfec9162929030dcb410/FRANK_drug_image_alcohol.jpg?fm=jpg&q=70")
            .circleCrop()
            .into(binding.imgvTheAlcoPicture)
    }

    private fun setupOnClickListeners() {
        binding.btnUseBitmap.setOnClickListener {
            draw()
            getBytesArray()
        }
    }

    private fun draw() {
        val bitmap = binding.imgvTheAlcoPicture.drawToBitmap()
        val canvas = Canvas(bitmap)
        val paint = Paint().apply {
            strokeWidth = 75f
            color = Color.RED
        }

        canvas.drawLine(140f, 140f, 810f, 810f, paint)
        binding.imgvTheAlcoPicture.setImageBitmap(bitmap)
    }

    private fun getBytesArray() {
        val bitmap = binding.imgvTheAlcoPicture.drawToBitmap()

        val stream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
        val byteArray = stream.toByteArray()
        bitmap.recycle()

        Log.d("LOREMIPSUMAMENO", byteArray.toString())
    }
}