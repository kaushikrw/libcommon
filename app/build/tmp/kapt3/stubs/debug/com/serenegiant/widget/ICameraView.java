package com.serenegiant.widget;

import java.lang.System;

/**
 * CameraDelegatorの親Viewがサポートしないといけないインターフェースメソッド
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\bH&J\b\u0010\u000f\u001a\u00020\bH&J\b\u0010\u0010\u001a\u00020\bH&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u000bH&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\bH&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH&\u00a8\u0006\u001d"}, d2 = {"Lcom/serenegiant/widget/ICameraView;", "", "addListener", "", "listener", "Lcom/serenegiant/widget/CameraDelegator$OnFrameAvailableListener;", "addSurface", "id", "", "surface", "isRecordable", "", "maxFps", "Lcom/serenegiant/math/Fraction;", "getScaleMode", "getVideoHeight", "getVideoWidth", "getView", "Landroid/view/View;", "isRecordingSupported", "onPause", "onResume", "removeListener", "removeSurface", "setScaleMode", "mode", "setVideoSize", "width", "height", "app_debug"})
public abstract interface ICameraView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getView();
    
    public abstract void onResume();
    
    public abstract void onPause();
    
    public abstract void setVideoSize(int width, int height);
    
    public abstract void addListener(@org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener);
    
    public abstract void removeListener(@org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener);
    
    public abstract int getScaleMode();
    
    public abstract void setScaleMode(int mode);
    
    public abstract int getVideoWidth();
    
    public abstract int getVideoHeight();
    
    public abstract void addSurface(int id, @org.jetbrains.annotations.NotNull()
    java.lang.Object surface, boolean isRecordable, @org.jetbrains.annotations.Nullable()
    com.serenegiant.math.Fraction maxFps);
    
    public abstract void removeSurface(int id);
    
    public abstract boolean isRecordingSupported();
    
    /**
     * CameraDelegatorの親Viewがサポートしないといけないインターフェースメソッド
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}