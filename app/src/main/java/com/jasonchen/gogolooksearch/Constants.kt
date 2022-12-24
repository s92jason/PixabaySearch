package com.jasonchen.gogolooksearch

object Constants {
    //API Domain
    const val API_URL = "https://pixabay.com/api/"
    const val API_KEY = "31940883-87c76bce6dba6633cb61066e8"

    const val WEB_URL_PIXABAY = "https://pixabay.com"

    // SharedPreferences Key 定義
    const val PREF_NAME_APP_DATA = "AppDataPrefs"

    const val PREF_KEY_RESULT_LAYOUT_TYPE = "ResultLayoutType"

    const val PREF_KEY_SEARCH_HISTORY = "SearchHistory"

    enum class ResultLayoutType(val index: Int) {
        GRID(0), LIST(1);

        companion object {
            fun getLayoutType(index: Int): ResultLayoutType {
                return when (index) {
                    1 -> LIST
                    else -> GRID
                }
            }
        }
    }
}