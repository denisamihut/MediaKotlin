package com.mihut.mediakotlin.services.domain.repository

import com.mihut.mediakotlin.services.domain.model.Movie
import com.mihut.mediakotlin.services.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}