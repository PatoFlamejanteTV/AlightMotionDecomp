package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2354g4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f17830a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17831b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2354g4(F3 f32, com.google.android.gms.internal.measurement.U0 u02) {
        this.f17830a = u02;
        this.f17831b = f32;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.F3 r0 = r7.f17831b
            com.google.android.gms.measurement.internal.p5 r0 = r0.r()
            com.google.android.gms.measurement.internal.z2 r1 = r0.e()
            com.google.android.gms.measurement.internal.A3 r1 = r1.M()
            boolean r1 = r1.z()
            r2 = 0
            if (r1 != 0) goto L24
            com.google.android.gms.measurement.internal.n2 r0 = r0.a()
            com.google.android.gms.measurement.internal.p2 r0 = r0.M()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L22:
            r0 = r2
            goto L55
        L24:
            com.google.android.gms.measurement.internal.z2 r1 = r0.e()
            V.d r3 = r0.x()
            long r3 = r3.currentTimeMillis()
            boolean r1 = r1.z(r3)
            if (r1 != 0) goto L22
            com.google.android.gms.measurement.internal.z2 r1 = r0.e()
            com.google.android.gms.measurement.internal.A2 r1 = r1.f18160s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L47
            goto L22
        L47:
            com.google.android.gms.measurement.internal.z2 r0 = r0.e()
            com.google.android.gms.measurement.internal.A2 r0 = r0.f18160s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L55:
            if (r0 == 0) goto L69
            com.google.android.gms.measurement.internal.F3 r1 = r7.f17831b
            com.google.android.gms.measurement.internal.S2 r1 = r1.f18099a
            com.google.android.gms.measurement.internal.d6 r1 = r1.L()
            com.google.android.gms.internal.measurement.U0 r2 = r7.f17830a
            long r3 = r0.longValue()
            r1.Q(r2, r3)
            return
        L69:
            com.google.android.gms.internal.measurement.U0 r0 = r7.f17830a     // Catch: android.os.RemoteException -> L6f
            r0.f(r2)     // Catch: android.os.RemoteException -> L6f
            return
        L6f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.F3 r1 = r7.f17831b
            com.google.android.gms.measurement.internal.S2 r1 = r1.f18099a
            com.google.android.gms.measurement.internal.n2 r1 = r1.a()
            com.google.android.gms.measurement.internal.p2 r1 = r1.G()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC2354g4.run():void");
    }
}
