package com.jasonchen.gogolooksearch

import android.app.Application
import com.jasonchen.gogolooksearch.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyApplication: Application(), HasAndroidInjector {
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        AppInjector.initAppComponent(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }

}