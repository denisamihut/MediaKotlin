package com.mihut.mediakotlin.search.domain.repository


import com.mihut.mediakotlin.main.domain.models.Media
import com.mihut.mediakotlin.util.Resource
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun getSearchList(
        fetchFromRemote: Boolean,
        query: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

}