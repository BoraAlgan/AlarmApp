package com.example.alarmapp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface AlarmsDAO {

    @Insert
    suspend fun insert (alarm: SavedAlarms)

    @Delete
    suspend fun delete (alarm: SavedAlarms)

    @Update
    suspend fun update (alarm: SavedAlarms)
}