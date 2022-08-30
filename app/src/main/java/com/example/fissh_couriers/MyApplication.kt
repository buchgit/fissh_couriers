package com.example.fissh_couriers

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class MyApplication : Application(){

    private val TAG = "${MyApplication::class.java.simpleName} ###"



}