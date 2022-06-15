package com.example.apipractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.apipractice.models.User
import kotlinx.android.synthetic.main.row_items.view.*

class MyAdapter(val context: Context, val userlist: List<User>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var username: TextView
        var userAvailability: TextView

        init {
            username = itemView.userName
            userAvailability = itemView.userAvailability
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.username.text = userlist[position].name
        randomAvailability(userlist[position])
        holder.userAvailability.text = userlist[position].availability
    }
    //holder.userId.text = userlist[position].userId.toString()
    //holder.companyname.text = userlist[position].company.name
    override fun getItemCount(): Int {
        return userlist.size
    }

    fun randomAvailability(user: User): String {
        var randomNumber = (1..10).random()
        user.availability = when(randomNumber){
            in 1..6 -> "På kontoret"
            in 7..9 -> "Online"
            else -> "Sygemeldt"
        }
        return user.availability
    }
}