package com.mbridge.msdk.out;

import com.mbridge.msdk.f.a;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public abstract class MBSplashLoadWithCodeListener implements MBSplashLoadListener {
    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str, int i8) {
        onLoadFailedWithCode(mBridgeIds, a.a(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS, str), str, i8);
    }

    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i8, String str, int i9);
}
