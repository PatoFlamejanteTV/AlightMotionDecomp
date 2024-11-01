package com.mbridge.msdk.out;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.mbridge.msdk.f.a;

/* loaded from: classes4.dex */
public abstract class RewardVideoWithCodeListener implements RewardVideoListener {
    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, 3900, str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i8, String str);

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        onVideoLoadFailWithCode(mBridgeIds, a.a(PathInterpolatorCompat.MAX_NUM_POINTS, str), str);
    }

    public abstract void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i8, String str);
}
