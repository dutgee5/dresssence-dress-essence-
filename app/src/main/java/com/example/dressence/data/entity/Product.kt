package com.example.dressence.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity(tableName = "product")
data class Product(@PrimaryKey(true) @NotNull @ColumnInfo("product_id") var productId:Int,
                   @NotNull @ColumnInfo("product_name") var productName:String,
                   @NotNull @ColumnInfo("product_name") var productImage:String,
                   @NotNull @ColumnInfo("product_price") var producctPrice:String,
                   @NotNull @ColumnInfo("category_id") var categoryId:Int,):Serializable{
}