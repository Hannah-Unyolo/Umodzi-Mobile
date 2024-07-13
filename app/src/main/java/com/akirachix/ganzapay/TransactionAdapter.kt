package com.akirachix.ganzapay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView

class TransactionAdapter (val transactionList: List<Transaction>): RecyclerView.Adapter<TransactionViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.transaction_list_item, parent,false)
        return TransactionViewHolder((itemView))
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        var transaction = transactionList[position]
        holder.tvMonth.text = transaction.month
        holder.tvAmount.text = transaction.amount
    }
}


class TransactionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvMonth = itemView.findViewById<TextView>(R.id.tvMonth)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
}