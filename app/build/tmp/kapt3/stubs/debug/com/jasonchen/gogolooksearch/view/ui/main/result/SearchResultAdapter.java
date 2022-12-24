package com.jasonchen.gogolooksearch.view.ui.main.result;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001a\u001b\u001c\u001dB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/result/SearchResultAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/jasonchen/gogolooksearch/data/model/searchImages/Hit;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "resultLayoutType", "Lcom/jasonchen/gogolooksearch/Constants$ResultLayoutType;", "viewModel", "Lcom/jasonchen/gogolooksearch/view/ui/MainViewModel;", "callback", "Lcom/jasonchen/gogolooksearch/view/ui/main/result/SearchResultAdapterCallback;", "(Lcom/jasonchen/gogolooksearch/Constants$ResultLayoutType;Lcom/jasonchen/gogolooksearch/view/ui/MainViewModel;Lcom/jasonchen/gogolooksearch/view/ui/main/result/SearchResultAdapterCallback;)V", "scrollState", "", "checkLoadNextPage", "", "position", "getItemViewType", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "DiffCallback", "GridViewHolder", "ListViewHolder", "app_debug"})
public final class SearchResultAdapter extends androidx.recyclerview.widget.ListAdapter<com.jasonchen.gogolooksearch.data.model.searchImages.Hit, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.jasonchen.gogolooksearch.Constants.ResultLayoutType resultLayoutType = null;
    private final com.jasonchen.gogolooksearch.view.ui.MainViewModel viewModel = null;
    private final com.jasonchen.gogolooksearch.view.ui.main.result.SearchResultAdapterCallback callback = null;
    private int scrollState = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.jasonchen.gogolooksearch.view.ui.main.result.SearchResultAdapter.Companion Companion = null;
    private static final int DEF_PRELOAD_COUNT = 2;
    
    public SearchResultAdapter(@org.jetbrains.annotations.NotNull()
    com.jasonchen.gogolooksearch.Constants.ResultLayoutType resultLayoutType, @org.jetbrains.annotations.NotNull()
    com.jasonchen.gogolooksearch.view.ui.MainViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.jasonchen.gogolooksearch.view.ui.main.result.SearchResultAdapterCallback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void checkLoadNextPage(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/result/SearchResultAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/jasonchen/gogolooksearch/databinding/ViewSearchResultListBinding;", "(Lcom/jasonchen/gogolooksearch/view/ui/main/result/SearchResultAdapter;Lcom/jasonchen/gogolooksearch/databinding/ViewSearchResultListBinding;)V", "bind", "", "position", "", "hit", "Lcom/jasonchen/gogolooksearch/data/model/searchImages/Hit;", "setImage", "setText", "app_debug"})
    public final class ListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.jasonchen.gogolooksearch.databinding.ViewSearchResultListBinding binding = null;
        
        public ListViewHolder(@org.jetbrains.annotations.NotNull()
        com.jasonchen.gogolooksearch.databinding.ViewSearchResultListBinding binding) {
            super(null);
        }
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.jasonchen.gogolooksearch.data.model.searchImages.Hit hit) {
        }
        
        private final void setImage(com.jasonchen.gogolooksearch.data.model.searchImages.Hit hit) {
        }
        
        private final void setText(com.jasonchen.gogolooksearch.data.model.searchImages.Hit hit) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/result/SearchResultAdapter$GridViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/jasonchen/gogolooksearch/databinding/ViewSearchResultGridBinding;", "(Lcom/jasonchen/gogolooksearch/view/ui/main/result/SearchResultAdapter;Lcom/jasonchen/gogolooksearch/databinding/ViewSearchResultGridBinding;)V", "bind", "", "position", "", "hit", "Lcom/jasonchen/gogolooksearch/data/model/searchImages/Hit;", "setImage", "app_debug"})
    public final class GridViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.jasonchen.gogolooksearch.databinding.ViewSearchResultGridBinding binding = null;
        
        public GridViewHolder(@org.jetbrains.annotations.NotNull()
        com.jasonchen.gogolooksearch.databinding.ViewSearchResultGridBinding binding) {
            super(null);
        }
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.jasonchen.gogolooksearch.data.model.searchImages.Hit hit) {
        }
        
        private final void setImage(com.jasonchen.gogolooksearch.data.model.searchImages.Hit hit) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/result/SearchResultAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/jasonchen/gogolooksearch/data/model/searchImages/Hit;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.jasonchen.gogolooksearch.data.model.searchImages.Hit> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.jasonchen.gogolooksearch.data.model.searchImages.Hit oldItem, @org.jetbrains.annotations.NotNull()
        com.jasonchen.gogolooksearch.data.model.searchImages.Hit newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.jasonchen.gogolooksearch.data.model.searchImages.Hit oldItem, @org.jetbrains.annotations.NotNull()
        com.jasonchen.gogolooksearch.data.model.searchImages.Hit newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jasonchen/gogolooksearch/view/ui/main/result/SearchResultAdapter$Companion;", "", "()V", "DEF_PRELOAD_COUNT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}