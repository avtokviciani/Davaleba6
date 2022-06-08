package com.example.myapplication

import androidx.room.*

@Dao
interface BookDao {

    @Query("SELECT * FROM Books")
    fun getAllBooks() : List<Book>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg books: Book)

    @Query("SELECT * FROM Books C Where C.NAME Like :name AND C.Pages > :Pages")
    fun getByNameAndBook(name: String, Pages: Int)

    @Delete
    fun delete(book: Book)

    @Query("DELETE FROM Books")
    fun deleteAll()
}