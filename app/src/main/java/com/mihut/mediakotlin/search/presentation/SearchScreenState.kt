package com.mihut.mediakotlin.search.presentation

import com.mihut.mediakotlin.main.domain.models.Media

data class SearchScreenState(

    val searchPage: Int = 1,

    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,

    val searchQuery: String = "",

    val searchList: List<Media> = emptyList(),


    )