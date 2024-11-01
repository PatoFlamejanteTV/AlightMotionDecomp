package com.inmobi.cmp.core.cmpapi.status;

import androidx.annotation.Keep;
import com.mbridge.msdk.foundation.entity.CampaignEx;

@Keep
/* loaded from: classes4.dex */
public enum CmpStatus {
    STUB("stub"),
    LOADING("loading"),
    LOADED("loaded"),
    ERROR(CampaignEx.JSON_NATIVE_VIDEO_ERROR);

    private final String value;

    CmpStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
