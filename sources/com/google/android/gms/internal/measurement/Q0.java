package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class Q0 extends T0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f16426a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private boolean f16427b;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:            r4 = r4.get(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_AD_R);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object k(android.os.Bundle r4, java.lang.Class r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L43
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L43
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Q0.k(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void f(Bundle bundle) {
        synchronized (this.f16426a) {
            try {
                try {
                    this.f16426a.set(bundle);
                    this.f16427b = true;
                } finally {
                    this.f16426a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle i(long j8) {
        Bundle bundle;
        synchronized (this.f16426a) {
            if (!this.f16427b) {
                try {
                    this.f16426a.wait(j8);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f16426a.get();
        }
        return bundle;
    }

    public final Long s0(long j8) {
        return (Long) k(i(j8), Long.class);
    }

    public final String t0(long j8) {
        return (String) k(i(j8), String.class);
    }
}
