package com.example.alarmapp.di

import android.content.Context
import androidx.room.Room
import com.example.alarmapp.data.local.AlarmDatabase
import com.example.alarmapp.data.local.AlarmsDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideAlarmDatabase(@ApplicationContext context: Context): AlarmDatabase {

        return Room.databaseBuilder(
            context,
            AlarmDatabase::class.java,
            "alarm.db"
        ).build()

    }

    @Singleton
    @Provides
    fun provideAlarmDao(database: AlarmDatabase): AlarmsDAO {

        return database.alarmsDao()

    }

}