package com.example.fissh_couriers.model.sharedPreferences

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppSharedPreferencesImp @Inject constructor(@ApplicationContext appContext: Context) :
    AppSharedPreferences {

    private val sharedPreferences = appContext.getSharedPreferences("setting", Context.MODE_PRIVATE)

    companion object {
        private const val CURRENT_TOKEN = "current_token"
    }

    override fun getToken(): String? {
        return sharedPreferences.getString(CURRENT_TOKEN, null)
    }

    override fun setToken(token: String?) {
        if (token == null){
            sharedPreferences.edit().remove(CURRENT_TOKEN).apply()
        }else{
            sharedPreferences.edit().putString(CURRENT_TOKEN, token).apply()
        }
    }

}