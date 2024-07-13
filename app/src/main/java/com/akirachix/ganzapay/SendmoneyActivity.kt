package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
            val num1 = binding.etNum1.text.toString()
            var inputError = false
            if(num1.isBlank()){
                binding.etNum1.error = "Num is required"
                inputError= true
            }
            else {
                val intent =Intent(this,MainActivity8::class.java)
                startActivity(intent)
            }

//            clearErrors()
//            validate()
//            val intent =Intent(this,MainActivity8::class.java)
//            startActivity(intent)

        }

    }


    fun validate(){
        val num1 = binding.etNum1.text.toString()
        var inputError = false
        if(num1.isBlank()){
            binding.etNum1.error = "Num is required"
            inputError= true
        }

    }
    fun clearErrors(){
        binding.etNum1.error = null
    }

}
