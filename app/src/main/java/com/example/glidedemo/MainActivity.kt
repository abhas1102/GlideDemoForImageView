package com.example.glidedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class MainActivity : AppCompatActivity() {

    private val image =
        "https://pixabay.com/get/gab03201e6a7d4f8967caab9517af7b5705ac8e079d9bb8a305e817aafd162ae88e7a3f9c3b82b2fdf5f76e8bbcdb7b7a_640.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
    }
}