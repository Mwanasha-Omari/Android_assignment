package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import com.example.myapplication.databinding.ActivityFifthBirdBinding
import com.example.myapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, FifthBirdActivity::class.java)
            startActivity(intent)

        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/185262775/photo/rufous-hummingbird-male-white-background.webp?b=1&s=170667a&w=0&k=20&c=PUEg6K-lZPdzlnoIL0-QZdmHzUPW_h1H1QsFS_Us1us=")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView)
    }
}
