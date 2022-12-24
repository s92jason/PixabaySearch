package com.jasonchen.gogolooksearch.di.module

import com.jasonchen.gogolooksearch.repository.PixabayService
import com.jasonchen.gogolooksearch.repository.repo.DefaultPixabayRepository
import com.jasonchen.gogolooksearch.repository.repo.PixabayRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun providePixabayRepository(service: PixabayService): PixabayRepository {
        return DefaultPixabayRepository(service)
    }
}