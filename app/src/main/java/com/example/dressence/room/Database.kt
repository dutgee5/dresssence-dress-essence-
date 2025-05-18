package com.example.dressence.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dressence.data.entity.CategoryItem


@Database(entities = [CategoryItem::class], version = 1)
abstract class Database:RoomDatabase() {

//    abstract fun getCategoryDao():CategoryDao
}

// bruadaki amaç databsedeki tablolara erişerek bilgilere erişmek
