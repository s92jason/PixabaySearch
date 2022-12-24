package com.jasonchen.gogolooksearch.repository

import com.jasonchen.gogolooksearch.Constants
import com.jasonchen.gogolooksearch.data.model.searchImages.SearchImagesRes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface PixabayService {
    @GET("?key=${Constants.API_KEY}")
    suspend fun searchImages(@QueryMap params: Map<String, String>): Response<SearchImagesRes>
}