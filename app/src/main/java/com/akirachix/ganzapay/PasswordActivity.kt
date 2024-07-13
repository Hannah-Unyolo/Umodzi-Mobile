package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.ganzapay.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.imageView15.setOnClickListener {
            val num1 = binding.etNum.text.toString()
            var inputError = false
            if(num1.isBlank()){
                binding.etNum.error = "Num is required"
                inputError= true
            }
            else {
                val intent =Intent(this,MainActivity6::class.java)
                startActivity(intent)
            }

        }
//        validate()
//        clearErrors()

    }

    fun validate(){
        val num1 = binding.etNum.text.toString()
        var inputError = false
        if(num1.isBlank()){
            inputError= true
            binding.etNum.error = "Num is required"
        }
        else {
            val intent =Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }
    }

    fun clearErrors(){
        binding.etNum.error = null
    }
}