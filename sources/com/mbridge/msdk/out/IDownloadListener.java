package com.mbridge.msdk.out;

/* loaded from: classes4.dex */
public interface IDownloadListener {
    void onEnd(int i8, int i9, String str);

    void onProgressUpdate(int i8);

    void onStart();

    void onStatus(int i8);
}
