package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import com.example.myapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)

        }
        Picasso
            .get()
            .load("https://plus.unsplash.com/premium_photo-1687880581816-63655cf5cd27?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8YmlyZHxlbnwwfHwwfHx8MA%3D%3D")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView)
    }
}
