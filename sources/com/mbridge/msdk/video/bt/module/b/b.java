package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class b implements h {

    /* renamed from: b, reason: collision with root package name */
    public boolean f23209b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23210c = false;

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        ad.a("ShowRewardListener", "onAdShow");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void b(String str, String str2) {
        ad.a("ShowRewardListener", "onEndcardShow: " + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
        ad.a("ShowRewardListener", "onAdClose:isCompleteView:" + z8 + ",reward:" + cVar);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        ad.a("ShowRewardListener", "onShowFail:" + str);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(boolean z8, String str, String str2) {
        ad.a("ShowRewardListener", "onVideoAdClicked:" + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(String str, String str2) {
        ad.a("ShowRewardListener", "onVideoComplete: " + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(boolean z8, int i8) {
        ad.a("ShowRewardListener", "onAdCloseWithIVReward: " + z8 + "  " + i8);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(int i8, String str, String str2) {
        ad.a("ShowRewardListener", "onAutoLoad: " + str2);
    }
}
