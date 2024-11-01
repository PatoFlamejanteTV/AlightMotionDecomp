package com.mbridge.msdk.video.signal;

/* loaded from: classes4.dex */
public interface f {
    void configurationChanged(int i8, int i9, int i10);

    boolean endCardShowing();

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardShowing();

    void readyStatus(int i8);

    void resizeMiniCard(int i8, int i9, int i10);

    boolean showAlertWebView();

    void showEndcard(int i8);

    void showMiniCard(int i8, int i9, int i10, int i11, int i12);

    void showVideoClickView(int i8);

    void showVideoEndCover();
}
