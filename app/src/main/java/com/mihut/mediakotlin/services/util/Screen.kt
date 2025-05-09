package com.mihut.mediakotlin.services.util

sealed class Screen(val rout: String) {
    object Home : Screen("main")
    object PopularMovieList : Screen("popularMovie")
    object UpcomingMovieList : Screen("upcomingMovie")
    object Details : Screen("details")
    object FavoriteMovieList : Screen("favoriteMovie")
}

