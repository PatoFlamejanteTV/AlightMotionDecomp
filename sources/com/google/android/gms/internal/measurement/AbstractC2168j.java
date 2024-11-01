package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2168j {
    public static /* synthetic */ BigDecimal a(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return new BigDecimal(BigInteger.ZERO, 0);
        }
        return bigDecimal.stripTrailingZeros();
    }
}
