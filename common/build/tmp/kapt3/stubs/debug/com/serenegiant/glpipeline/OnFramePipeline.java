package com.serenegiant.glpipeline;

import java.lang.System;

/**
 * 映像が更新されたときのコースバックインターフェースを呼び出すだけのIPipeline実装
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/serenegiant/glpipeline/OnFramePipeline;", "Lcom/serenegiant/glpipeline/ProxyPipeline;", "mListener", "Lcom/serenegiant/glpipeline/OnFramePipeline$OnFrameAvailableListener;", "(Lcom/serenegiant/glpipeline/OnFramePipeline$OnFrameAvailableListener;)V", "onFrameAvailable", "", "isOES", "", "texId", "", "texMatrix", "", "OnFrameAvailableListener", "common_debug"})
public final class OnFramePipeline extends com.serenegiant.glpipeline.ProxyPipeline {
    private final com.serenegiant.glpipeline.OnFramePipeline.OnFrameAvailableListener mListener = null;
    
    public OnFramePipeline(@org.jetbrains.annotations.NotNull()
    com.serenegiant.glpipeline.OnFramePipeline.OnFrameAvailableListener mListener) {
        super();
    }
    
    @java.lang.Override()
    public void onFrameAvailable(boolean isOES, int texId, @org.jetbrains.annotations.NotNull()
    float[] texMatrix) {
    }
    
    /**
     * 映像が更新されたときの通知用コールバックリスナー
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/serenegiant/glpipeline/OnFramePipeline$OnFrameAvailableListener;", "", "onFrameAvailable", "", "common_debug"})
    public static abstract interface OnFrameAvailableListener {
        
        public abstract void onFrameAvailable();
    }
}