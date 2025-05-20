package com.example.dressence.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.example.dressence.data.entity.CategoryItem
import com.example.dressence.databinding.ButtontasarimBinding

class CategoryItemAdapter(var mContext:Context,var categoryItem:List<CategoryItem>):RecyclerView.Adapter<CategoryItemAdapter.CategoryItemHolder>() {

    inner class CategoryItemHolder(var tasarim:ButtontasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryItemAdapter.CategoryItemHolder {


        val tasarim =ButtontasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CategoryItemHolder(tasarim)

    }

    override fun onBindViewHolder(holder: CategoryItemAdapter.CategoryItemHolder, position: Int) {

        val category = categoryItem.get(position) // dongu mekanizması var diyebiliriz

        var t = holder.tasarim

        t.cardButton.text = category.categoryName

    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }

}