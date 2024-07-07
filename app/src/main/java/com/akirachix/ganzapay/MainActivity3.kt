package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.ganzapay.databinding.ActivityMain3Binding
import com.akirachix.ganzapay.databinding.ActivityMain4Binding

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