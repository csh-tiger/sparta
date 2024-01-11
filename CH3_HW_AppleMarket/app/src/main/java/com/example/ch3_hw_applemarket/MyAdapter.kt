package com.example.ch3_hw_applemarket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ch3_hw_applemarket.databinding.ItemRecyclerviewBinding

class MyAdapter(val mItems: MutableList<MyItem>) : RecyclerView.Adapter<MyAdapter.Holder>() {

    interface ItemClick {
        fun onClick(view : View, position : Int)
    }

    var itemClick : ItemClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener {
            itemClick?.onClick(it, position)
        }
        val price=mItems[position].aPrice.toInt()
        val unitPrice=String.format("%,d", price)
        holder.iconImageView.setImageResource(mItems[position].aItem)
        holder.title.text = mItems[position].aTitle
        holder.address.text = mItems[position].aAddress
        holder.price.text=unitPrice
        holder.like.text=mItems[position].aLike
        holder.chat.text=mItems[position].aChat
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    inner class Holder(val binding: ItemRecyclerviewBinding): RecyclerView.ViewHolder(binding.root){
        val iconImageView=binding.ivRecycleItem
        val title=binding.tvRecycleName
        val address=binding.tvRecycleAddress
        val price=binding.tvRecyclePrice
        val like=binding.tvRecycleLike
        val chat=binding.tvRecycleChat
    }

}