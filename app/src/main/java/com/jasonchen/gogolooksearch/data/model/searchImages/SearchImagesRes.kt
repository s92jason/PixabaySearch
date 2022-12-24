package com.jasonchen.gogolooksearch.data.model.searchImages

data class SearchImagesRes(
    val hits: List<Hit>,
    val total: Int,
    val totalHits: Int
)