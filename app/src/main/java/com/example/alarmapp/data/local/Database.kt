package com.example.alarmapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SavedAlarms::class], version = 1)
abstract class AlarmDatabase: RoomDatabase() {

    abstract fun alarmsDao(): AlarmsDAO
            
}