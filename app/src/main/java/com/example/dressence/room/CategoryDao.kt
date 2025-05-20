package com.example.dressence.room

import androidx.room.Dao
import androidx.room.Query
import com.example.dressence.data.entity.CategoryItem


@Dao
interface CategoryDao {
//buralarda dataSource iletilck fonksiyonlar yazılır.

//
//    @Query("SELECT * FROM category")
//    suspend fun kategoriGetir():List<String>
//
    @Query("SELECT * FROM category")
    suspend fun kategorileriGetir():List<CategoryItem>


}