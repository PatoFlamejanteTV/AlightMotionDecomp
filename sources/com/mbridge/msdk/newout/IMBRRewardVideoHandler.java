package com.mbridge.msdk.newout;

/* loaded from: classes4.dex */
public interface IMBRRewardVideoHandler {
    boolean isReady();

    void load();

    void load(String str);

    void setRewardVideoListener(RewardVideoListener rewardVideoListener);

    void show(String str);
}
