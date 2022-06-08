package com.example.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date
import java.text.DateFormat
import java.util.*

@Entity(tableName = "Books")
data class Book (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    val id: Long? = null,

    @ColumnInfo(name = "NAME")
    val name: String?,

    @ColumnInfo(name = "Pages")
    val pages: Int?,

    @ColumnInfo(name = "Author")
    val author: String?,

    @ColumnInfo(name = "Originally_Published")
    val originally_published: Int?
)