package com.mbridge.msdk.newinterstitial.out;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.mbridge.msdk.f.a;
import com.mbridge.msdk.out.MBridgeIds;

/* loaded from: classes4.dex */
public abstract class NewInterstitialWithCodeListener implements NewInterstitialListener {
    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
        onResourceLoadFailWithCode(mBridgeIds, a.a(PathInterpolatorCompat.MAX_NUM_POINTS, str), str);
    }

    public abstract void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i8, String str);

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, 3900, str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i8, String str);
}
