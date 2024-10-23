package com.indri.uts.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.indri.uts.Detail
import com.indri.uts.R
import com.indri.uts.RecycleMakanan
import com.indri.uts.model.ModelMakanan

class MakananAdapter(private val itemList: List<ModelMakanan>) :
RecyclerView.Adapter<MakananAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_makanan, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.titleTextView.text = item.title
        holder.descriptionTextView.text = item.description
        holder.imageView.setImageResource(item.imageResId)

        // Set click listener to navigate to DetailActivity
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, Detail::class.java).apply {
                putExtra("TITLE", item.title)
                putExtra("IMAGE_RES_ID", item.imageResId)
            }
            context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return itemList.size
    }
}