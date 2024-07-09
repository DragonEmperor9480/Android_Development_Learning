package com.example.recyclerviews

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactListAdaoter
    (
    private  val listOfContacts : List<ContactItem>

):RecyclerView.Adapter<ContactListAdaoter.ContactListViewHolder>(){


    class ContactListViewHolder(
        view: View
    ): RecyclerView.ViewHolder(view)
    {
        val image: ImageView = view.findViewById(R.id.img)
        val heading: TextView = view.findViewById(R.id.heading)
        val subHeading: TextView = view.findViewById(R.id.sub_heading)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        return ContactListViewHolder(view)
        }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContactListViewHolder, position: Int) {
        holder.image.setImageResource(listOfContacts[position].imgRes)
        holder.heading.text = listOfContacts[position].h

    }
}