package com.serenegiant.libcommon;

import java.lang.System;

/**
 * RecordingServiceを使った録画対応カメラ画面Fragment
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/serenegiant/libcommon/CameraFragment;", "Lcom/serenegiant/libcommon/AbstractCameraFragment;", "()V", "mCallback", "Lcom/serenegiant/service/ServiceRecorder$Callback;", "mRecorder", "Lcom/serenegiant/service/ServiceRecorder;", "mRecordingSurfaceId", "", "internalStartRecording", "", "internalStopRecording", "isRecording", "", "onFrameAvailable", "onLongClick", "view", "Landroid/view/View;", "Companion", "app_debug"})
public final class CameraFragment extends com.serenegiant.libcommon.AbstractCameraFragment {
    private com.serenegiant.service.ServiceRecorder mRecorder;
    private int mRecordingSurfaceId = 0;
    private final com.serenegiant.service.ServiceRecorder.Callback mCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.libcommon.CameraFragment.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    
    public CameraFragment() {
        super();
    }
    
    @java.lang.Override()
    protected boolean isRecording() {
        return false;
    }
    
    @java.lang.Override()
    protected void internalStartRecording() {
    }
    
    @java.lang.Override()
    protected void internalStopRecording() {
    }
    
    @java.lang.Override()
    protected void onFrameAvailable() {
    }
    
    @java.lang.Override()
    protected boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/serenegiant/libcommon/CameraFragment$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "newInstance", "Lcom/serenegiant/libcommon/CameraFragment;", "layoutRes", "", "titleRes", "pipelineMode", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.serenegiant.libcommon.CameraFragment newInstance(@androidx.annotation.LayoutRes()
        int layoutRes, @androidx.annotation.StringRes()
        int titleRes, int pipelineMode) {
            return null;
        }
    }
}