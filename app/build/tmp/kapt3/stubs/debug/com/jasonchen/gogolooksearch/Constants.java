package com.jasonchen.gogolooksearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jasonchen/gogolooksearch/Constants;", "", "()V", "API_KEY", "", "API_URL", "PREF_KEY_RESULT_LAYOUT_TYPE", "PREF_KEY_SEARCH_HISTORY", "PREF_NAME_APP_DATA", "WEB_URL_PIXABAY", "ResultLayoutType", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.jasonchen.gogolooksearch.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_URL = "https://pixabay.com/api/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "31940883-87c76bce6dba6633cb61066e8";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_URL_PIXABAY = "https://pixabay.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_NAME_APP_DATA = "AppDataPrefs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_KEY_RESULT_LAYOUT_TYPE = "ResultLayoutType";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_KEY_SEARCH_HISTORY = "SearchHistory";
    
    private Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lcom/jasonchen/gogolooksearch/Constants$ResultLayoutType;", "", "index", "", "(Ljava/lang/String;II)V", "getIndex", "()I", "GRID", "LIST", "Companion", "app_debug"})
    public static enum ResultLayoutType {
        /*public static final*/ GRID /* = new GRID(0) */,
        /*public static final*/ LIST /* = new LIST(0) */;
        private final int index = 0;
        @org.jetbrains.annotations.NotNull()
        public static final com.jasonchen.gogolooksearch.Constants.ResultLayoutType.Companion Companion = null;
        
        ResultLayoutType(int index) {
        }
        
        public final int getIndex() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jasonchen/gogolooksearch/Constants$ResultLayoutType$Companion;", "", "()V", "getLayoutType", "Lcom/jasonchen/gogolooksearch/Constants$ResultLayoutType;", "index", "", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.jasonchen.gogolooksearch.Constants.ResultLayoutType getLayoutType(int index) {
                return null;
            }
        }
    }
}