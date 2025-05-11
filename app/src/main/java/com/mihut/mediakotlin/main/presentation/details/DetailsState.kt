package com.mihut.mediakotlin.main.presentation.details

import com.mihut.mediakotlin.main.domain.models.Media

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Media? = null
)