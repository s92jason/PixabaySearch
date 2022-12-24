package com.jasonchen.gogolooksearch.view.ui.main.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/history/SearchHistoryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Lcom/jasonchen/gogolooksearch/view/ui/main/history/SearchHistoryAdapter$SearchHistoryViewHolder;", "callback", "Lcom/jasonchen/gogolooksearch/view/ui/main/history/SearchHistoryAdapterCallback;", "(Lcom/jasonchen/gogolooksearch/view/ui/main/history/SearchHistoryAdapterCallback;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "SearchHistoryViewHolder", "app_debug"})
public final class SearchHistoryAdapter extends androidx.recyclerview.widget.ListAdapter<java.lang.String, com.jasonchen.gogolooksearch.view.ui.main.history.SearchHistoryAdapter.SearchHistoryViewHolder> {
    private final com.jasonchen.gogolooksearch.view.ui.main.history.SearchHistoryAdapterCallback callback = null;
    
    public SearchHistoryAdapter(@org.jetbrains.annotations.NotNull()
    com.jasonchen.gogolooksearch.view.ui.main.history.SearchHistoryAdapterCallback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jasonchen.gogolooksearch.view.ui.main.history.SearchHistoryAdapter.SearchHistoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jasonchen.gogolooksearch.view.ui.main.history.SearchHistoryAdapter.SearchHistoryViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/history/SearchHistoryAdapter$SearchHistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/jasonchen/gogolooksearch/databinding/ViewSearchHistoryItemBinding;", "(Lcom/jasonchen/gogolooksearch/view/ui/main/history/SearchHistoryAdapter;Lcom/jasonchen/gogolooksearch/databinding/ViewSearchHistoryItemBinding;)V", "bind", "", "position", "", "keyword", "", "app_debug"})
    public final class SearchHistoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.jasonchen.gogolooksearch.databinding.ViewSearchHistoryItemBinding binding = null;
        
        public SearchHistoryViewHolder(@org.jetbrains.annotations.NotNull()
        com.jasonchen.gogolooksearch.databinding.ViewSearchHistoryItemBinding binding) {
            super(null);
        }
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        java.lang.String keyword) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/history/SearchHistoryAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.String> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.String oldItem, @org.jetbrains.annotations.NotNull()
        java.lang.String newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.String oldItem, @org.jetbrains.annotations.NotNull()
        java.lang.String newItem) {
            return false;
        }
    }
}