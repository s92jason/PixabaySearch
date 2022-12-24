package com.jasonchen.gogolooksearch.repository.repo

import com.jasonchen.gogolooksearch.data.model.searchImages.SearchImagesRes
import com.jasonchen.gogolooksearch.repository.PixabayService
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DefaultPixabayRepository @Inject constructor(private val service: PixabayService) :
    PixabayRepository {
    override suspend fun sendSearchImages(
        params: Map<String, String>
    ): Response<SearchImagesRes> = service.searchImages(params)
}