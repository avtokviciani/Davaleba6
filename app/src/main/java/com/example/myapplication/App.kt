package com.example.myapplication

import android.app.Application
import androidx.room.Room

class App : Application() {

    companion object{

        lateinit var instance: App
            private set
    }

    lateinit var instance: App
        private set

    lateinit var db: AppDatabase


    override fun onCreate() {
        super.onCreate()

        instance = this

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "MY_APP_DB"
        ).allowMainThreadQueries().build()

    }

}