package com.mbridge.msdk.out;

import com.mbridge.msdk.f.a;

/* loaded from: classes4.dex */
public abstract class NativeAdvancedAdWithCodeListener implements NativeAdvancedAdListener {
    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        onLoadFailedWithCode(mBridgeIds, a.a(6000, str), str);
    }

    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i8, String str);
}
