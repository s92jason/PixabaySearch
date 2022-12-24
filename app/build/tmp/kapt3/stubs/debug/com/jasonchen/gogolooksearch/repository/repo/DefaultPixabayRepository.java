package com.jasonchen.gogolooksearch.repository.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/jasonchen/gogolooksearch/repository/repo/DefaultPixabayRepository;", "Lcom/jasonchen/gogolooksearch/repository/repo/PixabayRepository;", "service", "Lcom/jasonchen/gogolooksearch/repository/PixabayService;", "(Lcom/jasonchen/gogolooksearch/repository/PixabayService;)V", "sendSearchImages", "Lretrofit2/Response;", "Lcom/jasonchen/gogolooksearch/data/model/searchImages/SearchImagesRes;", "params", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class DefaultPixabayRepository implements com.jasonchen.gogolooksearch.repository.repo.PixabayRepository {
    private final com.jasonchen.gogolooksearch.repository.PixabayService service = null;
    
    @javax.inject.Inject()
    public DefaultPixabayRepository(@org.jetbrains.annotations.NotNull()
    com.jasonchen.gogolooksearch.repository.PixabayService service) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object sendSearchImages(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.jasonchen.gogolooksearch.data.model.searchImages.SearchImagesRes>> continuation) {
        return null;
    }
}