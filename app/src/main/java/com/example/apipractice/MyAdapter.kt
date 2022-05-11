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
        var companyname: TextView

        init {
            username = itemView.userName
            companyname = itemView.companyName
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.username.text = userlist[position].name
        //holder.userId.text = userlist[position].userId.toString()
        holder.companyname.text = userlist[position].company.name
    }

    override fun getItemCount(): Int {
        return userlist.size
    }
}