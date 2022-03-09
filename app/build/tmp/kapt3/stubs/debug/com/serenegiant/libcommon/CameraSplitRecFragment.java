package com.serenegiant.libcommon;

import java.lang.System;

/**
 * MediaAVRecorderを使ったカメラ映像の録画テスト用Fragment
 * このテストFragmentではアプリ内で直接録画しているがCameraFragmentや
 * EffectCameraFragmentの様に録画処理部分はサービスとして実行するように
 * した方がアプリ終了時に再生できない動画ファイルができてしまうのを防止できる。
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\b\u0010\u001f\u001a\u00020\u001bH\u0014J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0014J*\u0010#\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u001bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/serenegiant/libcommon/CameraSplitRecFragment;", "Lcom/serenegiant/libcommon/AbstractCameraFragment;", "()V", "mAudioEncoder", "Lcom/serenegiant/media/IAudioEncoder;", "mAudioSampler", "Lcom/serenegiant/media/IAudioSampler;", "mEncoderListener", "Lcom/serenegiant/media/EncoderListener;", "mEncoderSurface", "Landroid/view/Surface;", "mRecorder", "Lcom/serenegiant/media/IRecorder;", "mRecorderCallback", "Lcom/serenegiant/media/IRecorder$RecorderCallback;", "mVideoEncoder", "Lcom/serenegiant/media/IVideoEncoder;", "createRecorder", "Lcom/serenegiant/media/Recorder;", "outputDir", "Landroidx/documentfile/provider/DocumentFile;", "audio_source", "", "audio_channels", "align16", "", "internalStartRecording", "", "internalStopRecording", "isRecording", "isRecordingSupported", "onFrameAvailable", "onLongClick", "view", "Landroid/view/View;", "startEncoder", "audioSource", "audioChannels", "stopEncoder", "Companion", "app_debug"})
public final class CameraSplitRecFragment extends com.serenegiant.libcommon.AbstractCameraFragment {
    private android.view.Surface mEncoderSurface;
    private com.serenegiant.media.IAudioSampler mAudioSampler;
    private com.serenegiant.media.IRecorder mRecorder;
    @kotlin.jvm.Volatile()
    private volatile com.serenegiant.media.IVideoEncoder mVideoEncoder;
    @kotlin.jvm.Volatile()
    private volatile com.serenegiant.media.IAudioEncoder mAudioEncoder;
    private final com.serenegiant.media.IRecorder.RecorderCallback mRecorderCallback = null;
    private final com.serenegiant.media.EncoderListener mEncoderListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.libcommon.CameraSplitRecFragment.Companion Companion = null;
    private static final boolean DEBUG = true;
    private static final java.lang.String TAG = null;
    
    /**
     * deprecatedのMediaAVSplitRecorderを使うか
     * 新しいMediaAVSplitRecorderV2を使うかを設定
     * trueならdeprecatedのMediaAVSplitRecorderを使う
     */
    private static final boolean USE_DEPRECATED = false;
    
    /**
     * 分割録画する際のおおよそのファイルサイズ
     */
    private static final long MAX_FILE_SIZE = 10485760L;
    
    public CameraSplitRecFragment() {
        super();
    }
    
    @java.lang.Override()
    protected boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return false;
    }
    
    @java.lang.Override()
    protected boolean isRecording() {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    protected void internalStartRecording() throws java.io.IOException {
    }
    
    @java.lang.Override()
    protected void internalStopRecording() {
    }
    
    @java.lang.Override()
    protected void onFrameAvailable() {
    }
    
    @java.lang.Override()
    protected boolean isRecordingSupported() {
        return false;
    }
    
    /**
     * create IRecorder instance for recording and prepare, start
     * @param outputDir
     * @param audioSource
     * @param audioChannels
     * @param align16
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final void startEncoder(androidx.documentfile.provider.DocumentFile outputDir, int audioSource, int audioChannels, boolean align16) throws java.io.IOException {
    }
    
    private final void stopEncoder() {
    }
    
    /**
     * create recorder and related encoder
     * @param outputDir
     * @param audio_source
     * @param audio_channels
     * @param align16
     * @return
     * @throws IOException
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final com.serenegiant.media.Recorder createRecorder(androidx.documentfile.provider.DocumentFile outputDir, int audio_source, int audio_channels, boolean align16) throws java.io.IOException {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/serenegiant/libcommon/CameraSplitRecFragment$Companion;", "", "()V", "DEBUG", "", "MAX_FILE_SIZE", "", "TAG", "", "kotlin.jvm.PlatformType", "USE_DEPRECATED", "newInstance", "Lcom/serenegiant/libcommon/CameraSplitRecFragment;", "layoutRes", "", "titleRes", "pipelineMode", "enablePipelineEncode", "enableFaceDetect", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.serenegiant.libcommon.CameraSplitRecFragment newInstance(@androidx.annotation.LayoutRes()
        int layoutRes, @androidx.annotation.StringRes()
        int titleRes, int pipelineMode, boolean enablePipelineEncode, boolean enableFaceDetect) {
            return null;
        }
    }
}