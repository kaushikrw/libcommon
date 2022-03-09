package com.serenegiant.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J*\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020\bH\u0016J\b\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\'\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0018\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020\u0018H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/serenegiant/widget/SimpleCameraGLView;", "Lcom/serenegiant/widget/AspectScaledGLView;", "Lcom/serenegiant/widget/ICameraView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCameraDelegator", "Lcom/serenegiant/widget/CameraDelegator;", "mDrawer", "Lcom/serenegiant/glutils/GLDrawer2D;", "mRequestUpdateTex", "", "mSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "mSync", "", "mTexId", "mTexMatrix", "", "addListener", "", "listener", "Lcom/serenegiant/widget/CameraDelegator$OnFrameAvailableListener;", "addSurface", "id", "surface", "isRecordable", "maxFps", "Lcom/serenegiant/math/Fraction;", "getVideoHeight", "getVideoWidth", "isRecordingSupported", "onPause", "onResume", "removeListener", "removeSurface", "setVideoSize", "width", "height", "updateViewport", "Companion", "app_debug"})
public final class SimpleCameraGLView extends com.serenegiant.widget.AspectScaledGLView implements com.serenegiant.widget.ICameraView {
    private final java.lang.Object mSync = null;
    private final com.serenegiant.widget.CameraDelegator mCameraDelegator = null;
    private final float[] mTexMatrix = null;
    private com.serenegiant.glutils.GLDrawer2D mDrawer;
    private int mTexId = 0;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    @kotlin.jvm.Volatile()
    private volatile boolean mRequestUpdateTex = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.widget.SimpleCameraGLView.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    
    @kotlin.jvm.JvmOverloads()
    public SimpleCameraGLView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SimpleCameraGLView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SimpleCameraGLView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    /**
     * ICameraViewの実装
     */
    @java.lang.Override()
    public void onResume() {
    }
    
    /**
     * ICameraViewの実装
     */
    @java.lang.Override()
    public void onPause() {
    }
    
    /**
     * ICameraViewの実装
     * @param width
     * @param height
     */
    @java.lang.Override()
    public void setVideoSize(int width, int height) {
    }
    
    /**
     * ICameraViewの実装
     * @param listener
     */
    @java.lang.Override()
    public void addListener(@org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener) {
    }
    
    /**
     * ICameraViewの実装
     * @param listener
     */
    @java.lang.Override()
    public void removeListener(@org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener) {
    }
    
    /**
     * ICameraViewの実装
     * @return
     */
    @java.lang.Override()
    public int getVideoWidth() {
        return 0;
    }
    
    /**
     * ICameraViewの実装
     * @return
     */
    @java.lang.Override()
    public int getVideoHeight() {
        return 0;
    }
    
    @java.lang.Override()
    public void addSurface(int id, @org.jetbrains.annotations.NotNull()
    java.lang.Object surface, boolean isRecordable, @org.jetbrains.annotations.Nullable()
    com.serenegiant.math.Fraction maxFps) {
    }
    
    @java.lang.Override()
    public void removeSurface(int id) {
    }
    
    @java.lang.Override()
    public boolean isRecordingSupported() {
        return false;
    }
    
    private final void updateViewport() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/serenegiant/widget/SimpleCameraGLView$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}