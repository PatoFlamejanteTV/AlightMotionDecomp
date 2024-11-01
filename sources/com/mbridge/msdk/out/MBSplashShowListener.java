package com.mbridge.msdk.out;

/* loaded from: classes4.dex */
public interface MBSplashShowListener {
    void onAdClicked(MBridgeIds mBridgeIds);

    void onAdTick(MBridgeIds mBridgeIds, long j8);

    void onDismiss(MBridgeIds mBridgeIds, int i8);

    void onShowFailed(MBridgeIds mBridgeIds, String str);

    void onShowSuccessed(MBridgeIds mBridgeIds);

    void onZoomOutPlayFinish(MBridgeIds mBridgeIds);

    void onZoomOutPlayStart(MBridgeIds mBridgeIds);
}
