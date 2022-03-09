package com.serenegiant.widget;

import java.lang.System;

/**
 * SurfaceDrawableを使ってカメラ映像を表示するImageView実装
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J*\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u0017J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u000fH\u0016J\u0016\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\b\u0010&\u001a\u00020\u000fH\u0016J\u0010\u0010\'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010(\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\bH\u0016J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/serenegiant/widget/CameraImageView;", "Lcom/serenegiant/widget/ZoomImageView;", "Lcom/serenegiant/widget/ICameraView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCameraDelegator", "Lcom/serenegiant/widget/CameraDelegator;", "mDrawable", "Lcom/serenegiant/graphics/SurfaceDrawable;", "addListener", "", "listener", "Lcom/serenegiant/widget/CameraDelegator$OnFrameAvailableListener;", "addSurface", "id", "surface", "", "isRecordable", "", "maxFps", "Lcom/serenegiant/math/Fraction;", "getInputSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "getVideoHeight", "getVideoWidth", "getView", "Landroid/view/View;", "hasSurface", "isRecordingSupported", "onPause", "onPreviewSizeChanged", "width", "height", "onResume", "removeListener", "removeSurface", "setScaleMode", "mode", "setVideoSize", "Companion", "app_debug"})
public final class CameraImageView extends com.serenegiant.widget.ZoomImageView implements com.serenegiant.widget.ICameraView {
    private final com.serenegiant.widget.CameraDelegator mCameraDelegator = null;
    private final com.serenegiant.graphics.SurfaceDrawable mDrawable = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.widget.CameraImageView.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    
    @kotlin.jvm.JvmOverloads()
    public CameraImageView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CameraImageView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CameraImageView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void setVideoSize(int width, int height) {
    }
    
    @java.lang.Override()
    public void addListener(@org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener) {
    }
    
    @java.lang.Override()
    public void removeListener(@org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener) {
    }
    
    @java.lang.Override()
    public void setScaleMode(int mode) {
    }
    
    @java.lang.Override()
    public int getVideoWidth() {
        return 0;
    }
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.SurfaceTexture getInputSurfaceTexture() {
        return null;
    }
    
    public final boolean hasSurface() {
        return false;
    }
    
    public final void onPreviewSizeChanged(int width, int height) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/serenegiant/widget/CameraImageView$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}