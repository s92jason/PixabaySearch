package com.jasonchen.gogolooksearch.view.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006$"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/SearchFragment;", "Lcom/jasonchen/gogolooksearch/view/base/BaseFragment;", "Lcom/jasonchen/gogolooksearch/databinding/FragmentSearchBinding;", "()V", "DEF_LAYOUT_GRID_TYPE_COLUMN", "", "viewModel", "Lcom/jasonchen/gogolooksearch/view/ui/MainViewModel;", "getViewModel", "()Lcom/jasonchen/gogolooksearch/view/ui/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindingInflater", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "type", "Lcom/jasonchen/gogolooksearch/Constants$ResultLayoutType;", "initHistoryRecyclerView", "", "initRecyclerView", "layoutManager", "initView", "openExternalWebSite", "url", "", "showHistoryRecyclerView", "isShow", "", "subscribesResultLayoutType", "subscribesSearchHistory", "subscribesSearchState", "Companion", "app_debug"})
public final class SearchFragment extends com.jasonchen.gogolooksearch.view.base.BaseFragment<com.jasonchen.gogolooksearch.databinding.FragmentSearchBinding> {
    private final int DEF_LAYOUT_GRID_TYPE_COLUMN = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.jasonchen.gogolooksearch.view.ui.main.SearchFragment.Companion Companion = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public SearchFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.jasonchen.gogolooksearch.databinding.FragmentSearchBinding bindingInflater(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    private final com.jasonchen.gogolooksearch.view.ui.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    private final void subscribesSearchState() {
    }
    
    private final void subscribesResultLayoutType() {
    }
    
    private final void subscribesSearchHistory() {
    }
    
    private final void initRecyclerView(com.jasonchen.gogolooksearch.Constants.ResultLayoutType type, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
    }
    
    private final void initHistoryRecyclerView() {
    }
    
    private final void showHistoryRecyclerView(boolean isShow) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager(com.jasonchen.gogolooksearch.Constants.ResultLayoutType type) {
        return null;
    }
    
    private final void openExternalWebSite(java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/SearchFragment$Companion;", "", "()V", "newInstance", "Lcom/jasonchen/gogolooksearch/view/ui/main/SearchFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.jasonchen.gogolooksearch.view.ui.main.SearchFragment newInstance() {
            return null;
        }
    }
}