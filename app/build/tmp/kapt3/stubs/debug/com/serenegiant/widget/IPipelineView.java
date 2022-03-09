package com.serenegiant.widget;

import java.lang.System;

/**
 * IPipelineSource/IPipelineで描画処理分配処理を行うViewの共通メソッドを定義するインターフェース
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/serenegiant/widget/IPipelineView;", "", "addPipeline", "", "pipeline", "Lcom/serenegiant/glpipeline/IPipeline;", "getGLManager", "Lcom/serenegiant/glutils/GLManager;", "Companion", "app_debug"})
public abstract interface IPipelineView {
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.widget.IPipelineView.Companion Companion = null;
    public static final int PREVIEW_ONLY = 0;
    public static final int EFFECT_ONLY = 1;
    public static final int EFFECT_PLUS_SURFACE = 2;
    
    /**
     * 指定したIPipelineオブジェクトをパイプラインチェーンに追加
     * (削除するときはIPipeline#removeを使うこと)
     * @param pipeline
     */
    public abstract void addPipeline(@org.jetbrains.annotations.NotNull()
    com.serenegiant.glpipeline.IPipeline pipeline);
    
    /**
     * IPipeline/IPipelineSourceの処理に使うGLManagerインスタンスを取得する
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.serenegiant.glutils.GLManager getGLManager();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/serenegiant/widget/IPipelineView$Companion;", "", "()V", "EFFECT_ONLY", "", "EFFECT_PLUS_SURFACE", "PREVIEW_ONLY", "app_debug"})
    public static final class Companion {
        public static final int PREVIEW_ONLY = 0;
        public static final int EFFECT_ONLY = 1;
        public static final int EFFECT_PLUS_SURFACE = 2;
        
        private Companion() {
            super();
        }
    }
}