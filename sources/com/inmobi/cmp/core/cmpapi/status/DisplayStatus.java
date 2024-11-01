package com.inmobi.cmp.core.cmpapi.status;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes4.dex */
public enum DisplayStatus {
    VISIBLE("visible"),
    HIDDEN("hidden"),
    DISABLED("disabled");

    private final String value;

    DisplayStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
