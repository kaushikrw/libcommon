package com.serenegiant.libcommon.list;

import java.lang.System;

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/serenegiant/libcommon/list/MyItemRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/serenegiant/libcommon/list/MyItemRecyclerViewAdapter$ViewHolder;", "mValues", "", "Lcom/serenegiant/libcommon/list/DummyContent$DummyItem;", "mListener", "Lcom/serenegiant/libcommon/TitleFragment$OnListFragmentInteractionListener;", "(Ljava/util/List;Lcom/serenegiant/libcommon/TitleFragment$OnListFragmentInteractionListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class MyItemRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.serenegiant.libcommon.list.MyItemRecyclerViewAdapter.ViewHolder> {
    private final java.util.List<com.serenegiant.libcommon.list.DummyContent.DummyItem> mValues = null;
    private final com.serenegiant.libcommon.TitleFragment.OnListFragmentInteractionListener mListener = null;
    
    public MyItemRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.serenegiant.libcommon.list.DummyContent.DummyItem> mValues, @org.jetbrains.annotations.Nullable()
    com.serenegiant.libcommon.TitleFragment.OnListFragmentInteractionListener mListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.serenegiant.libcommon.list.MyItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.serenegiant.libcommon.list.MyItemRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/serenegiant/libcommon/list/MyItemRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mView", "Landroid/view/View;", "(Lcom/serenegiant/libcommon/list/MyItemRecyclerViewAdapter;Landroid/view/View;)V", "mContentView", "Landroid/widget/TextView;", "getMContentView", "()Landroid/widget/TextView;", "mItem", "Lcom/serenegiant/libcommon/list/DummyContent$DummyItem;", "getMItem", "()Lcom/serenegiant/libcommon/list/DummyContent$DummyItem;", "setMItem", "(Lcom/serenegiant/libcommon/list/DummyContent$DummyItem;)V", "getMView", "()Landroid/view/View;", "toString", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View mView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mContentView = null;
        @org.jetbrains.annotations.Nullable()
        private com.serenegiant.libcommon.list.DummyContent.DummyItem mItem;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View mView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMContentView() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.serenegiant.libcommon.list.DummyContent.DummyItem getMItem() {
            return null;
        }
        
        public final void setMItem(@org.jetbrains.annotations.Nullable()
        com.serenegiant.libcommon.list.DummyContent.DummyItem p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
}