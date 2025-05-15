package com.example.dressence.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.example.dressence.databinding.ButtontasarimBinding

class CategoryItemAdapter(var mContext:Context,var categoryItem:Int):RecyclerView.Adapter<CategoryItemAdapter.CategoryItemHolder>() {

    inner class CategoryItemHolder(var tasarim:ButtontasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryItemAdapter.CategoryItemHolder {


        val tasarim =ButtontasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CategoryItemHolder(tasarim)

    }

    override fun onBindViewHolder(holder: CategoryItemAdapter.CategoryItemHolder, position: Int) {

        val categoryItem2  = categoryItem.get(position)

        val t = holder.tasarim

        t.cardButton.text = categoryItem2.
    }

    override fun getItemCount(): Int {
        // kac kere calisacagi
        return categoryItem.size
    }

}