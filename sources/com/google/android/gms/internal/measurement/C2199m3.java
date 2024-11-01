package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2199m3 extends AbstractC2163i3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2199m3(C2232q3 c2232q3, String str, Long l8, boolean z8) {
        super(c2232q3, str, l8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2163i3
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Long g(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
