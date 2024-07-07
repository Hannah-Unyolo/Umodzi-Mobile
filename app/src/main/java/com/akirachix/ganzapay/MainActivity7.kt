package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.ganzapay.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    lateinit var binding: ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ivMenu.setOnClickListener {
            val intent =Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }
        binding.imageView29.setOnClickListener {
            val intent =Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }


    }
}