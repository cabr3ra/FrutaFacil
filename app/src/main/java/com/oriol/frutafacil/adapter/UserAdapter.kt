package com.oriol.frutafacil.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oriol.frutafacil.R
import com.oriol.frutafacil.User

class UserAdapter(private val userList:List<User>) : RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return UserViewHolder(layoutInflater.inflate(R.layout.user_item, parent,false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item = userList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}
