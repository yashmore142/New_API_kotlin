package com.example.new_api_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.example.Data
import com.example.new_api_kotlin.R

class UserAdapter(private var mList: List<Data>):RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val txtId:TextView=itemView.findViewById(R.id.txtId)
        val txtEmail:TextView=itemView.findViewById(R.id.txtEmail)
        val txtFirstName:TextView=itemView.findViewById(R.id.txtFirstName)
        val txtLastName:TextView=itemView.findViewById(R.id.txtLastName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     val view=LayoutInflater.from(parent.context).inflate(R.layout.item_user_view,parent,false)
    return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.txtId.text=mList[position].id.toString()
        holder.txtEmail.text=mList[position].email
        holder.txtFirstName.text=mList[position].firstName
        holder.txtLastName.text=mList[position].lastName
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}