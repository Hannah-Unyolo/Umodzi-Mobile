package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.ganzapay.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.ivFingerp1.setOnClickListener {
            val intent =Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

        binding.ivNumbers.setOnClickListener {
            val intent =Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }

    }
}