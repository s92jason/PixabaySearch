package com.jasonchen.gogolooksearch.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H&\u00a8\u0006\u0007"}, d2 = {"Lcom/jasonchen/gogolooksearch/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/jasonchen/gogolooksearch/MyApplication;", "inject", "", "instance", "Factory", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.jasonchen.gogolooksearch.di.module.ActivityModule.class, com.jasonchen.gogolooksearch.di.module.FragmentModule.class, com.jasonchen.gogolooksearch.di.module.ViewModelModule.class, com.jasonchen.gogolooksearch.di.module.NetWorkModule.class, com.jasonchen.gogolooksearch.di.module.UtilsModule.class, com.jasonchen.gogolooksearch.di.module.RepositoryModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.jasonchen.gogolooksearch.MyApplication> {
    
    @java.lang.Override()
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.jasonchen.gogolooksearch.MyApplication instance);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/jasonchen/gogolooksearch/di/AppComponent$Factory;", "", "create", "Lcom/jasonchen/gogolooksearch/di/AppComponent;", "context", "Landroid/content/Context;", "application", "Lcom/jasonchen/gogolooksearch/MyApplication;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.jasonchen.gogolooksearch.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        com.jasonchen.gogolooksearch.MyApplication application);
    }
}