package com.example.dressence.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dressence.data.entity.Product

import com.example.dressence.databinding.ProductBinding

class ProductItemAdapter(var mContext: Context,var product:List<Product>):RecyclerView.Adapter<ProductItemAdapter.ProductItemHolder>(){

    inner class ProductItemHolder(var tasarim:ProductBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemHolder {
        val tasarim=ProductBinding.inflate(LayoutInflater.from(mContext),parent,false)

        return ProductItemHolder(tasarim)
    }

    override fun getItemCount(): Int {
        return product.size
    }

    override fun onBindViewHolder(holder: ProductItemHolder, position: Int) {

        val product = product.get(position)

        val t = holder.tasarim

        t.textProductView.text =product.productName

        t.textProductPriceView.text =product.producctPrice
    }


}