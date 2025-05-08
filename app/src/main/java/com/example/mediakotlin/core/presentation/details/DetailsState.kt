package com.example.mediakotlin.core.presentation.details

import com.example.mediakotlin.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)