package com.example.dressence.data.dataSource

import com.example.dressence.data.entity.CategoryItem
import com.example.dressence.room.CategoryDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CategoryDatasource(var categoryDao:CategoryDao) {
    //  internet tabanli çalısınca retrofit kütüphaneesini kullanarak verileri erişmiş olucaktık
    // onun içinde bunu yoneten bir dao olmuş olucaktı yani bu class parametre olarak bir interface istemiş olucaktı

//
//    suspend fun kategorileriGetir():List<String> = withContext(Dispatchers.IO){
//
//        return@withContext categoryDao.kategoriGetir()
//    }


    suspend fun kategorileriGetir():List<CategoryItem> = withContext(Dispatchers.IO){

        return@withContext categoryDao.kategorileriGetir()
    }
}