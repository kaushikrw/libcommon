package com.serenegiant.widget;

import java.lang.System;

/**
 * Sub class of GLSurfaceView to display camera preview and write video frame to capturing surface
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/serenegiant/widget/EffectCameraGLSurfaceView;", "Lcom/serenegiant/widget/AbstractCameraGLSurfaceView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "effect", "", "getEffect", "()I", "setEffect", "(I)V", "createRendererHolder", "Lcom/serenegiant/glutils/IRendererHolder;", "width", "height", "callback", "Lcom/serenegiant/glutils/IRendererHolder$RenderHolderCallback;", "Companion", "app_debug"})
public final class EffectCameraGLSurfaceView extends com.serenegiant.widget.AbstractCameraGLSurfaceView {
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.widget.EffectCameraGLSurfaceView.Companion Companion = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    
    @kotlin.jvm.JvmOverloads()
    public EffectCameraGLSurfaceView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public EffectCameraGLSurfaceView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    public final int getEffect() {
        return 0;
    }
    
    public final void setEffect(int effect) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.serenegiant.glutils.IRendererHolder createRendererHolder(int width, int height, @org.jetbrains.annotations.Nullable()
    com.serenegiant.glutils.IRendererHolder.RenderHolderCallback callback) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/serenegiant/widget/EffectCameraGLSurfaceView$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}