package com.serenegiant.widget;

import java.lang.System;

/**
 * カメラ映像をIRendererHolder経由で取得してプレビュー表示するためのGLSurfaceView実装
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000223B\u001d\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\"\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u000fH$J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\tH\u0016J\b\u0010\'\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u0016H\u0016J\b\u0010,\u001a\u00020\u0016H\u0016J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010.\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\tH\u0016J\u0018\u00101\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0016R\u0014\u0010\b\u001a\u00020\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u0084\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u00064"}, d2 = {"Lcom/serenegiant/widget/AbstractCameraGLSurfaceView;", "Landroid/opengl/GLSurfaceView;", "Lcom/serenegiant/widget/ICameraView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "glVersion", "", "getGlVersion", "()I", "mCameraDelegator", "Lcom/serenegiant/widget/CameraDelegator;", "mRenderHolderCallback", "Lcom/serenegiant/glutils/IRendererHolder$RenderHolderCallback;", "<set-?>", "Lcom/serenegiant/glutils/IRendererHolder;", "rendererHolder", "getRendererHolder", "()Lcom/serenegiant/glutils/IRendererHolder;", "addListener", "", "listener", "Lcom/serenegiant/widget/CameraDelegator$OnFrameAvailableListener;", "addSurface", "id", "surface", "", "isRecordable", "", "maxFps", "Lcom/serenegiant/math/Fraction;", "createRendererHolder", "width", "height", "callback", "getScaleMode", "getVideoHeight", "getVideoWidth", "getView", "Landroid/view/View;", "isRecordingSupported", "onPause", "onResume", "removeListener", "removeSurface", "setScaleMode", "mode", "setVideoSize", "CameraRenderer", "Companion", "app_debug"})
public abstract class AbstractCameraGLSurfaceView extends android.opengl.GLSurfaceView implements com.serenegiant.widget.ICameraView {
    private final int glVersion = 0;
    private final com.serenegiant.widget.CameraDelegator mCameraDelegator = null;
    
    /**
     * 子クラスからIRendererHolderへアクセスできるように
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    private com.serenegiant.glutils.IRendererHolder rendererHolder;
    
    /**
     * IRendererからのコールバックリスナーを実装
     */
    private final com.serenegiant.glutils.IRendererHolder.RenderHolderCallback mRenderHolderCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.widget.AbstractCameraGLSurfaceView.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    
    @kotlin.jvm.JvmOverloads()
    public AbstractCameraGLSurfaceView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AbstractCameraGLSurfaceView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    protected final int getGlVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.serenegiant.glutils.IRendererHolder getRendererHolder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView() {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void onResume() {
    }
    
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void onPause() {
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
    public int getScaleMode() {
        return 0;
    }
    
    @java.lang.Override()
    public void setVideoSize(int width, int height) {
    }
    
    @java.lang.Override()
    public int getVideoWidth() {
        return 0;
    }
    
    @java.lang.Override()
    public int getVideoHeight() {
        return 0;
    }
    
    /**
     * プレビュー表示用Surfaceを追加
     * @param id
     * @param surface
     * @param isRecordable
     */
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void addSurface(int id, @org.jetbrains.annotations.NotNull()
    java.lang.Object surface, boolean isRecordable, @org.jetbrains.annotations.Nullable()
    com.serenegiant.math.Fraction maxFps) {
    }
    
    /**
     * プレビュー表示用Surfaceを除去
     * @param id
     */
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void removeSurface(int id) {
    }
    
    @java.lang.Override()
    public boolean isRecordingSupported() {
        return false;
    }
    
    /**
     * IRendererHolderを生成
     * @param width
     * @param height
     * @param callback
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    protected abstract com.serenegiant.glutils.IRendererHolder createRendererHolder(int width, int height, @org.jetbrains.annotations.Nullable()
    com.serenegiant.glutils.IRendererHolder.RenderHolderCallback callback);
    
    /**
     * GLSurfaceViewのRenderer
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J \u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020\u0015J\u0006\u0010\"\u001a\u00020\u0015J\u0006\u0010#\u001a\u00020\u0015J\u0006\u0010$\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/serenegiant/widget/AbstractCameraGLSurfaceView$CameraRenderer;", "Lcom/serenegiant/widget/CameraDelegator$ICameraRenderer;", "Landroid/opengl/GLSurfaceView$Renderer;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "(Lcom/serenegiant/widget/AbstractCameraGLSurfaceView;)V", "cnt", "", "hTex", "inputSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "mDrawer", "Lcom/serenegiant/glutils/GLDrawer2D;", "mHasSurface", "", "mMvpMatrix", "", "mStMatrix", "requestUpdateTex", "getInputSurface", "hasSurface", "onDrawFrame", "", "unused", "Ljavax/microedition/khronos/opengles/GL10;", "onFrameAvailable", "st", "onPreviewSizeChanged", "width", "height", "onSurfaceChanged", "onSurfaceCreated", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "onSurfaceDestroyed", "release", "updateViewport", "updateViewportOnGLThread", "app_debug"})
    final class CameraRenderer implements com.serenegiant.widget.CameraDelegator.ICameraRenderer, android.opengl.GLSurfaceView.Renderer, android.graphics.SurfaceTexture.OnFrameAvailableListener {
        private android.graphics.SurfaceTexture inputSurfaceTexture;
        private int hTex = 0;
        private com.serenegiant.glutils.GLDrawer2D mDrawer;
        private final float[] mStMatrix = null;
        private final float[] mMvpMatrix = null;
        private boolean mHasSurface = false;
        @kotlin.jvm.Volatile()
        private volatile boolean requestUpdateTex = false;
        private int cnt = 0;
        
        public CameraRenderer() {
            super();
        }
        
        @java.lang.Override()
        public void onSurfaceCreated(@org.jetbrains.annotations.NotNull()
        javax.microedition.khronos.opengles.GL10 unused, @org.jetbrains.annotations.NotNull()
        javax.microedition.khronos.egl.EGLConfig config) {
        }
        
        @java.lang.Override()
        public void onSurfaceChanged(@org.jetbrains.annotations.NotNull()
        javax.microedition.khronos.opengles.GL10 unused, int width, int height) {
        }
        
        /**
         * when GLSurface context is soon destroyed
         */
        public final void onSurfaceDestroyed() {
        }
        
        @java.lang.Override()
        public boolean hasSurface() {
            return false;
        }
        
        @java.lang.Override()
        public void onPreviewSizeChanged(int width, int height) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.graphics.SurfaceTexture getInputSurface() {
            return null;
        }
        
        public final void release() {
        }
        
        /**
         * drawing to GLSurface
         * we set renderMode to GLSurfaceView.RENDERMODE_WHEN_DIRTY,
         * this method is only called when #requestRender is called(= when texture is required to update)
         * if you don't set RENDERMODE_WHEN_DIRTY, this method is called at maximum 60fps
         */
        @java.lang.Override()
        public void onDrawFrame(@org.jetbrains.annotations.NotNull()
        javax.microedition.khronos.opengles.GL10 unused) {
        }
        
        public final void updateViewport() {
        }
        
        public final void updateViewportOnGLThread() {
        }
        
        /**
         * OnFrameAvailableListenerインターフェースの実装
         * @param st
         */
        @java.lang.Override()
        public void onFrameAvailable(@org.jetbrains.annotations.NotNull()
        android.graphics.SurfaceTexture st) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/serenegiant/widget/AbstractCameraGLSurfaceView$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}