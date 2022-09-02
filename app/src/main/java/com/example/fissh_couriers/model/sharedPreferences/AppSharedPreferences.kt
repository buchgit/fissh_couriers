package com.example.fissh_couriers.model.sharedPreferences

interface AppSharedPreferences {

    //в SharedPreferences будет храниться токен
    fun getToken(): String?
    fun setToken(token: String?)

}