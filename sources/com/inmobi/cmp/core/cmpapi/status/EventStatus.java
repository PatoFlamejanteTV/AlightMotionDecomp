package com.inmobi.cmp.core.cmpapi.status;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes4.dex */
public enum EventStatus {
    TC_LOADED("tcloaded"),
    CMP_UI_SHOWN("cmpuishown"),
    USER_ACTION_COMPLETE("useractioncomplete");

    private final String value;

    EventStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
