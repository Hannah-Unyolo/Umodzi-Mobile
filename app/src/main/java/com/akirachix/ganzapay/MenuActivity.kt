package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.ganzapay.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.ivSend.setOnClickListener {
            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }

        binding.ivBill.setOnClickListener {
            val intent = Intent(this,MainActivity10::class.java)
            startActivity(intent)
        }

        binding.ivBalance.setOnClickListener {
            val intent = Intent(this,MainActivity12::class.java)
            startActivity(intent)
        }

        binding.ivCustomer.setOnClickListener {
            val intent = Intent(this,MainActivity14::class.java)
            startActivity(intent)
        }

        binding.ivWithdraw.setOnClickListener {
            val intent = Intent(this,MainActivity11::class.java)
            startActivity(intent)
        }

    }
}