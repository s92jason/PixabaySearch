package com.jasonchen.gogolooksearch.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\n0\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/jasonchen/gogolooksearch/utils/AppUtils;", "", "()V", "DOUBLE_CLICK_INTERVAL", "", "isDoubleClick", "", "()Z", "m_lLastClickTime", "setSafeOnClickListener", "", "Landroid/view/View;", "onSafeClick", "Lkotlin/Function1;", "app_debug"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.jasonchen.gogolooksearch.utils.AppUtils INSTANCE = null;
    private static final long DOUBLE_CLICK_INTERVAL = 500L;
    private static long m_lLastClickTime = 0L;
    
    private AppUtils() {
        super();
    }
    
    public final boolean isDoubleClick() {
        return false;
    }
    
    public final void setSafeOnClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setSafeOnClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onSafeClick) {
    }
}