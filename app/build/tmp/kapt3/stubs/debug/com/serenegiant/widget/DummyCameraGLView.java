package com.serenegiant.widget;

import java.lang.System;

/**
 * カメラからの映像の代わりに静止画をプレビュー表示するためのICameraView実装
 * GLViewを継承
 * XXX useSharedContext = trueで共有コンテキストを使ったマルチスレッド処理を有効にするとGPUのドライバー内でクラッシュする端末がある
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\'\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J*\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\tH\u0016J\b\u0010\'\u001a\u00020\tH\u0016J\u0018\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0015H\u0003J\b\u0010+\u001a\u00020\u0011H\u0016J\b\u0010,\u001a\u00020\u0019H\u0016J\b\u0010-\u001a\u00020\u0019H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\tH\u0016J\u0018\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0016R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/serenegiant/widget/DummyCameraGLView;", "Lcom/serenegiant/widget/AspectScaledGLView;", "Lcom/serenegiant/widget/ICameraView;", "Lcom/serenegiant/widget/IPipelineView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cnt2", "mDistributor", "Lcom/serenegiant/glpipeline/Distributor;", "mDrawer", "Lcom/serenegiant/glutils/GLDrawer2D;", "mHasSurface", "", "mImageSource", "Lcom/serenegiant/glpipeline/ImageSource;", "mMvpMatrix", "", "mOnFrameAvailableListener", "Lcom/serenegiant/widget/CameraDelegator$OnFrameAvailableListener;", "addListener", "", "listener", "addPipeline", "pipeline", "Lcom/serenegiant/glpipeline/IPipeline;", "addSurface", "id", "surface", "", "isRecordable", "maxFps", "Lcom/serenegiant/math/Fraction;", "getScaleMode", "getVideoHeight", "getVideoWidth", "handleDraw", "texId", "texMatrix", "isRecordingSupported", "onPause", "onResume", "removeListener", "removeSurface", "setScaleMode", "mode", "setVideoSize", "width", "height", "Companion", "app_debug"})
public final class DummyCameraGLView extends com.serenegiant.widget.AspectScaledGLView implements com.serenegiant.widget.ICameraView, com.serenegiant.widget.IPipelineView {
    private com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener mOnFrameAvailableListener;
    private com.serenegiant.glpipeline.ImageSource mImageSource;
    private com.serenegiant.glpipeline.Distributor mDistributor;
    private final float[] mMvpMatrix = null;
    @kotlin.jvm.Volatile()
    private volatile boolean mHasSurface = false;
    private com.serenegiant.glutils.GLDrawer2D mDrawer;
    private int cnt2 = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.widget.DummyCameraGLView.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    
    /**
     * 共有GLコンテキストコンテキストを使ったマルチスレッド処理を行うかどうか
     */
    private static final boolean USE_SHARED_CONTEXT = false;
    
    @kotlin.jvm.JvmOverloads()
    public DummyCameraGLView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public DummyCameraGLView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public DummyCameraGLView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    /**
     * ICameraViewの実装
     */
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void onResume() {
    }
    
    /**
     * ICameraViewの実装
     */
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void onPause() {
    }
    
    /**
     * ICameraViewの実装
     */
    @java.lang.Override()
    public void addListener(@org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener) {
    }
    
    /**
     * ICameraViewの実装
     */
    @java.lang.Override()
    public void removeListener(@org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener) {
    }
    
    /**
     * ICameraViewの実装
     */
    @java.lang.Override()
    public void setScaleMode(int mode) {
    }
    
    /**
     * ICameraViewの実装
     */
    @java.lang.Override()
    public int getScaleMode() {
        return 0;
    }
    
    /**
     * ICameraViewの実装
     */
    @java.lang.Override()
    public void setVideoSize(int width, int height) {
    }
    
    /**
     * ICameraViewの実装
     */
    @java.lang.Override()
    public int getVideoWidth() {
        return 0;
    }
    
    /**
     * ICameraViewの実装
     */
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
     * IPipelineViewの実装
     */
    @java.lang.Override()
    public void addPipeline(@org.jetbrains.annotations.NotNull()
    com.serenegiant.glpipeline.IPipeline pipeline) {
    }
    
    /**
     * 描画処理の実体
     * レンダリングスレッド上で実行
     * @param texId
     * @param texMatrix
     */
    @androidx.annotation.WorkerThread()
    private final void handleDraw(int texId, float[] texMatrix) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/serenegiant/widget/DummyCameraGLView$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "USE_SHARED_CONTEXT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}