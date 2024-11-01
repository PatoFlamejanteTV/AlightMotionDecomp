package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2241r5 extends AbstractC2218o5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2241r5() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2218o5
    public final void m() {
        if (!o()) {
            if (a() <= 0) {
                Iterator it = h().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            } else {
                android.support.v4.media.a.a(g(0).getKey());
                throw null;
            }
        }
        super.m();
    }
}
