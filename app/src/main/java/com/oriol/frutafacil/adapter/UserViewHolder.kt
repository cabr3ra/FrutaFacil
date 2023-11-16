package com.oriol.frutafacil.adapter

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.oriol.frutafacil.R
import com.oriol.frutafacil.User

class UserViewHolder(view:View): RecyclerView.ViewHolder(view) {

    val user = view.findViewById<TextView>(R.id.tvUser)
    val email = view.findViewById<TextView>(R.id.tvEmail)
    val name = view.findViewById<TextView>(R.id.tvName)
    val date = view.findViewById<TextView>(R.id.tvDate)
    val img = view.findViewById<ImageView>(R.id.ivUser)

    fun render(userModel: User) {
        user.text = userModel.user
        email.text = userModel.email
        name.text = userModel.name
        date.text = userModel.date
        Glide.with(img.context).load(userModel.img).into(img)
    }

}