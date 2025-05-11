package com.mihut.mediakotlin.main.domain.repository

import com.mihut.mediakotlin.main.domain.models.Genre
import com.mihut.mediakotlin.util.Resource
import kotlinx.coroutines.flow.Flow

interface GenreRepository {
    suspend fun getGenres(
        fetchFromRemote: Boolean,
        type: String,
        apiKey: String
    ): Flow<Resource<List<Genre>>>
}