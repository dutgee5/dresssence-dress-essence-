package com.example.dressence.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable


@Entity(tableName = "category")
data class CategoryItem(

    @PrimaryKey(true)
    @ColumnInfo(name="category_id")
    @NotNull
    var categoryId:Int,


    @ColumnInfo(name = "category_name")
    @NotNull
    var categoryName:String)
    :Serializable {
}