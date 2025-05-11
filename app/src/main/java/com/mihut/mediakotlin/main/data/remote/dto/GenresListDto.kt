package com.mihut.mediakotlin.main.data.remote.dto

import com.mihut.mediakotlin.main.domain.models.Genre

data class GenresListDto(
    val genres: List<Genre>
)