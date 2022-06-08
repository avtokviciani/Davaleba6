package com.example.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Cars")
data class Car (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    val id: Long? = null,

    @ColumnInfo(name = "NAME")
    val name: String?,

    @ColumnInfo(name = "Engine")
    val engine: Float?,

    @ColumnInfo(name = "CAR_RELEASE_YEAR")
    val year: Int?
)