package com.mbridge.msdk.out;

import com.mbridge.msdk.video.bt.module.b.g;

/* loaded from: classes4.dex */
public interface RewardVideoListener extends g {
    @Override // com.mbridge.msdk.video.bt.module.b.g
    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    @Override // com.mbridge.msdk.video.bt.module.b.g
    void onAdShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.b.g
    void onEndcardShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.b.g
    void onLoadSuccess(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.b.g
    void onShowFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.bt.module.b.g
    void onVideoAdClicked(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.b.g
    void onVideoComplete(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.b.g
    void onVideoLoadFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.bt.module.b.g
    void onVideoLoadSuccess(MBridgeIds mBridgeIds);
}
