package com.mihut.mediakotlin.search.domain.repository

import android.provider.MediaStore.Audio.Media
import com.mihut.mediakotlin.main.util.Resource
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun getSearchList(
        fetchFromRemote: Boolean,
        query: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

}