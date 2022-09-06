package com.example.fissh_couriers.di

import com.example.fissh_couriers.api.CourierApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SourceModule {

    @Provides
    @Singleton
    fun provideCourierApiImp(retrofit: Retrofit): CourierApi =
        retrofit.create(CourierApi::class.java)

}