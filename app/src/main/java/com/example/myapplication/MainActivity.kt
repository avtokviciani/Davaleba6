package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car1 = Car(
            name = "Maserati MC20",
            engine = 3.0F,
            year = 2020
        )

        val car2 = Car(
            name = ("Mercede Benz C63s"),
            engine = 5.5F,
            year = 2017
        )

        val book1 = Book(
            name = ("Guliver's Travels"),
            pages = 225,
            author = ("Jonathan Swift"),
            originally_published = 1726
        )

        val book2 = Book(
            name = ("A Study in Scarlet"),
            pages = 210,
            author = ("Arthur Conan Doyle"),
            originally_published = 1887
        )

        App.instance.db.getCarDao().insert(car1, car2)

        App.instance.db.getCarDao().getAllCars()?.forEach { car ->
            Log.i("AvtosLog", car.toString())
        }

        App.instance.db.getBookDao().insert(book1, book2)

        App.instance.db.getBookDao().getAllBooks()?.forEach { book ->
            Log.i("AvtosLog", book.toString())
        }

    }
}