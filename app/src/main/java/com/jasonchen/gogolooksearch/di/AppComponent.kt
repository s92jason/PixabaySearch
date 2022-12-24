package com.jasonchen.gogolooksearch.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.jasonchen.gogolooksearch.MyApplication
import com.jasonchen.gogolooksearch.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityModule::class,
        FragmentModule::class,
        ViewModelModule::class,
        NetWorkModule::class,
        UtilsModule::class,
        RepositoryModule::class
    ]
)
interface AppComponent : AndroidInjector<MyApplication> {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance application: MyApplication
        ): AppComponent
    }

    override fun inject(instance: MyApplication)
}