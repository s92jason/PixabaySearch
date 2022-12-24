package com.jasonchen.gogolooksearch.utils

import android.content.Context
import com.jasonchen.gogolooksearch.Constants
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SharedPrefUtil @Inject constructor(private val context: Context) {
    private val appDataShared by lazy {
        context.getSharedPreferences(Constants.PREF_NAME_APP_DATA, Context.MODE_PRIVATE)
    }

    fun put(key: String, value: String) {
        appDataShared.edit().putString(key, value).apply()
    }

    fun put(key: String, value: Int) {
        appDataShared.edit().putInt(key, value).apply()
    }

    fun put(key: String, sets: Set<String>) {
        appDataShared.edit().putStringSet(key, sets).apply()
    }

    fun get(key: String, default: String): String {
        return appDataShared.getString(key, default) ?: default
    }

    fun get(key: String, default: Int): Int {
        return appDataShared.getInt(key, default)
    }

    fun get(key: String, default: Set<String>): Set<String> {
        return appDataShared.getStringSet(key, default) ?: setOf()
    }
}