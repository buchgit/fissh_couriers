package com.example.fissh_couriers.di

import com.example.fissh_couriers.model.sharedPreferences.AppSharedPreferences
import com.example.fissh_couriers.model.sharedPreferences.AppSharedPreferencesImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class SettingModule {
    @Binds
    abstract fun bindSharedPreferences(
        appSharedPreferencesImp: AppSharedPreferencesImp
    ): AppSharedPreferences
}






