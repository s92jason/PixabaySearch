package com.jasonchen.gogolooksearch.view.ui.main.result

import com.jasonchen.gogolooksearch.data.model.searchImages.Hit

interface SearchResultAdapterCallback {
    fun onItemSelect(position: Int, hit: Hit)
    fun preLoadNextPage()
}