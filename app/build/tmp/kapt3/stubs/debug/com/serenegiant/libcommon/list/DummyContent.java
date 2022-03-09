package com.serenegiant.libcommon.list;

import java.lang.System;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/serenegiant/libcommon/list/DummyContent;", "", "()V", "ITEMS", "", "Lcom/serenegiant/libcommon/list/DummyContent$DummyItem;", "addItem", "", "item", "createItems", "context", "Landroid/content/Context;", "idItems", "", "DummyItem", "app_debug"})
public final class DummyContent {
    @org.jetbrains.annotations.NotNull()
    public static final com.serenegiant.libcommon.list.DummyContent INSTANCE = null;
    
    /**
     * An array of sample (dummy) items.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final java.util.List<com.serenegiant.libcommon.list.DummyContent.DummyItem> ITEMS = null;
    
    private DummyContent() {
        super();
    }
    
    public final void createItems(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.ArrayRes()
    int idItems) {
    }
    
    private final void addItem(com.serenegiant.libcommon.list.DummyContent.DummyItem item) {
    }
    
    /**
     * A dummy item representing a piece of content.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/serenegiant/libcommon/list/DummyContent$DummyItem;", "", "id", "", "content", "", "details", "(ILjava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDetails", "getId", "()I", "toString", "app_debug"})
    public static final class DummyItem {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String content = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String details = null;
        
        public DummyItem(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String content, @org.jetbrains.annotations.Nullable()
        java.lang.String details) {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContent() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
}