package com.jasonchen.gogolooksearch.di.module

import com.jasonchen.gogolooksearch.view.ui.main.SearchFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributesSearchFragment(): SearchFragment
}