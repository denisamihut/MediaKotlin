package com.mihut.mediakotlin.media_details.domain.repository

import com.mihut.mediakotlin.main.domain.models.Media
import com.mihut.mediakotlin.media_details.domain.models.Cast
import com.mihut.mediakotlin.util.Resource
import kotlinx.coroutines.flow.Flow

interface ExtraDetailsRepository {

    suspend fun getSimilarMediaList(
        isRefresh: Boolean,
        type: String,
        id: Int,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

    suspend fun getCastList(
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<Cast>>

    suspend fun getVideosList(
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<List<String>>>

}