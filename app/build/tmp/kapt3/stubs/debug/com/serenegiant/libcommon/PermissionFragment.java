package com.serenegiant.libcommon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J+\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\tH\u0016\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/serenegiant/libcommon/PermissionFragment;", "Lcom/serenegiant/libcommon/BaseFragment;", "Lcom/serenegiant/dialog/RationalDialogV4$DialogResultListener;", "()V", "mCallback", "Lcom/serenegiant/system/PermissionUtils$PermissionCallback;", "mPermissions", "Lcom/serenegiant/system/PermissionUtils;", "checkPermissionAudio", "", "checkPermissionCamera", "checkPermissionLocation", "checkPermissionWriteExternalStorage", "internalOnPause", "", "internalOnResume", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogResult", "dialog", "Lcom/serenegiant/dialog/RationalDialogV4;", "permissions", "", "", "result", "(Lcom/serenegiant/dialog/RationalDialogV4;[Ljava/lang/String;Z)V", "requestPermissionsAll", "Companion", "app_debug"})
public final class PermissionFragment extends com.serenegiant.libcommon.BaseFragment implements com.serenegiant.dialog.RationalDialogV4.DialogResultListener {
    private com.serenegiant.system.PermissionUtils mPermissions;
    private final com.serenegiant.system.PermissionUtils.PermissionCallback mCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.libcommon.PermissionFragment.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    private static final java.lang.String[] LOCATION_PERMISSIONS = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    
    public PermissionFragment() {
        super();
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
    protected void internalOnResume() {
    }
    
    @java.lang.Override()
    protected void internalOnPause() {
    }
    
    private final void requestPermissionsAll() {
    }
    
    /**
     * check permission to access external storage
     * and request to show detail dialog to request permission
     *
     * @return true already have permission to access external storage
     */
    private final boolean checkPermissionWriteExternalStorage() {
        return false;
    }
    
    /**
     * check permission to access external storage
     * and request to show detail dialog to request permission
     *
     * @return true already have permission to access external storage
     */
    private final boolean checkPermissionCamera() {
        return false;
    }
    
    /**
     * check permission to record audio
     * and request to show detail dialog to request permission
     *
     * @return true already have permission to record audio
     */
    private final boolean checkPermissionAudio() {
        return false;
    }
    
    /**
     * check permission to access location info
     * and request to show detail dialog to request permission
     * @return true already have permission to access location
     */
    private final boolean checkPermissionLocation() {
        return false;
    }
    
    @java.lang.Override()
    public void onDialogResult(@org.jetbrains.annotations.NotNull()
    com.serenegiant.dialog.RationalDialogV4 dialog, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, boolean result) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/serenegiant/libcommon/PermissionFragment$Companion;", "", "()V", "DEBUG", "", "LOCATION_PERMISSIONS", "", "", "[Ljava/lang/String;", "TAG", "kotlin.jvm.PlatformType", "newInstance", "Lcom/serenegiant/libcommon/PermissionFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.serenegiant.libcommon.PermissionFragment newInstance() {
            return null;
        }
    }
}