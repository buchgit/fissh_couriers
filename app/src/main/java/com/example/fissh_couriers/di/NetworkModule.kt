package com.example.fissh_couriers.di

import com.example.fissh_couriers.BuildConfig
import com.example.fissh_couriers.model.sharedPreferences.AppSharedPreferences
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun provideClient(appSharedPreferences: AppSharedPreferences):OkHttpClient{
        return OkHttpClient
            .Builder()
            .addInterceptor(createAuthorizationInterceptor(appSharedPreferences))
            .build()
    }

    private fun createAuthorizationInterceptor(appSharedPreferences: AppSharedPreferences): Interceptor {
        return Interceptor { chain ->
            val newBuilder = chain.request().newBuilder()
            val token = appSharedPreferences.getToken()
            if (token != null) {
                newBuilder.addHeader("Api-Key", token)
            }
            return@Interceptor chain.proceed(newBuilder.build())
        }
    }

    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder().build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient, moshi: Moshi):Retrofit{
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(client)
            .build()
    }

}