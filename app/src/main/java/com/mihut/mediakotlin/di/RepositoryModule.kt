package com.mihut.mediakotlin.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.mihut.mediakotlin.main.data.repository.GenreRepositoryImpl
import com.mihut.mediakotlin.main.data.repository.MediaRepositoryImpl
import com.mihut.mediakotlin.main.domain.repository.GenreRepository
import com.mihut.mediakotlin.main.domain.repository.MediaRepository
import com.mihut.mediakotlin.search.data.repository.SearchRepositoryImpl
import com.mihut.mediakotlin.search.domain.repository.SearchRepository
import com.mihut.mediakotlin.media_details.data.repository.DetailsRepositoryImpl
import com.mihut.mediakotlin.media_details.data.repository.ExtraDetailsRepositoryImpl
import com.mihut.mediakotlin.media_details.domain.repository.DetailsRepository
import com.mihut.mediakotlin.media_details.domain.repository.ExtraDetailsRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMediaRepository(
        mediaRepositoryImpl: MediaRepositoryImpl
    ): MediaRepository

    @Binds
    @Singleton
    abstract fun bindSearchRepository(
        searchRepositoryImpl: SearchRepositoryImpl
    ): SearchRepository

    @Binds
    @Singleton
    abstract fun bindGenreRepository(
        genreRepositoryImpl: GenreRepositoryImpl
    ): GenreRepository

    @Binds
    @Singleton
    abstract fun bindDetailsRepository(
        detailsRepositoryImpl: DetailsRepositoryImpl
    ): DetailsRepository

    @Binds
    @Singleton
    abstract fun bindExtraDetailsRepository(
        extraDetailsRepositoryImpl: ExtraDetailsRepositoryImpl
    ): ExtraDetailsRepository
}