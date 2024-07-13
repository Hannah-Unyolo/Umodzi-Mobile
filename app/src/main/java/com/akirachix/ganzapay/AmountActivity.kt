package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.ganzapay.databinding.ActivityMain8Binding

class MainActivity8 : AppCompatActivity() {
    lateinit var binding: ActivityMain8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivMenu.setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }

        binding.imageView33.setOnClickListener {
            val num1 = binding.etNum2.text.toString()
            var inputError = false
            if(num1.isBlank()){
                binding.etNum2.error = "Num is required"
                inputError= true
            }
            else {
                val intent =Intent(this,MainActivity9::class.java)
                startActivity(intent)
            }

        }
//        validate()
//        clearErrors()

    }

    fun validate(){
        val num1 = binding.etNum2.text.toString()
        var inputError = false
        if(num1.isBlank()){
            inputError= true
            binding.etNum2.error = "Num is required"
        }
        else {
            val intent =Intent(this,MainActivity9::class.java)
            startActivity(intent)
        }
    }

    fun clearErrors(){
        binding.etNum2.error = null
    }

}