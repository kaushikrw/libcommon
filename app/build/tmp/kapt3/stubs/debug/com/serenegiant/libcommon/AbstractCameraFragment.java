package com.serenegiant.libcommon;

import java.lang.System;

/**
 * 内蔵カメラへアクセスして表示するための基本クラス
 * 録画の開始/停止の実際の処理以外を実装
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\"H\u0004J\b\u0010(\u001a\u00020\u0004H\u0005J\b\u0010)\u001a\u00020\"H\u0016J\b\u0010*\u001a\u00020\"H\u0016J\b\u0010+\u001a\u00020\"H$J\b\u0010,\u001a\u00020\"H$J\b\u0010-\u001a\u00020\u0004H$J\b\u0010.\u001a\u00020\u0004H\u0014J\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\"2\u0006\u00103\u001a\u000204H\u0004J&\u00105\u001a\u0004\u0018\u0001042\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020\"H$J\u0010\u0010=\u001a\u00020\u00042\u0006\u00103\u001a\u000204H\u0014J\u001a\u0010>\u001a\u00020\"2\u0006\u00103\u001a\u0002042\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0012\u0010?\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010@\u001a\u00020\"H\u0002J\b\u0010A\u001a\u00020\"H\u0004J\b\u0010B\u001a\u00020\"H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\n8EX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0014\u0010\u001f\u001a\u00020\n8EX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\f\u00a8\u0006D"}, d2 = {"Lcom/serenegiant/libcommon/AbstractCameraFragment;", "Lcom/serenegiant/libcommon/BaseFragment;", "()V", "enableFaceDetect", "", "getEnableFaceDetect", "()Z", "enablePipelineEncode", "getEnablePipelineEncode", "layoutXml", "", "getLayoutXml", "()I", "mCameraView", "Lcom/serenegiant/widget/ICameraView;", "getMCameraView", "()Lcom/serenegiant/widget/ICameraView;", "setMCameraView", "(Lcom/serenegiant/widget/ICameraView;)V", "mOnClickListener", "Landroid/view/View$OnClickListener;", "mOnFrameAvailableListener", "Lcom/serenegiant/widget/CameraDelegator$OnFrameAvailableListener;", "mOnLongClickListener", "Landroid/view/View$OnLongClickListener;", "mRecordButton", "Landroid/widget/ImageButton;", "mScaleModeView", "Landroid/widget/TextView;", "pipelineMode", "getPipelineMode", "titleRes", "getTitleRes", "addSurface", "", "surface", "Landroid/view/Surface;", "maxFps", "Lcom/serenegiant/math/Fraction;", "clearRecordingState", "hasPermission", "internalOnPause", "internalOnResume", "internalStartRecording", "internalStopRecording", "isRecording", "isRecordingSupported", "onAttach", "context", "Landroid/content/Context;", "onClick", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFrameAvailable", "onLongClick", "onViewCreated", "removeSurface", "startRecording", "stopRecording", "updateScaleModeText", "Companion", "app_debug"})
public abstract class AbstractCameraFragment extends com.serenegiant.libcommon.BaseFragment {
    
    /**
     * for camera preview display
     */
    @org.jetbrains.annotations.Nullable()
    private com.serenegiant.widget.ICameraView mCameraView;
    
    /**
     * for scale mode display
     */
    private android.widget.TextView mScaleModeView;
    
    /**
     * button for start/stop recording
     */
    private android.widget.ImageButton mRecordButton;
    
    /**
     * method when touch record button
     */
    private final android.view.View.OnClickListener mOnClickListener = null;
    private final android.view.View.OnLongClickListener mOnLongClickListener = null;
    private final com.serenegiant.widget.CameraDelegator.OnFrameAvailableListener mOnFrameAvailableListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.libcommon.AbstractCameraFragment.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    
    /**
     * video resolution
     */
    public static final int VIDEO_WIDTH = 1280;
    public static final int VIDEO_HEIGHT = 720;
    
    /**
     * video frame rate
     */
    public static final int VIDEO_FPS = 30;
    
    /**
     * Audio recording settings
     */
    public static final int SAMPLE_RATE = 44100;
    public static final int CHANNEL_COUNT = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_DIR_NAME = "libcommon";
    
    /**
     * access code for secondary storage etc.
     */
    public static final int REQUEST_ACCESS_SD = 12345;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARGS_KEY_LAYOUT_ID = "LAYOUT_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARGS_KEY_TITLE_ID = "TITLE_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARGS_KEY_PIPELINE_MODE = "PIPELINE_MODE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARGS_KEY_ENABLE_PIPELINE_RECORD = "ENABLE_PIPELINE_RECORD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARGS_KEY_ENABLE_FACE_DETECT = "ENABLE_FACE_DETECT";
    
    public AbstractCameraFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.serenegiant.widget.ICameraView getMCameraView() {
        return null;
    }
    
    protected final void setMCameraView(@org.jetbrains.annotations.Nullable()
    com.serenegiant.widget.ICameraView p0) {
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
    public void internalOnResume() {
    }
    
    @java.lang.Override()
    public void internalOnPause() {
    }
    
    protected boolean isRecordingSupported() {
        return false;
    }
    
    @androidx.annotation.LayoutRes()
    protected final int getLayoutXml() {
        return 0;
    }
    
    @androidx.annotation.StringRes()
    protected final int getTitleRes() {
        return 0;
    }
    
    private final int getPipelineMode() {
        return 0;
    }
    
    protected final boolean getEnablePipelineEncode() {
        return false;
    }
    
    protected final boolean getEnableFaceDetect() {
        return false;
    }
    
    protected final void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    protected boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return false;
    }
    
    private final void updateScaleModeText() {
    }
    
    protected void addSurface(@org.jetbrains.annotations.Nullable()
    android.view.Surface surface, @org.jetbrains.annotations.Nullable()
    com.serenegiant.math.Fraction maxFps) {
    }
    
    /**
     * request remove Surface
     * @param surface // id usually use Surface#hashCode
     */
    public void removeSurface(@org.jetbrains.annotations.Nullable()
    android.view.Surface surface) {
    }
    
    protected abstract boolean isRecording();
    
    /**
     * start recording
     * This is a sample project and call this on UI thread to avoid being complicated
     * but basically this should be called on private thread because prepareing
     * of encoder is heavy work
     */
    private final void startRecording() {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    protected abstract void internalStartRecording() throws java.io.IOException;
    
    /**
     * request stop recording
     */
    protected final void stopRecording() {
    }
    
    protected abstract void internalStopRecording();
    
    protected final void clearRecordingState() {
    }
    
    protected abstract void onFrameAvailable();
    
    /**
     * 録画に必要なパーミッションを持っているかどうか
     * パーミッションの要求はしない
     * @return
     */
    @android.annotation.SuppressLint(value = {"NewApi"})
    protected final boolean hasPermission() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/serenegiant/libcommon/AbstractCameraFragment$Companion;", "", "()V", "APP_DIR_NAME", "", "ARGS_KEY_ENABLE_FACE_DETECT", "ARGS_KEY_ENABLE_PIPELINE_RECORD", "ARGS_KEY_LAYOUT_ID", "ARGS_KEY_PIPELINE_MODE", "ARGS_KEY_TITLE_ID", "CHANNEL_COUNT", "", "DEBUG", "", "REQUEST_ACCESS_SD", "SAMPLE_RATE", "TAG", "kotlin.jvm.PlatformType", "VIDEO_FPS", "VIDEO_HEIGHT", "VIDEO_WIDTH", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}