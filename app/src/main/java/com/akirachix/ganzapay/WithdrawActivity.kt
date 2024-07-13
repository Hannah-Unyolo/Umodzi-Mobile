package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.ganzapay.databinding.ActivityMain11Binding

class MainActivity11 : AppCompatActivity() {
    lateinit var binding: ActivityMain11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivMenu.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }

        binding.imageView33.setOnClickListener {
            val num1 = binding.etNum4.text.toString()
            val num2 = binding.etNum5.text.toString()
            var inputError = false
            if (num1.isBlank()) {
                inputError = true
                binding.etNum4.error = "Num  is required"
            }

            if (num2.isBlank()) {
                inputError = true
                binding.etNum5.error = "Num  is required"
            } else {

                val intent = Intent(this, MainActivity9::class.java)
                startActivity(intent)
            }

        }
    }

    fun validate(){
        val num1 = binding.etNum4.text.toString()
        val num2 = binding.etNum5.text.toString()
        var inputError = false
        if(num1.isBlank()){
            inputError= true
            binding.etNum4.error = "Num  is required"
        }

        if(num2.isBlank()){
            inputError= true
            binding.etNum5.error = "Num  is required"
        }

        else {

            val intent = Intent(this,MainActivity9::class.java)
            startActivity(intent)
        }

    }
    fun clearErrors(){
        binding.etNum4.error = null
        binding.etNum5.error = null
    }
}