package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

/* loaded from: classes4.dex */
public final class a implements InterVideoOutListener {

    /* renamed from: a, reason: collision with root package name */
    private g f23206a;

    /* renamed from: b, reason: collision with root package name */
    private String f23207b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23208c;

    public a(g gVar, String str, boolean z8) {
        this.f23206a = gVar;
        this.f23207b = str;
        this.f23208c = z8;
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        g gVar = this.f23206a;
        if (gVar != null) {
            gVar.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        g gVar = this.f23206a;
        if (gVar != null) {
            gVar.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        g gVar = this.f23206a;
        if (gVar != null) {
            gVar.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        g gVar = this.f23206a;
        if (gVar != null) {
            gVar.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onShowFail(com.mbridge.msdk.foundation.same.report.d.b bVar, MBridgeIds mBridgeIds, String str) {
        g gVar = this.f23206a;
        if (gVar != null) {
            gVar.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoAdClicked(boolean z8, MBridgeIds mBridgeIds) {
        g gVar = this.f23206a;
        if (gVar != null) {
            gVar.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        g gVar = this.f23206a;
        if (gVar != null) {
            gVar.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        g gVar = this.f23206a;
        if (gVar != null) {
            gVar.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.videocommon.listener.InterVideoOutListener
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        g gVar = this.f23206a;
        if (gVar != null) {
            gVar.onVideoLoadSuccess(mBridgeIds);
        }
    }

    public a(g gVar) {
        this.f23207b = "";
        this.f23206a = gVar;
    }
}
