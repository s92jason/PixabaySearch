package com.jasonchen.gogolooksearch.di.module

import com.jasonchen.gogolooksearch.view.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributesMainActivity(): MainActivity
}