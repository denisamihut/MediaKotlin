package com.mihut.mediakotlin.media_details.data.remote.api

import com.mihut.mediakotlin.main.data.remote.dto.MediaListDto
import com.mihut.mediakotlin.media_details.data.remote.dto.details.DetailsDto
import com.mihut.mediakotlin.media_details.data.remote.dto.videos.VideosList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ExtraDetailsApi {

    @GET("{type}/{id}")
    suspend fun getDetails(
        @Path("type") type: String,
        @Path("id") id: Int,
        @Query("api_key") apiKey: String
    ): DetailsDto

    @GET("{type}/{id}/similar")
    suspend fun getSimilarMediaList(
        @Path("type") type: String,
        @Path("id") id: Int,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String
    ): MediaListDto

    @GET("{type}/{id}/videos")
    suspend fun getVideosList(
        @Path("type") type: String,
        @Path("id") id: Int,
        @Query("api_key") apiKey: String
    ): VideosList

}