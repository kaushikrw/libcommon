package com.serenegiant.libcommon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0004J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0004J\u001c\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"H\u0004J\u0012\u0010#\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0004J\b\u0010$\u001a\u00020\u000fH\u0004J\u0010\u0010%\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0006\u0010&\u001a\u00020\u000fJ\u001a\u0010\'\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010(\u001a\u00020\"H\u0007J7\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020*2\b\b\u0001\u0010+\u001a\u00020*2\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060-\"\u0004\u0018\u00010\u0006H\u0004\u00a2\u0006\u0002\u0010.J7\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010/2\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060-\"\u0004\u0018\u00010\u0006H\u0004\u00a2\u0006\u0002\u00100R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/serenegiant/libcommon/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mAsyncHandler", "Landroid/os/Handler;", "mSync", "", "getMSync", "()Ljava/lang/Object;", "mToast", "Landroid/widget/Toast;", "mUIHandler", "mUiThread", "Ljava/lang/Thread;", "clearToast", "", "internalOnPause", "internalOnResume", "internalRelease", "onAttach", "context", "Landroid/content/Context;", "onBackPressed", "", "onDestroy", "onPause", "onResume", "onStart", "onStop", "popBackStack", "queueEvent", "task", "Ljava/lang/Runnable;", "delay", "", "removeEvent", "removeEventAll", "removeFromUiThread", "removeFromUiThreadAll", "runOnUiThread", "duration", "showToast", "", "msg", "args", "", "(II[Ljava/lang/Object;)V", "", "(ILjava/lang/String;[Ljava/lang/Object;)V", "Companion", "app_debug"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object mSync = null;
    
    /**
     * Handler for UI operation
     */
    private final android.os.Handler mUIHandler = null;
    private final java.lang.Thread mUiThread = null;
    private android.os.Handler mAsyncHandler;
    private android.widget.Toast mToast;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.libcommon.BaseFragment.Companion Companion = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.Object getMSync() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * actual methods of #onResume (for before Android 7)
     * #onStart(for Android 7 and later)
     * never call #onResume, #onStart in this method otherwise it raise infinite loop.
     * if you need, pls override this instead of #onResume/#onStart
     */
    protected void internalOnResume() {
    }
    
    /**
     * actual methods of #onPause (for before Android 7)
     * #onStop(for Android 7 and later)
     * never call #onResume, #onStart in this method otherwise it raise infinite loop.
     * if you need, pls override this instead of #onPause/#onStop
     */
    protected void internalOnPause() {
    }
    
    protected void internalRelease() {
    }
    
    /**
     * helper method to handle back key for Fragment
     * because originally there are no back key event on Fragment.
     * @return true: handled
     */
    public final boolean onBackPressed() {
        return false;
    }
    
    protected final void popBackStack() {
    }
    
    /**
     * helper method to run specific task on UI thread
     * @param task
     * @param duration
     */
    @kotlin.jvm.JvmOverloads()
    public final void runOnUiThread(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable task) {
    }
    
    /**
     * helper method to run specific task on UI thread
     * @param task
     * @param duration
     */
    @kotlin.jvm.JvmOverloads()
    public final void runOnUiThread(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable task, long duration) {
    }
    
    /**
     * remove specific task from UI thread if it is not run yet.
     * @param task
     */
    public final void removeFromUiThread(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable task) {
    }
    
    /**
     * remove all pending task from UI thread
     */
    public final void removeFromUiThreadAll() {
    }
    
    /**
     * helper method to run specific Runnable on worker thread
     * if same Runnable is waiting to execute, it will removed.
     * @param task
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalStateException.class})
    protected final void queueEvent(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable task, long delay) throws java.lang.IllegalStateException {
    }
    
    /**
     * helper method to remove specific Runnable from worker thread if it does not run yet.
     * @param task
     */
    protected final void removeEvent(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable task) {
    }
    
    /**
     * helper method to remove all pending Runnable/message from worker thread
     */
    protected final void removeEventAll() {
    }
    
    /**
     * Toastでメッセージを表示
     * @param msg
     * @param args
     */
    protected final void showToast(int duration, @org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.Object... args) {
    }
    
    /**
     * Toastでメッセージを表示
     * @param msg
     */
    protected final void showToast(int duration, @androidx.annotation.StringRes()
    int msg, @org.jetbrains.annotations.NotNull()
    java.lang.Object... args) {
    }
    
    /**
     * Toastが表示されていればキャンセルする
     */
    protected final void clearToast() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/serenegiant/libcommon/BaseFragment$Companion;", "", "()V", "DEBUG", "", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}