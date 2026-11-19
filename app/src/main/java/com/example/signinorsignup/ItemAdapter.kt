package com.example.signinorsignup

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(
    private val itemList: ArrayList<ItemModel>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // ViewHolder
    class ItemViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val image: ImageView =
            itemView.findViewById(R.id.itemImage)

        val title: TextView =
            itemView.findViewById(R.id.itemTitle)

        val description: TextView =
            itemView.findViewById(R.id.itemDescription)

        val price: TextView =
            itemView.findViewById(R.id.itemPrice)
    }

    // Create ViewHolder
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card, parent, false)

        return ItemViewHolder(view)
    }

    // Bind Data
    override fun onBindViewHolder(
        holder: ItemViewHolder,
        position: Int
    ) {

        val item = itemList[position]

        holder.image.setImageResource(item.image)
        holder.title.text = item.title
        holder.description.text = item.description
        holder.price.text = item.price
    }

    // Total Items
    override fun getItemCount(): Int {
        return itemList.size
    }
}