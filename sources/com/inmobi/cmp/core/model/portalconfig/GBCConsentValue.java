package com.inmobi.cmp.core.model.portalconfig;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes4.dex */
public enum GBCConsentValue {
    GRANTED("GRANTED"),
    DENIED("DENIED");

    private final String value;

    GBCConsentValue(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
