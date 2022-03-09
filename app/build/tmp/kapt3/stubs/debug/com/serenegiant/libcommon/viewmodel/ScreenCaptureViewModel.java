package com.serenegiant.libcommon.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0002 !B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001aR)\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\tR\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/serenegiant/libcommon/viewmodel/ScreenCaptureViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "isChecked", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "isChecked$delegate", "Lkotlin/Lazy;", "<set-?>", "isReceived", "()Z", "isRecording", "setRecording", "(Z)V", "mBroadcastReceiver", "Lcom/serenegiant/libcommon/viewmodel/ScreenCaptureViewModel$MyBroadcastReceiver;", "recordingLabel", "Landroidx/lifecycle/LiveData;", "", "getRecordingLabel", "()Landroidx/lifecycle/LiveData;", "onCleared", "", "queryRecordingStatus", "startScreenCapture", "data", "Landroid/content/Intent;", "stopScreenCapture", "Companion", "MyBroadcastReceiver", "app_debug"})
public final class ScreenCaptureViewModel extends androidx.lifecycle.AndroidViewModel {
    private boolean isRecording = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy isChecked$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> recordingLabel = null;
    private final com.serenegiant.libcommon.viewmodel.ScreenCaptureViewModel.MyBroadcastReceiver mBroadcastReceiver = null;
    private boolean isReceived = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.libcommon.viewmodel.ScreenCaptureViewModel.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    
    public ScreenCaptureViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final boolean isRecording() {
        return false;
    }
    
    public final void setRecording(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isChecked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getRecordingLabel() {
        return null;
    }
    
    public final boolean isReceived() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    /**
     * スクリーンキャプチャー開始要求
     * @param data
     */
    public final void startScreenCapture(@org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    /**
     * スクリーンキャプチャー終了要求
     */
    public final void stopScreenCapture() {
    }
    
    /**
     * スクリーンキャプチャの状態要求
     */
    public final void queryRecordingStatus() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/serenegiant/libcommon/viewmodel/ScreenCaptureViewModel$MyBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/serenegiant/libcommon/viewmodel/ScreenCaptureViewModel;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    final class MyBroadcastReceiver extends android.content.BroadcastReceiver {
        
        public MyBroadcastReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/serenegiant/libcommon/viewmodel/ScreenCaptureViewModel$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}