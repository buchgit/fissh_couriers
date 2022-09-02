package com.example.fissh_couriers.model.sharedPreferences

interface AppSharedPreferences {

    //в SharedPreferences будет хранить токен
    fun getToken(): String?;
    fun setToken(token: String?);

}