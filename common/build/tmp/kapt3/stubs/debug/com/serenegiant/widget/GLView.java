package com.serenegiant.widget;

import java.lang.System;

/**
 * SurfaceViewのSurfaceへOpenGL|ESで描画するためのヘルパークラス
 * SurfaceViewを継承
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0016\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002;<B\'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u0017H\u0005J\b\u0010\u001e\u001a\u00020\u001cH\u0005J\b\u0010\u001f\u001a\u00020\rH\u0007J\b\u0010 \u001a\u00020\u0011H\u0007J\u0014\u0010!\u001a\u00020\u00172\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0017J\b\u0010\"\u001a\u00020#H\u0017J\b\u0010$\u001a\u00020\u0015H\u0007J\b\u0010%\u001a\u00020\u0015H\u0007J\b\u0010&\u001a\u00020\u0015H\u0007J\b\u0010\'\u001a\u00020\u001cH\u0005J\b\u0010(\u001a\u00020\u001cH\u0014J \u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0005J\b\u0010-\u001a\u00020\u001cH\u0005J\b\u0010.\u001a\u00020\u001cH\u0005J\u0010\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u000201H\u0007J\u0018\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0007J\u0010\u00104\u001a\u00020\u001c2\u0006\u00100\u001a\u000201H\u0007J\u0012\u00105\u001a\u00020\u001c2\b\u00106\u001a\u0004\u0018\u00010\u0013H\u0007J\u0014\u00107\u001a\u00020\u001c2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0017J(\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/serenegiant/widget/GLView;", "Landroid/view/SurfaceView;", "Lcom/serenegiant/widget/IGLTransformView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mChoreographerCallback", "Landroid/view/Choreographer$FrameCallback;", "mGLContext", "Lcom/serenegiant/glutils/GLContext;", "mGLHandler", "Landroid/os/Handler;", "mGLManager", "Lcom/serenegiant/glutils/GLManager;", "mGLRenderer", "Lcom/serenegiant/widget/GLView$GLRenderer;", "mHasSurface", "", "mMatrix", "", "mMatrixChanged", "mTarget", "Lcom/serenegiant/glutils/ISurface;", "applyTransformMatrix", "", "transform", "drawFrame", "getGLContext", "getGLManager", "getTransform", "getView", "Landroid/view/View;", "isGLES3", "isOES3", "isOES3Supported", "makeDefault", "onDetachedFromWindow", "onSurfaceChanged", "format", "width", "height", "onSurfaceCreated", "onSurfaceDestroyed", "queueEvent", "task", "Ljava/lang/Runnable;", "delayMs", "", "removeEvent", "setRenderer", "renderer", "setTransform", "setViewport", "x", "y", "Companion", "GLRenderer", "common_debug"})
public class GLView extends android.view.SurfaceView implements com.serenegiant.widget.IGLTransformView {
    private final com.serenegiant.glutils.GLManager mGLManager = null;
    private final com.serenegiant.glutils.GLContext mGLContext = null;
    private final android.os.Handler mGLHandler = null;
    @kotlin.jvm.Volatile()
    private volatile boolean mHasSurface = false;
    
    /**
     * SurfaceViewのSurfaceへOpenGL|ESで描画するためのISurfaceインスタンス
     */
    private com.serenegiant.glutils.ISurface mTarget;
    private final float[] mMatrix = null;
    private boolean mMatrixChanged = false;
    private com.serenegiant.widget.GLView.GLRenderer mGLRenderer;
    
    /**
     * Choreographerを使ったvsync同期用描画のFrameCallback実装
     */
    private android.view.Choreographer.FrameCallback mChoreographerCallback;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.widget.GLView.Companion Companion = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    
    @kotlin.jvm.JvmOverloads()
    public GLView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public GLView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public GLView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    /**
     * OpenGL|ES3.xが使用可能かどうかを取得
     */
    @androidx.annotation.AnyThread()
    public final boolean isGLES3() {
        return false;
    }
    
    /**
     * OpenGL|ES3.xが使用可能＆GLES3の外部テクスチャを使用可能かどうかどうかを取得
     */
    @androidx.annotation.AnyThread()
    @java.lang.Deprecated()
    public final boolean isOES3() {
        return false;
    }
    
    @androidx.annotation.AnyThread()
    public final boolean isOES3Supported() {
        return false;
    }
    
    /**
     * 内部使用のGLManagerインスタンスを取得
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.AnyThread()
    public final com.serenegiant.glutils.GLManager getGLManager() {
        return null;
    }
    
    /**
     * 内部使用のGLContextを取得
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.AnyThread()
    public final com.serenegiant.glutils.GLContext getGLContext() {
        return null;
    }
    
    /**
     * GLRendererをセット
     */
    @androidx.annotation.AnyThread()
    public final void setRenderer(@org.jetbrains.annotations.Nullable()
    com.serenegiant.widget.GLView.GLRenderer renderer) {
    }
    
    /**
     * Viewportを設定
     * @param x
     * @param y
     * @param width
     * @param height
     */
    @androidx.annotation.AnyThread()
    public final void setViewport(int x, int y, int width, int height) {
    }
    
    /**
     * EGL/GLコンテキストを保持しているワーカースレッド上で実行要求する
     */
    @androidx.annotation.AnyThread()
    public final void queueEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable task) {
    }
    
    /**
     * EGL/GLコンテキストを保持しているワーカースレッド上で実行要求する
     */
    @androidx.annotation.AnyThread()
    public final void queueEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable task, long delayMs) {
    }
    
    /**
     * EGL/GLコンテキストを保持しているワーカースレッド上で実行待ちしていれば実行待ちを解除する
     */
    @androidx.annotation.AnyThread()
    public final void removeEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable task) {
    }
    
    /**
     * IGLTransformViewの実装
     */
    @androidx.annotation.AnyThread()
    @java.lang.Override()
    public void setTransform(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(min = 16L)
    float[] transform) {
    }
    
    /**
     * IGLTransformViewの実装
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.AnyThread()
    @java.lang.Override()
    public float[] getTransform(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(min = 16L)
    float[] transform) {
        return null;
    }
    
    /**
     * IGLTransformViewの実装
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.AnyThread()
    @java.lang.Override()
    public android.view.View getView() {
        return null;
    }
    
    /**
     * デフォルトのレンダリングコンテキストへ切り返る
     * Surfaceが有効であればそのサーフェースへの描画コンテキスト
     * Surfaceが無効であればEGL/GLコンテキスト保持用のオフスクリーンへの描画コンテキストになる
     */
    @androidx.annotation.WorkerThread()
    protected final void makeDefault() {
    }
    
    /**
     * Surfaceが生成された時
     * EGL/GLコンテキストを保持しているワーカースレッド上で実行される
     */
    @androidx.annotation.CallSuper()
    @androidx.annotation.WorkerThread()
    protected final void onSurfaceCreated() {
    }
    
    /**
     * Surfaceのサイズが変更された
     * EGL/GLコンテキストを保持しているワーカースレッド上で実行される
     */
    @androidx.annotation.CallSuper()
    @androidx.annotation.WorkerThread()
    protected final void onSurfaceChanged(int format, int width, int height) {
    }
    
    /**
     * 描画イベント
     * EGL/GLコンテキストを保持しているワーカースレッド上で実行される
     */
    @androidx.annotation.WorkerThread()
    protected final void drawFrame() {
    }
    
    /**
     * Surfaceが破棄された
     * EGL/GLコンテキストを保持しているワーカースレッド上で実行される
     */
    @androidx.annotation.CallSuper()
    @androidx.annotation.WorkerThread()
    protected final void onSurfaceDestroyed() {
    }
    
    /**
     * トランスフォームマトリックスを適用
     */
    @androidx.annotation.CallSuper()
    @androidx.annotation.WorkerThread()
    protected final void applyTransformMatrix(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 16L)
    float[] transform) {
    }
    
    /**
     * GLスレッド上での処理
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\'J\b\u0010\f\u001a\u00020\u0003H\'J\b\u0010\r\u001a\u00020\u0003H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/serenegiant/widget/GLView$GLRenderer;", "", "applyTransformMatrix", "", "transform", "", "drawFrame", "onSurfaceChanged", "format", "", "width", "height", "onSurfaceCreated", "onSurfaceDestroyed", "common_debug"})
    public static abstract interface GLRenderer {
        
        /**
         * Surfaceが生成された時
         * EGL/GLコンテキストを保持しているワーカースレッド上で実行される
         */
        @androidx.annotation.WorkerThread()
        public abstract void onSurfaceCreated();
        
        /**
         * Surfaceのサイズが変更された
         * EGL/GLコンテキストを保持しているワーカースレッド上で実行される
         */
        @androidx.annotation.WorkerThread()
        public abstract void onSurfaceChanged(int format, int width, int height);
        
        /**
         * トランスフォームマトリックスを適用
         */
        @androidx.annotation.WorkerThread()
        public abstract void applyTransformMatrix(@org.jetbrains.annotations.NotNull()
        @androidx.annotation.Size(min = 16L)
        float[] transform);
        
        /**
         * 描画イベント
         * EGL/GLコンテキストを保持しているワーカースレッド上で実行される
         */
        @androidx.annotation.WorkerThread()
        public abstract void drawFrame();
        
        /**
         * Surfaceが破棄された
         * EGL/GLコンテキストを保持しているワーカースレッド上で実行される
         */
        @androidx.annotation.WorkerThread()
        public abstract void onSurfaceDestroyed();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/serenegiant/widget/GLView$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}