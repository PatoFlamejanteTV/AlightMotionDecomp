package com.mbridge.msdk.newreward.function.common;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class MBridgeDailyPlayModel {
    private final int mAdType;
    private final String mCountKey;
    private int mMaxDailyCap = 0;
    private final String mPlacementID;
    private final String mTimeKey;
    private final String mUnitID;

    public MBridgeDailyPlayModel(int i8, String str, String str2) {
        this.mAdType = i8;
        str = TextUtils.isEmpty(str) ? "null" : str;
        this.mPlacementID = str;
        str2 = TextUtils.isEmpty(str2) ? "null" : str2;
        this.mUnitID = str2;
        String str3 = i8 + "_" + str + "_" + str2;
        this.mCountKey = str3 + "_count";
        this.mTimeKey = str3 + "_time";
    }

    public void insertDailyCap() {
        long j8 = MBridgeSharedPreferenceModel.getInstance().getLong(this.mTimeKey, 0L);
        int integer = MBridgeSharedPreferenceModel.getInstance().getInteger(this.mCountKey, 0) + 1;
        if (j8 != 0 && System.currentTimeMillis() - j8 <= 86400000) {
            MBridgeSharedPreferenceModel.getInstance().putInteger(this.mCountKey, integer);
        } else {
            MBridgeSharedPreferenceModel.getInstance().putLong(this.mTimeKey, System.currentTimeMillis());
            MBridgeSharedPreferenceModel.getInstance().putInteger(this.mCountKey, integer);
        }
    }

    public boolean isOverDailyCap() {
        if (this.mMaxDailyCap <= 0) {
            return false;
        }
        long j8 = MBridgeSharedPreferenceModel.getInstance().getLong(this.mTimeKey, 0L);
        if (j8 == 0) {
            return false;
        }
        if (System.currentTimeMillis() - j8 > 86400000) {
            MBridgeSharedPreferenceModel.getInstance().putLong(this.mTimeKey, 0L);
            MBridgeSharedPreferenceModel.getInstance().putInteger(this.mCountKey, 0);
            return false;
        }
        if (MBridgeSharedPreferenceModel.getInstance().getInteger(this.mCountKey, 0) < this.mMaxDailyCap) {
            return false;
        }
        return true;
    }

    public void setMaxPlayCount(int i8) {
        this.mMaxDailyCap = i8;
    }
}
