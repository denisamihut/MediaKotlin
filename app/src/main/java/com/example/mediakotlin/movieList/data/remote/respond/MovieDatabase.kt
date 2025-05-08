package com.example.mediakotlin.movieList.data.remote.respond

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mediakotlin.movieList.data.local.movie.MovieDao
import com.example.mediakotlin.movieList.data.local.movie.MovieEntity

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}