package com.mihut.mediakotlin.main.data.remote.dto

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mihut.mediakotlin.main.data.local.media.MediaDao
import com.mihut.mediakotlin.main.data.local.media.MediaEntity

@Database(
    entities = [MediaEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MediaDao
}