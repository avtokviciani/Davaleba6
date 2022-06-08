package com.example.myapplication

import androidx.room.*

@Dao
interface CarDao {

    @Query("SELECT * FROM Cars")
    fun getAllCars() : List<Car>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg cars: Car)

    @Query("SELECT * FROM CARS C Where C.NAME Like :name AND C.Engine > :Engine")
    fun getByNameAndEngine(name: String, Engine: Float): List<Car>?

    @Delete
    fun delete(car: Car)

    @Query("DELETE FROM Cars")
    fun deleteAll()

}