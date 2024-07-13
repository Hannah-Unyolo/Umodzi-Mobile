package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.ganzapay.databinding.ActivityMain10Binding

class MainActivity10 : AppCompatActivity() {
    lateinit var binding: ActivityMain10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivMenu.setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }

        binding.imageView33.setOnClickListener {
            val num1 = binding.etNum3.text.toString()
            var inputError = false
            if(num1.isBlank()){
                binding.etNum3.error = "Num is required"
                inputError= true
            }
            else {
                val intent =Intent(this,MainActivity8::class.java)
                startActivity(intent)
            }

        }
//        validate()
//        clearErrors()

    }

    fun validate(){
        val num1 = binding.etNum3.text.toString()
        var inputError = false
        if(num1.isBlank()){
            inputError= true
            binding.etNum3.error = "Num is required"
        }
        else {
            val intent =Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }
    }

    fun clearErrors(){
        binding.etNum3.error = null
    }
}


