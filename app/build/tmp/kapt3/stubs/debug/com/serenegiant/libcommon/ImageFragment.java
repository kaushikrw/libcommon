package com.serenegiant.libcommon;

import java.lang.System;

/**
 * 静止画表示用のFragment
 * FIXME MainFragmentで選択したのと違う映像が読み込まれる！！
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001a\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/serenegiant/libcommon/ImageFragment;", "Lcom/serenegiant/libcommon/BaseFragment;", "()V", "mImageView", "Lcom/serenegiant/widget/ZoomImageView;", "mInfo", "Lcom/serenegiant/mediastore/MediaInfo;", "initView", "", "rootView", "Landroid/view/View;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "onViewCreated", "view", "Companion", "ImageLoaderDrawable", "MyImageLoader", "app_debug"})
public final class ImageFragment extends com.serenegiant.libcommon.BaseFragment {
    private com.serenegiant.mediastore.MediaInfo mInfo;
    private com.serenegiant.widget.ZoomImageView mImageView;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.libcommon.ImageFragment.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    private static final boolean USU_LOADER_DRAWABLE = false;
    private static final java.lang.String ARG_MEDIA_INFO = "ARG_MEDIA_INFO";
    
    public ImageFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void initView(android.view.View rootView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.serenegiant.libcommon.ImageFragment newInstance(@org.jetbrains.annotations.NotNull()
    com.serenegiant.mediastore.MediaInfo info) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/serenegiant/libcommon/ImageFragment$ImageLoaderDrawable;", "Lcom/serenegiant/mediastore/LoaderDrawable;", "context", "Landroid/content/Context;", "width", "", "height", "(Landroid/content/Context;II)V", "checkCache", "Landroid/graphics/Bitmap;", "id", "", "createImageLoader", "Lcom/serenegiant/mediastore/ImageLoader;", "onBoundsChange", "", "bounds", "Landroid/graphics/Rect;", "app_debug"})
    static final class ImageLoaderDrawable extends com.serenegiant.mediastore.LoaderDrawable {
        
        public ImageLoaderDrawable(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int width, int height) {
            super(null, 0, 0);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected com.serenegiant.mediastore.ImageLoader createImageLoader() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected android.graphics.Bitmap checkCache(long id) {
            return null;
        }
        
        @java.lang.Override()
        public void onBoundsChange(@org.jetbrains.annotations.NotNull()
        android.graphics.Rect bounds) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0014\u00a8\u0006\u000e"}, d2 = {"Lcom/serenegiant/libcommon/ImageFragment$MyImageLoader;", "Lcom/serenegiant/mediastore/ImageLoader;", "parent", "Lcom/serenegiant/libcommon/ImageFragment$ImageLoaderDrawable;", "(Lcom/serenegiant/libcommon/ImageFragment$ImageLoaderDrawable;)V", "loadBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "info", "Lcom/serenegiant/mediastore/MediaInfo;", "requestWidth", "", "requestHeight", "app_debug"})
    static final class MyImageLoader extends com.serenegiant.mediastore.ImageLoader {
        
        public MyImageLoader(@org.jetbrains.annotations.NotNull()
        com.serenegiant.libcommon.ImageFragment.ImageLoaderDrawable parent) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.graphics.Bitmap loadBitmap(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.serenegiant.mediastore.MediaInfo info, int requestWidth, int requestHeight) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/serenegiant/libcommon/ImageFragment$Companion;", "", "()V", "ARG_MEDIA_INFO", "", "DEBUG", "", "TAG", "kotlin.jvm.PlatformType", "USU_LOADER_DRAWABLE", "newInstance", "Lcom/serenegiant/libcommon/ImageFragment;", "info", "Lcom/serenegiant/mediastore/MediaInfo;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.serenegiant.libcommon.ImageFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.serenegiant.mediastore.MediaInfo info) {
            return null;
        }
    }
}