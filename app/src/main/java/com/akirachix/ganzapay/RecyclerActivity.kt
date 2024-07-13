package com.akirachix.ganzapay

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.ganzapay.databinding.ActivityMain13Binding

class MainActivity13 : AppCompatActivity() {
    lateinit var binding: ActivityMain13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain13Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ivMenu.setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }

        binding.rvTransactions.layoutManager= LinearLayoutManager(this)
        displayTransactions()



    }

    fun displayTransactions(){
        val transaction1 = Transaction("MUTARAMA","RWF 70000")
        val transaction2 = Transaction("MUTARAMA","RWF 70000")
        val transaction3 = Transaction("MUTARAMA","RWF 70000")


        val transactionsList = listOf(transaction1,transaction2,transaction3)
        val transactionAdapter = TransactionAdapter(transactionsList)
        binding.rvTransactions.adapter = transactionAdapter
    }
}