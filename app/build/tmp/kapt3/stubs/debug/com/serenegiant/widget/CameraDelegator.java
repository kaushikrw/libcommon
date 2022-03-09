package com.serenegiant.widget;

import java.lang.System;

/**
 * カメラプレビュー処理の委譲クラス
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 72\u00020\u0001:\u0003789B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0016J\u0006\u0010,\u001a\u00020*J\b\u0010-\u001a\u00020*H\u0004J\u0018\u0010.\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0003J\b\u0010/\u001a\u00020*H\u0003J\u0006\u00100\u001a\u00020*J\u0006\u00101\u001a\u00020*J\u0006\u00102\u001a\u00020*J\u000e\u00103\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0016J\u0016\u00104\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u00105\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u00106\u001a\u00020*R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u001e\u0010 \u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001e\u0010\"\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR$\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\u001d\"\u0004\b\'\u0010(\u00a8\u0006:"}, d2 = {"Lcom/serenegiant/widget/CameraDelegator;", "", "view", "Landroid/view/View;", "width", "", "height", "cameraRenderer", "Lcom/serenegiant/widget/CameraDelegator$ICameraRenderer;", "(Landroid/view/View;IILcom/serenegiant/widget/CameraDelegator$ICameraRenderer;)V", "getCameraRenderer", "()Lcom/serenegiant/widget/CameraDelegator$ICameraRenderer;", "<set-?>", "", "isPreviewing", "()Z", "mCamera", "Landroid/hardware/Camera;", "mCameraHandler", "Landroid/os/Handler;", "mListeners", "", "Lcom/serenegiant/widget/CameraDelegator$OnFrameAvailableListener;", "mResumed", "mScaleMode", "mSync", "mView", "previewHeight", "getPreviewHeight", "()I", "previewWidth", "getPreviewWidth", "requestHeight", "getRequestHeight", "requestWidth", "getRequestWidth", "mode", "scaleMode", "getScaleMode", "setScaleMode", "(I)V", "addListener", "", "listener", "callOnFrameAvailable", "finalize", "handleStartPreview", "handleStopPreview", "onPause", "onResume", "release", "removeListener", "setVideoSize", "startPreview", "stopPreview", "Companion", "ICameraRenderer", "OnFrameAvailableListener", "app_debug"})
public final class CameraDelegator {
    private final android.view.View mView = null;
    private final java.lang.Object mSync = null;
    @org.jetbrains.annotations.NotNull()
    private final com.serenegiant.widget.CameraDelegator.ICameraRenderer cameraRenderer = null;
    private final java.util.Set<com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener> mListeners = null;
    private android.os.Handler mCameraHandler;
    
    /**
     * カメラ映像幅を取得
     * @return
     */
    private int requestWidth;
    
    /**
     * カメラ映像高さを取得
     * @return
     */
    private int requestHeight;
    private int previewWidth;
    private int previewHeight;
    private boolean isPreviewing;
    private int mScaleMode = 0;
    private android.hardware.Camera mCamera;
    @kotlin.jvm.Volatile()
    private volatile boolean mResumed = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.widget.CameraDelegator.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    public static final int SCALE_STRETCH_FIT = 0;
    public static final int SCALE_KEEP_ASPECT_VIEWPORT = 1;
    public static final int SCALE_KEEP_ASPECT = 2;
    public static final int SCALE_CROP_CENTER = 3;
    public static final int DEFAULT_PREVIEW_WIDTH = 1280;
    public static final int DEFAULT_PREVIEW_HEIGHT = 720;
    private static final int TARGET_FPS_MS = 60000;
    
    public CameraDelegator(@org.jetbrains.annotations.NotNull()
    android.view.View view, int width, int height, @org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.ICameraRenderer cameraRenderer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.serenegiant.widget.CameraDelegator.ICameraRenderer getCameraRenderer() {
        return null;
    }
    
    public final int getRequestWidth() {
        return 0;
    }
    
    public final int getRequestHeight() {
        return 0;
    }
    
    public final int getPreviewWidth() {
        return 0;
    }
    
    public final int getPreviewHeight() {
        return 0;
    }
    
    public final boolean isPreviewing() {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    protected final void finalize() throws java.lang.Throwable {
    }
    
    /**
     * 関連するリソースを廃棄する
     */
    public final void release() {
    }
    
    /**
     * GLSurfaceView#onResumeが呼ばれたときの処理
     */
    public final void onResume() {
    }
    
    /**
     * GLSurfaceView#onPauseが呼ばれたときの処理
     */
    public final void onPause() {
    }
    
    /**
     * 映像が更新されたときのコールバックリスナーを登録
     * @param listener
     */
    public final void addListener(@org.jetbrains.annotations.Nullable()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener) {
    }
    
    /**
     * 映像が更新されたときのコールバックリスナーの登録を解除
     * @param listener
     */
    public final void removeListener(@org.jetbrains.annotations.NotNull()
    com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener listener) {
    }
    
    /**
     * 映像が更新されたときのコールバックを呼び出す
     */
    public final void callOnFrameAvailable() {
    }
    
    /**
     * 現在のスケールモードを取得
     * @return
     */
    public final int getScaleMode() {
        return 0;
    }
    
    /**
     * スケールモードをセット
     * @param mode
     */
    public final void setScaleMode(int mode) {
    }
    
    /**
     * カメラ映像サイズを変更要求
     * @param width
     * @param height
     */
    public final void setVideoSize(int width, int height) {
    }
    
    /**
     * プレビュー開始
     * @param width
     * @param height
     */
    public final void startPreview(int width, int height) {
    }
    
    /**
     * プレビュー終了
     */
    public final void stopPreview() {
    }
    
    /**
     * カメラプレビュー開始の実体
     * @param width
     * @param height
     */
    @androidx.annotation.WorkerThread()
    @android.annotation.SuppressLint(value = {"WrongThread"})
    private final void handleStartPreview(int width, int height) {
    }
    
    /**
     * カメラプレビュー終了の実体
     */
    @androidx.annotation.WorkerThread()
    private final void handleStopPreview() {
    }
    
    /**
     * 映像が更新されたときの通知用コールバックリスナー
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/serenegiant/widget/CameraDelegator$OnFrameAvailableListener;", "", "onFrameAvailable", "", "app_debug"})
    public static abstract interface OnFrameAvailableListener {
        
        public abstract void onFrameAvailable();
    }
    
    /**
     * カメラ映像をGLSurfaceViewへ描画するためのGLSurfaceView.Rendererインターフェース
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0001H&J\b\u0010\u0003\u001a\u00020\u0004H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/serenegiant/widget/CameraDelegator$ICameraRenderer;", "", "getInputSurface", "hasSurface", "", "onPreviewSizeChanged", "", "width", "", "height", "app_debug"})
    public static abstract interface ICameraRenderer {
        
        public abstract boolean hasSurface();
        
        public abstract void onPreviewSizeChanged(int width, int height);
        
        /**
         * カメラ映像受け取り用のSurface/SurfaceHolder/SurfaceTexture/SurfaceViewを取得
         * @return
         */
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.Object getInputSurface();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/serenegiant/widget/CameraDelegator$Companion;", "", "()V", "DEBUG", "", "DEFAULT_PREVIEW_HEIGHT", "", "DEFAULT_PREVIEW_WIDTH", "SCALE_CROP_CENTER", "SCALE_KEEP_ASPECT", "SCALE_KEEP_ASPECT_VIEWPORT", "SCALE_STRETCH_FIT", "TAG", "", "kotlin.jvm.PlatformType", "TARGET_FPS_MS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}