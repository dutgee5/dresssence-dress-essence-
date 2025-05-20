package com.example.dressence.di

import com.example.dressence.data.dataSource.CategoryDatasource
import com.example.dressence.data.repo.CategoryRepository
import com.example.dressence.room.CategoryDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideCategoryRepository(categoryDatasource: CategoryDatasource):CategoryRepository{
        return CategoryRepository(categoryDatasource)
    }

}