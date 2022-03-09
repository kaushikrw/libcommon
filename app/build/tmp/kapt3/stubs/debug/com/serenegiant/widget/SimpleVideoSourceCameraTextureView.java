package com.serenegiant.widget;

import java.lang.System;

/**
 * VideoSourceを使ってカメラ映像を受け取りSurfacePipelineで描画処理を行うZoomAspectScaledTextureView/ICameraView実装
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001GB\'\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0016J*\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001c\u00101\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0018\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0002J\b\u00105\u001a\u000206H\u0014J\b\u00107\u001a\u00020\u001dH\u0016J\b\u00108\u001a\u00020\tH\u0016J\b\u00109\u001a\u00020\tH\u0016J\b\u0010:\u001a\u00020\tH\u0016J\b\u0010;\u001a\u00020<H\u0016J\u0006\u0010=\u001a\u00020\u0011J\b\u0010>\u001a\u00020\u0011H\u0016J\b\u0010?\u001a\u00020$H\u0014J\b\u0010@\u001a\u00020$H\u0016J\b\u0010A\u001a\u00020$H\u0016J\u0010\u0010B\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010C\u001a\u00020$2\u0006\u0010+\u001a\u00020\tH\u0016J\u0010\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020\tH\u0016J\u0018\u0010F\u001a\u00020$2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0016R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000f\u00a8\u0006H"}, d2 = {"Lcom/serenegiant/widget/SimpleVideoSourceCameraTextureView;", "Lcom/serenegiant/widget/ZoomAspectScaledTextureView;", "Lcom/serenegiant/widget/ICameraView;", "Lcom/serenegiant/widget/IPipelineView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "effect", "getEffect", "()I", "setEffect", "(I)V", "enableFaceDetect", "", "getEnableFaceDetect", "()Z", "setEnableFaceDetect", "(Z)V", "mCameraDelegator", "Lcom/serenegiant/widget/CameraDelegator;", "mGLContext", "Lcom/serenegiant/glutils/GLContext;", "mGLHandler", "Landroid/os/Handler;", "mGLManager", "Lcom/serenegiant/glutils/GLManager;", "mVideoSource", "Lcom/serenegiant/glpipeline/VideoSource;", "pipelineMode", "getPipelineMode", "setPipelineMode", "addListener", "", "listener", "Lcom/serenegiant/widget/CameraDelegator$OnFrameAvailableListener;", "addPipeline", "pipeline", "Lcom/serenegiant/glpipeline/IPipeline;", "addSurface", "id", "surface", "", "isRecordable", "maxFps", "Lcom/serenegiant/math/Fraction;", "createPipeline", "createVideoSource", "width", "height", "getContentBounds", "Landroid/graphics/RectF;", "getGLManager", "getScaleMode", "getVideoHeight", "getVideoWidth", "getView", "Landroid/view/View;", "isEffectSupported", "isRecordingSupported", "onDetachedFromWindow", "onPause", "onResume", "removeListener", "removeSurface", "setScaleMode", "mode", "setVideoSize", "Companion", "app_debug"})
public final class SimpleVideoSourceCameraTextureView extends com.serenegiant.widget.ZoomAspectScaledTextureView implements com.serenegiant.widget.ICameraView, com.serenegiant.widget.IPipelineView {
    private final com.serenegiant.glutils.GLManager mGLManager = null;
    private final com.serenegiant.glutils.GLContext mGLContext = null;
    private final android.os.Handler mGLHandler = null;
    private final com.serenegiant.widget.CameraDelegator mCameraDelegator = null;
    private com.serenegiant.glpipeline.VideoSource mVideoSource;
    private int pipelineMode = 0;
    private boolean enableFaceDetect = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.widget.SimpleVideoSourceCameraTextureView.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    
    /**
     * 共有GLコンテキストコンテキストを使ったマルチスレッド処理を行うかどうか
     */
    private static final boolean USE_SHARED_CONTEXT = false;
    private static final boolean SUPPORT_RECORDING = true;
    
    @kotlin.jvm.JvmOverloads()
    public SimpleVideoSourceCameraTextureView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SimpleVideoSourceCameraTextureView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SimpleVideoSourceCameraTextureView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final int getPipelineMode() {
        return 0;
    }
    
    public final void setPipelineMode(int p0) {
    }
    
    public final boolean getEnableFaceDetect() {
        return false;
    }
    
    public final void setEnableFaceDetect(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
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
    public int getScaleMode() {
        return 0;
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
    
    /**
     * IPipelineViewの実装
     * @param pipeline
     */
    @java.lang.Override()
    public void addPipeline(@org.jetbrains.annotations.NotNull()
    com.serenegiant.glpipeline.IPipeline pipeline) {
    }
    
    /**
     * IPipelineViewの実装
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.serenegiant.glutils.GLManager getGLManager() {
        return null;
    }
    
    public final boolean isEffectSupported() {
        return false;
    }
    
    public final int getEffect() {
        return 0;
    }
    
    public final void setEffect(int effect) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.graphics.RectF getContentBounds() {
        return null;
    }
    
    /**
     * VideoSourceインスタンスを生成
     * @param width
     * @param height
     * @return
     */
    private final com.serenegiant.glpipeline.VideoSource createVideoSource(int width, int height) {
        return null;
    }
    
    /**
     * IPipelineインスタンスを生成
     * @param surface
     */
    private final com.serenegiant.glpipeline.IPipeline createPipeline(java.lang.Object surface, com.serenegiant.math.Fraction maxFps) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/serenegiant/widget/SimpleVideoSourceCameraTextureView$Companion;", "", "()V", "DEBUG", "", "SUPPORT_RECORDING", "TAG", "", "kotlin.jvm.PlatformType", "USE_SHARED_CONTEXT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}