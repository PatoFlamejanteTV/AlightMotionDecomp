package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2216o3 extends AbstractC2163i3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2216o3(C2232q3 c2232q3, String str, Double d8, boolean z8) {
        super(c2232q3, str, d8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2163i3
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Double g(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
