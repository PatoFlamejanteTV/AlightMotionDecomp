package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2224p3 extends AbstractC2163i3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2224p3(C2232q3 c2232q3, String str, Boolean bool, boolean z8) {
        super(c2232q3, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2163i3
    final /* synthetic */ Object g(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (G2.f16310c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (G2.f16311d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
