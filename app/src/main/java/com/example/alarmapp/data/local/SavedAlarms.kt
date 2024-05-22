package com.example.alarmapp.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alarm")
data class SavedAlarms(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "alarmID")
    val alarmId: Int = 0,

    @ColumnInfo(name = "savedAlarmName")
    var savedAlarmName: String,

    @ColumnInfo(name = "alarmTime")
    var alarmTime: Long,
)