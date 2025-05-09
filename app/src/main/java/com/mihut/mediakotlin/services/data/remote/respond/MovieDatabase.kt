package com.mihut.mediakotlin.services.data.remote.respond

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mihut.mediakotlin.services.data.local.movie.MovieDao
import com.mihut.mediakotlin.services.data.local.movie.MovieEntity

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}