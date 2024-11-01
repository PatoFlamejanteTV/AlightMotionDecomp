package com.mbridge.msdk.playercommon;

/* loaded from: classes4.dex */
public interface VideoPlayerStatusListener {
    void onBufferingEnd();

    void onBufferingStart(String str);

    void onPlayCompleted();

    void onPlayError(String str);

    void onPlayProgress(int i8, int i9);

    void onPlayProgressMS(int i8, int i9);

    void onPlaySetDataSourceError(String str);

    void onPlayStarted(int i8);
}
