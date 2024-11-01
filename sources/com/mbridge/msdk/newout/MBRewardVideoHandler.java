package com.mbridge.msdk.newout;

import android.content.Context;
import com.mbridge.msdk.newreward.b.c;
import com.mbridge.msdk.newreward.b.d;

/* loaded from: classes4.dex */
public class MBRewardVideoHandler implements IMBRRewardVideoHandler {
    private c controller;
    private String unitId;

    public MBRewardVideoHandler(Context context, String str, String str2) {
        this.controller = null;
        this.controller = new d(94, str, str2, false);
        this.unitId = str2;
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public boolean isReady() {
        return this.controller.b();
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void load(String str) {
        this.controller.a(true, str);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void setRewardVideoListener(RewardVideoListener rewardVideoListener) {
        this.controller.a(rewardVideoListener);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void show(String str) {
        this.controller.a(str);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void load() {
        this.controller.a(true, "");
    }
}
