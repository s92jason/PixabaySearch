package com.jasonchen.gogolooksearch.view.ui.main.history

import com.jasonchen.gogolooksearch.data.model.searchImages.Hit

interface SearchHistoryAdapterCallback {
    fun onItemSelect(position: Int, keyword: String)
}