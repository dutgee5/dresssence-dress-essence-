package com.example.dressence.data.repo

import com.example.dressence.data.dataSource.CategoryDatasource
import com.example.dressence.room.CategoryDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CategoryRepository(var categoryDao: CategoryDao) {

   // abbacım benim func olucak suspand

//    suspend fun kategorileriGetir():List<String> = withContext(Dispatchers.IO){
//
//        return@withContext categoryDatasource
//    }

}