package com.mihut.mediakotlin.core.presentation.details

import com.mihut.mediakotlin.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)