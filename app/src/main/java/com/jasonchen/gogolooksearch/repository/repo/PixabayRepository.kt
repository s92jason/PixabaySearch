package com.jasonchen.gogolooksearch.repository.repo

import com.jasonchen.gogolooksearch.data.model.searchImages.SearchImagesRes
import retrofit2.Response

interface PixabayRepository {
    suspend fun sendSearchImages(params: Map<String, String>): Response<SearchImagesRes>
}