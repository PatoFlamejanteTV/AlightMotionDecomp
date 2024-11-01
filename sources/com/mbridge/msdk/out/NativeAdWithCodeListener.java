package com.mbridge.msdk.out;

import com.mbridge.msdk.f.a;
import com.mbridge.msdk.out.NativeListener;

/* loaded from: classes4.dex */
public abstract class NativeAdWithCodeListener implements NativeListener.NativeAdListener {
    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        onAdLoadErrorWithCode(a.a(1000, str), str);
    }

    public abstract void onAdLoadErrorWithCode(int i8, String str);
}
