package com.mihut.mediakotlin.media_details.domain.repository

import com.mihut.mediakotlin.main.domain.models.Media
import com.mihut.mediakotlin.util.Resource
import kotlinx.coroutines.flow.Flow

interface DetailsRepository {

    suspend fun getDetails(
        type: String,
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<Media>>

}